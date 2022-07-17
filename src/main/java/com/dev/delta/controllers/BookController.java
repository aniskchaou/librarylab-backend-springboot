package com.dev.delta.controllers;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.delta.entities.Book;
import com.dev.delta.entities.ImageModel;
import com.dev.delta.repositories.ImageModelrepository;
import com.dev.delta.services.BookService;
import com.dev.delta.util.ImageUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

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

	/**
	 * ImageModelrepository
	 */
	@Autowired
	ImageModelrepository imageRepository;

	@GetMapping("/archived")
	public ResponseEntity<List<Book>> getArchivedBook() throws Exception {

		List<Book> bookRes = bookService.findArchivedBook();
		return new ResponseEntity<List<Book>>(bookRes, HttpStatus.OK);

	}

	@GetMapping("/destroyed")
	public ResponseEntity<List<Book>> getDestroyedBook() throws Exception {

		List<Book> bookRes = bookService.findDestroyedBook();
		return new ResponseEntity<List<Book>>(bookRes, HttpStatus.OK);

	}

	@GetMapping("/groupbyauthors")
	public ResponseEntity<List<Book>> groupByAuthors() throws Exception {

		List<Book> bookRes = bookService.groupByAuthors();
		return new ResponseEntity<List<Book>>(bookRes, HttpStatus.OK);

	}

	@GetMapping("/groupbypublishers")
	public ResponseEntity<List<Book>> groupByPublishers() throws Exception {

		List<Book> bookRes = bookService.groupByPublishers();
		return new ResponseEntity<List<Book>>(bookRes, HttpStatus.OK);

	}

	@GetMapping("/groupbycategories")
	public ResponseEntity<List<Book>> groupByCategories() throws Exception {

		List<Book> bookRes = bookService.groupByCategories();
		return new ResponseEntity<List<Book>>(bookRes, HttpStatus.OK);

	}

	@GetMapping("/groupbyeditionyears")
	public ResponseEntity<List<Book>> groupByEditionYear() throws Exception {

		List<Book> bookRes = bookService.groupByEditionYear();
		return new ResponseEntity<List<Book>>(bookRes, HttpStatus.OK);

	}

	/**
	 * 
	 * @param projectBook
	 * @param result
	 * @return
	 */
	@ApiOperation(value = " add book ")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "success"),
			@ApiResponse(code = 404, message = "not found") })
	@PostMapping("/create")
	public ResponseEntity<?> addBook(@Validated @RequestBody Book projectBook, BindingResult result) {

		if (result.hasErrors()) {
			Map<String, String> errorMap = new HashMap<String, String>();
			for (FieldError error : result.getFieldErrors()) {
				errorMap.put(error.getField(), error.getDefaultMessage());
			}
			return new ResponseEntity<Map<String, String>>(errorMap, HttpStatus.BAD_REQUEST);
		}

		Book newPT = bookService.saveOrUpdate(projectBook);
		return new ResponseEntity<Book>(newPT, HttpStatus.CREATED);
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
	public ResponseEntity<Book> filterBook(@PathVariable String edition_year, @PathVariable String publishing_year,
			@PathVariable String publishing_place, @PathVariable String number_of_pages) {

		Book bookRes = bookService.filterBook(edition_year, publishing_year, publishing_place, number_of_pages);
		// System.out.println(bookRes.toString());
		return new ResponseEntity<Book>(bookRes, HttpStatus.OK);

	}

	@ApiOperation(value = " filter book ")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "success"),
			@ApiResponse(code = 404, message = "not found") })
	@GetMapping("/bookreport/{edition_year}/{authorId}/{publisherId}/{categoryId}")
	public ResponseEntity<List<Book>> filterBookByCriteria(@PathVariable String edition_year,
			@PathVariable int authorId, @PathVariable int publisherId, @PathVariable int categoryId) {

		List<Book> bookRes = bookService.filterBookByCriteria(edition_year, authorId, publisherId, categoryId);
		// System.out.println(bookRes.toString());
		return new ResponseEntity<List<Book>>(bookRes, HttpStatus.OK);

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
	public Iterable<Book> getAllBooks() {
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
	public ResponseEntity<Book> getBookById(@PathVariable Long id) throws Exception {
		Book book = bookService.findById(id);
		return new ResponseEntity<Book>(book, HttpStatus.OK);
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
	public ResponseEntity<List<Book>> filterByYears(@PathVariable int id) throws Exception {
		List<Book> book = bookService.filterByYears(id);
		return new ResponseEntity<List<Book>>(book, HttpStatus.OK);
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
	public ResponseEntity<List<Book>> filterByWriters(@PathVariable int id) throws Exception {
		List<Book> book = bookService.filterByWriters(id);
		return new ResponseEntity<List<Book>>(book, HttpStatus.OK);
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
	public ResponseEntity<List<Book>> filterByCategories(@PathVariable int id) throws Exception {
		List<Book> book = bookService.filterByCategories(id);
		return new ResponseEntity<List<Book>>(book, HttpStatus.OK);
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

}
