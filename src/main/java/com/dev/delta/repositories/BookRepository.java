package com.dev.delta.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.entities.Book;

@RepositoryRestResource
public interface BookRepository extends JpaRepository<Book, Long> {
	@Query("select count(*) from Book b group by b.category")
	List<Integer> findBooksByCategory();

	@Query(nativeQuery = true, value = "select * from book b where b.edition_year = :edition_year and b.publishing_year=:publishing_year  and b.publication_place=:publishing_place and number_of_pages=:number_of_pages ")
	Book findBookFilter(@Param("edition_year") String edition_year, @Param("publishing_year") String publishing_year,
			@Param("publishing_place") String publishing_place, @Param("number_of_pages") String number_of_pages

	);

	@Query(nativeQuery = true, value = "select * from book order by category_id ")
	List<Book> getBooksByCategory();

	@Query(nativeQuery = true, value = "select * from book order by publisher_id ")
	List<Book> getBooksByPublisher();

	@Query(nativeQuery = true, value = "select * from book order by author_id ")
	List<Book> getBooksByAuhor();

	@Query(nativeQuery = true, value = "select * from book b where b.edition_year = :edition_year and b.author_id=:author_id and b.publisher_id=:publisher_id and  b.category_id=:category_id")
	List<Book> findBookByCriteria(@Param("edition_year") String edition_year, @Param("author_id") int author_id,
			@Param("publisher_id") int publisher_id, @Param("category_id") int category_id);

	List<Book> findByTitle(String book);

	@Query(nativeQuery = true, value = "select count(*) from Book c where c.title = :title")
	Long getBookCount(String title);

	@Query(nativeQuery = true, value = "select * from Book c where c.book_status_id = 2 ")
	List<Book> findArchivedBook();

	@Query(nativeQuery = true, value = "select * from Book c group by c.author_id ")
	List<Book> groupByAuthors();

	@Query(nativeQuery = true, value = "select * from Book c group by c.category_id ")
	List<Book> groupByCategories();

	@Query(nativeQuery = true, value = "select * from Book c group by c.edition_year ")
	List<Book> groupByEditionYear();

	@Query(nativeQuery = true, value = "select * from Book c group by c.publisher_id ")
	List<Book> groupByPublisher();

	@Query(nativeQuery = true, value = "select * from Book c where c.book_status_id = 3 ")
	List<Book> findDestroyedBook();

	@Query(nativeQuery = true, value = "select count(*) from Book c where c.category_id = :categoryId")
	Long getBookByCategory(int categoryId);

	@Query(nativeQuery = true, value = "select * from Book c where c.edition_year = :year")
	List<Book> filterByYears(int year);

	@Query(nativeQuery = true, value = "select * from Book c where c.author_id  = :writerId")
	List<Book> filterByWriters(int writerId);

	@Query(nativeQuery = true, value = "select * from Book c where c.category_id = :categoryId")
	List<Book> filterByCategories(int categoryId);

	@Transactional
	@Modifying(clearAutomatically = true)
	@Query(nativeQuery = true, value = "UPDATE book SET book_status_id=2 WHERE id=:id")
	void archiveBook(@Param("id") int id);

	@Transactional
	@Modifying(clearAutomatically = true)
	@Query(nativeQuery = true, value = "UPDATE book   SET book_status_id=3 WHERE id=:id ")
	void destroyBook(@Param("id") int id);

	@Query(nativeQuery = true, value = "select count(*) from Book c where c.publisher_id = :intValue")
	Long getBookPublisher(int intValue);

	@Query(nativeQuery = true, value = "select count(*) from Book c where c.author_id = :intValue")
	Long getBookByWriter(int intValue);

}
