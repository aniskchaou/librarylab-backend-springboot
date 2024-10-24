package com.dev.delta.controllers;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

import com.dev.delta.dto.AuthorPublicationDTO;
import com.dev.delta.dto.ChartData;
import com.dev.delta.dto.MediaTypeCountDTO;
import com.dev.delta.dto.output.CategoryDto;
import com.dev.delta.dto.output.MediaTypeDto;
import com.dev.delta.entities.*;
import com.dev.delta.repositories.BookRepository;
import com.dev.delta.repositories.CategoryBookRepository;
import com.dev.delta.repositories.MediaTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.dev.delta.repositories.ImageModelrepository;
import com.dev.delta.services.BookService;
import com.dev.delta.util.ImageUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("book")
@CrossOrigin(origins = "*")
@Api(value = "BookController", description = " this is the Book controller class")

/**
 * Book Controller
 * 
 * @author Admin
 *
 */

public class BookController {

	/**
	 * BookService
	 */
	@Autowired
	BookService bookService;

	@Autowired
	CategoryBookRepository categoryRepository;

	/**
	 * ImageModelrepository
	 */
	@Autowired
	ImageModelrepository imageRepository;

	@Autowired
	BookRepository bookRepository;

	@Autowired
	MediaTypeRepository mediaTypeRepository;

	@GetMapping("/archived")
	public ResponseEntity<List<CatalogItem>> getArchivedBook() throws Exception {

		List<CatalogItem> catalogItemRes = bookService.findArchivedBook();
		return new ResponseEntity<List<CatalogItem>>(catalogItemRes, HttpStatus.OK);

	}

	@GetMapping("/destroyed")
	public ResponseEntity<List<CatalogItem>> getDestroyedBook() throws Exception {

		List<CatalogItem> catalogItemRes = bookService.findDestroyedBook();
		return new ResponseEntity<List<CatalogItem>>(catalogItemRes, HttpStatus.OK);

	}

	@GetMapping("/groupbyauthors")
	public ResponseEntity<List<CatalogItem>> groupByAuthors() throws Exception {

		List<CatalogItem> catalogItemRes = bookService.groupByAuthors();
		return new ResponseEntity<List<CatalogItem>>(catalogItemRes, HttpStatus.OK);

	}

	@GetMapping("/groupbypublishers")
	public ResponseEntity<List<CatalogItem>> groupByPublishers() throws Exception {

		List<CatalogItem> catalogItemRes = bookService.groupByPublishers();
		return new ResponseEntity<List<CatalogItem>>(catalogItemRes, HttpStatus.OK);

	}

	@GetMapping("/groupbycategories")
	public ResponseEntity<List<CatalogItem>> groupByCategories() throws Exception {

		List<CatalogItem> catalogItemRes = bookService.groupByCategories();
		return new ResponseEntity<List<CatalogItem>>(catalogItemRes, HttpStatus.OK);

	}

	@GetMapping("/groupbyeditionyears")
	public ResponseEntity<List<CatalogItem>> groupByEditionYear() throws Exception {

		List<CatalogItem> catalogItemRes = bookService.groupByEditionYear();
		return new ResponseEntity<List<CatalogItem>>(catalogItemRes, HttpStatus.OK);

	}

	/**
	 * 
	 * @param projectCatalogItem
	 * @param result
	 * @return
	 */
	@ApiOperation(value = " add book ")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "success"),
			@ApiResponse(code = 404, message = "not found") })
	@PostMapping("/create")
	public ResponseEntity<?> addBook(@Validated @RequestBody CatalogItem projectCatalogItem, BindingResult result) {

		if (result.hasErrors()) {
			Map<String, String> errorMap = new HashMap<String, String>();
			for (FieldError error : result.getFieldErrors()) {
				errorMap.put(error.getField(), error.getDefaultMessage());
			}
			return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
		}

		CatalogItem newPT = bookService.saveOrUpdate(projectCatalogItem);
		return new ResponseEntity<CatalogItem>(newPT, HttpStatus.CREATED);
	}

	/**
	 * filterBook
	 * 
	 * @param edition_year
	 * @param publishing_year
	 * @param publishing_place
	 * @param number_of_pages
	 * @return
	 */
	@ApiOperation(value = " filter book ")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "success"),
			@ApiResponse(code = 404, message = "not found") })
	@GetMapping("/filter/{edition_year}/{publishing_year}/{publishing_place}/{number_of_pages}")
	public ResponseEntity<CatalogItem> filterBook(@PathVariable String edition_year, @PathVariable String publishing_year,
                                                  @PathVariable String publishing_place, @PathVariable String number_of_pages) {

		CatalogItem catalogItemRes = bookService.filterBook(edition_year, publishing_year, publishing_place, number_of_pages);
		// System.out.println(bookRes.toString());
		return new ResponseEntity<CatalogItem>(catalogItemRes, HttpStatus.OK);

	}

	@ApiOperation(value = " filter book ")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "success"),
			@ApiResponse(code = 404, message = "not found") })
	@GetMapping("/bookreport/{edition_year}/{authorId}/{publisherId}/{categoryId}")
	public ResponseEntity<List<CatalogItem>> filterBookByCriteria(@PathVariable String edition_year,
                                                                  @PathVariable int authorId, @PathVariable int publisherId, @PathVariable int categoryId) {

		List<CatalogItem> catalogItemRes = bookService.filterBookByCriteria(edition_year, authorId, publisherId, categoryId);
		// System.out.println(bookRes.toString());
		return new ResponseEntity<List<CatalogItem>>(catalogItemRes, HttpStatus.OK);

	}

	/**
	 * getAllBooks
	 * 
	 * @return
	 */
	@ApiOperation(value = " find books ")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "success"),
			@ApiResponse(code = 404, message = "not found") })
	@GetMapping("/all")
	public Iterable<CatalogItem> getAllBooks() {
		return bookService.findAll();
	}

	/**
	 * getBookById
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = " find book by id ")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "success"),
			@ApiResponse(code = 404, message = "not found") })
	@GetMapping("/{id}")
	public ResponseEntity<CatalogItem> getBookById(@PathVariable Long id) throws Exception {
		CatalogItem catalogItem = bookService.findById(id);
		return new ResponseEntity<CatalogItem>(catalogItem, HttpStatus.OK);
	}

	/**
	 * deleteBook
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = " delete by id ")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "success"),
			@ApiResponse(code = 404, message = "not found") })
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteBook(@PathVariable Long id) throws Exception {
		bookService.delete(id);
		return new ResponseEntity<String>("book was deleted", HttpStatus.OK);
	}

	/**
	 * getImage
	 * 
	 * @param imageName
	 * @return
	 * @throws IOException
	 */
	@ApiOperation(value = " get image ")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "success"),
			@ApiResponse(code = 404, message = "not found") })
	@GetMapping(path = { "/get/{imageName}" })
	public ImageModel getImage(@PathVariable("imageName") String imageName) throws IOException {
		final Optional<ImageModel> retrievedImage = imageRepository.findByName(imageName);
		ImageModel img = new ImageModel(retrievedImage.get().getName(), retrievedImage.get().getType(),
				ImageUtil.decompressBytes(retrievedImage.get().getPicByte()));
		return img;
	}

	/**
	 * getBookById
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = " find book by id ")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "success"),
			@ApiResponse(code = 404, message = "not found") })
	@GetMapping("filterbyyears/{id}")
	public ResponseEntity<List<CatalogItem>> filterByYears(@PathVariable int id) throws Exception {
		List<CatalogItem> catalogItem = bookService.filterByYears(id);
		return new ResponseEntity<List<CatalogItem>>(catalogItem, HttpStatus.OK);
	}

	/**
	 * getBookById
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = " find book by id ")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "success"),
			@ApiResponse(code = 404, message = "not found") })
	@GetMapping("filterbywriters/{id}")
	public ResponseEntity<List<CatalogItem>> filterByWriters(@PathVariable int id) throws Exception {
		List<CatalogItem> catalogItem = bookService.filterByWriters(id);
		return new ResponseEntity<List<CatalogItem>>(catalogItem, HttpStatus.OK);
	}

	/**
	 * getBookById
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = " find book by id ")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "success"),
			@ApiResponse(code = 404, message = "not found") })
	@GetMapping("filterbycategories/{id}")
	public ResponseEntity<List<CatalogItem>> filterByCategories(@PathVariable int id) throws Exception {
		List<CatalogItem> catalogItem = bookService.filterByCategories(id);
		return new ResponseEntity<List<CatalogItem>>(catalogItem, HttpStatus.OK);
	}

	/**
	 * getBookById
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = " archive book")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "success"),
			@ApiResponse(code = 404, message = "not found") })
	@PutMapping("archivebook/{id}")
	public ResponseEntity<String[]> archiveBook(@PathVariable int id) throws Exception {
		bookService.archiveBook(id);
		String[] res = new String[] { "book has been archived" };
		return new ResponseEntity<String[]>(res, HttpStatus.OK);

	}

	/**
	 * getBookById
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value = " destroy book ")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "success"),
			@ApiResponse(code = 404, message = "not found") })
	@PutMapping("destroybook/{id}")
	public ResponseEntity<String[]> destroybook(@PathVariable int id) throws Exception {
		bookService.destroyBook(id);
		String[] res = new String[] { "book has been destroyed" };
		return new ResponseEntity<String[]>(res, HttpStatus.OK);

	}


	@GetMapping("/categories")
	public List<CategoryDto> getCategories() {
		// Fetch categories from the repository
		List<Category> categories = categoryRepository.findAll();

		// Map the categories to the required DTO format
		return categories.stream()
				.map(category -> new CategoryDto(category.getCategory_name(), bookRepository.countByCategory(category)))
				.collect(Collectors.toList());
	}

	@GetMapping("/types")
	public List<MediaTypeDto> getTypes() {
		// Fetch categories from the repository
		List<MediaType> categories = mediaTypeRepository.findAll();

		// Map the categories to the required DTO format
		return categories.stream()
				.map(media -> new MediaTypeDto(media.getName(), bookRepository.countByType(media)))
				.collect(Collectors.toList());
	}


	@GetMapping("/publications-by-publisher")
	public List<Map<String, Object>> getNumberOfPublicationsByPublisher() {
		return bookService.getNumberOfPublicationsByPublisher();
	}

	// 2. Publisher Distribution by Genre
	@GetMapping("/distribution-by-genre")
	public List<Map<String, Object>> getPublisherDistributionByGenre() {
		return bookService.getPublisherDistributionByGenre();
	}

	// 3. Publication Trends by Publisher Over Time
	@GetMapping("/publication-trends-by-publisher")
	public List<Map<String, Object>> getPublicationTrendsByPublisher() {
		return bookService.getPublicationTrendsByPublisher();
	}

	// 4. Top Publishers by Borrow Count
	@GetMapping("/top-publishers-by-borrow-count")
	public List<Map<String, Object>> getTopPublishersByBorrowCount() {
		return bookService.getTopPublishersByBorrowCount();
	}

	@GetMapping("/publications-by-authors")
	public List<AuthorPublicationDTO> getPublicationsByAuthors() {
		return bookService.getNumberOfPublicationsByAuthors();
	}

	@GetMapping("/publication-distribution-by-genre")
	public List<AuthorPublicationDTO> getPublicationDistributionByGenre() {
		return bookService.getPublicationDistributionByGenre();
	}

	@GetMapping("/publication-trends-over-time")
	public List<AuthorPublicationDTO> getPublicationTrendsOverTime() {
		return bookService.getPublicationTrendsOverTime();
	}

	@GetMapping("/top-authors-by-borrow-count")
	public List<AuthorPublicationDTO> getTopAuthorsByBorrowCount() {
		return bookService.getTopAuthorsByBorrowCount();
	}

	@GetMapping("/top-media-types-by-borrow-count")
	public List<MediaTypeCountDTO> getTopMediaTypesByBorrowCount() {
		return bookService.getTopMediaTypesByBorrowCount();
	}
	@GetMapping("/media-acquisition-trends")
	public List<MediaTypeCountDTO> getMediaAcquisitionTrendsOverTime() {
		return bookService.getMediaAcquisitionTrendsOverTime();
	}
	@GetMapping("/media-distribution-by-genre")
	public List<MediaTypeCountDTO> getMediaDistributionByGenre() {
		return bookService.getMediaDistributionByGenre();
	}

	@GetMapping("/media-items-by-type")
	public List<MediaTypeCountDTO> getNumberOfMediaItemsByType() {
		return bookService.getNumberOfMediaItemsByType();
	}


	@GetMapping("/category-chart")
	public List<ChartData> getItemsByCategory() {
		return bookService.getItemsByCategory();
	}

	@GetMapping("/media-type-chart")
	public List<ChartData> getItemsByMediaType() {
		return bookService.getItemsByMediaType();
	}

	@GetMapping("/publishing-year-chart")
	public List<ChartData> getItemsByPublishingYear() {
		return bookService.getItemsByPublishingYear();
	}

	@GetMapping("/status-chart")
	public List<ChartData> getItemsByStatus() {
		return bookService.getItemsByStatus();
	}

	// Top Authors
	@GetMapping("/top-authors")
	public List<Object[]> getTopAuthors() {
		return bookService.getTopAuthors();
	}

	// Top Publications
	@GetMapping("/top-publications")
	public List<Object[]> getTopPublications() {
		return bookService.getTopPublications();
	}

	// Most Popular Genres
	@GetMapping("/most-popular-genres")
	public List<Object[]> getMostPopularGenres() {
		return bookService.getMostPopularGenres();
	}

	// Top Circulating Books
	@GetMapping("/top-circulating-books")
	public List<Object[]> getTopCirculatingBooks() {
		return bookService.getTopCirculatingBooks();
	}

	// Top Book Series
	@GetMapping("/top-book-series")
	public List<Object[]> getTopBookSeries() {
		return bookService.getTopBookSeries();
	}

	/*@GetMapping("/by-department-shelves")
	public Map<String, List<CatalogItem>> getBooksGroupedByShelves(@RequestParam("departmentName") String departmentName) {
		return bookService.getBooksGroupedByShelves(departmentName);
	}*/

	@GetMapping("/by-department-shelves")
	public List<Map<String, Object>> getBooksGroupedByShelves(@RequestParam("departmentName") String departmentName) {
		return bookService.getBooksGroupedByShelves(departmentName);
	}

	@GetMapping("/get/{id}/{imageName}")
	public ResponseEntity<byte[]> getImage(@PathVariable("imageName") String imageName,@PathVariable("id")String id) throws IOException {
		// Construct the file path outside of the resources directory (external folder)
		Path imagePath = Paths.get("static/images/books/"+id+"/" + imageName);

		// Create a resource object from the file path
		UrlResource imgFile = new UrlResource(imagePath.toUri());

		// Check if the file exists
		if (!imgFile.exists() || !imgFile.isReadable()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		// Convert the image file into a byte array for the response
		InputStream in = imgFile.getInputStream();
		byte[] imageBytes = StreamUtils.copyToByteArray(in);

		// Set HTTP headers to indicate image content (you can dynamically set this based on the file type)
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(org.springframework.http.MediaType.IMAGE_PNG); // Adjust for different image types if necessary

		// Return the image bytes as a response entity with OK status
		return new ResponseEntity<>(imageBytes, headers, HttpStatus.OK);
	}

	@PostMapping("/upload/{bookId}/{imageName}")
	public String handleFileUpload(@PathVariable("bookId") String bookId,
								   @PathVariable("imageName") String imageName,
								   @RequestParam("file") MultipartFile file) {
		if (file.isEmpty()) {
			return "No file selected!";
		}

		try {
			// Define the path where the file will be saved, including the bookId and imageName in the path
			String uploadDirectory = System.getProperty("user.dir") + "/static/images/books/" + bookId + "/";

			// Create the directory if it doesn't exist
			File directory = new File(uploadDirectory);
			if (!directory.exists()) {
				directory.mkdirs();  // Create the directory
			}

			// Define the full path for the new file
			File destinationFile = new File(uploadDirectory + imageName);

			// Check if the file already exists, and delete it if necessary
			if (destinationFile.exists()) {
				if (!destinationFile.delete()) {
					return "Failed to delete the existing file!";
				}
			}

			// Save the new file
			file.transferTo(destinationFile);

			CatalogItem book = bookService.findById(Long.parseLong(bookId));
			if (book != null) {
				book.setPhoto(imageName);
				bookService.saveOrUpdate(book);
				return "File uploaded and book photo updated successfully: " + imageName;
			} else {
				return "Book not found!";
			}



			//return "File uploaded successfully: " + file.getOriginalFilename();

		} catch (IOException e) {
			e.printStackTrace();
			return "File upload failed!";
		} catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
