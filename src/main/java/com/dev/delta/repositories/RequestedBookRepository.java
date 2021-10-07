package com.dev.delta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.RequestedBook;

public interface RequestedBookRepository extends JpaRepository<RequestedBook, Long> {

}
