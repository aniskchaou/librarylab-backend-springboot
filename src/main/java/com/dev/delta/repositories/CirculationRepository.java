package com.dev.delta.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dev.delta.entities.Circulation;

public interface CirculationRepository extends JpaRepository<Circulation, Long> {

	@Query("select count(*) from Circulation c group by c.issueDate")
	List<Integer> findBookByDate();

	@Query("select distinct c.issueDate from Circulation c")
	List<String> findAllCirculations();

}
