package com.dev.delta.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dev.delta.entities.Circulation;

public interface CirculationRepository extends JpaRepository<Circulation, Long> {

	@Query("select count(*) from Circulation c group by c.issueDate")
	List<Integer> findBookByDate();

	@Query("select distinct c.issueDate from Circulation c")
	List<String> findAllCirculations();

	@Query(nativeQuery = true, value = "select * from circulation c where c.member_id = :member_id and c.book_id=:book_id  and c.category_id=:category_id ")
	List<Circulation> findBookFilter(@Param("member_id") int member_id, @Param("book_id") int book_id,
			@Param("category_id") int category_id

	);

	@Query("select distinct c.memberName, c.returnStatus,  c.penalty, c.returnDate, c.bookName, c.writer, c.issueDate, c.toReturn from Circulation c")
	List<Circulation> findReturnedBooks();

	@Transactional
	@Modifying(clearAutomatically = true)
	@Query(nativeQuery = true, value = "UPDATE circulation  c SET c.return_status=2 WHERE c.id=:id ")
	void returnBook(@Param("id") int id);
}
