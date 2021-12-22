package com.dev.delta.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
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

	List<Book> findByTitle(String book);

	@Query(nativeQuery = true, value = "select count(*) from Book c where c.title = :title")
	Long getBookCount(String title);
}
