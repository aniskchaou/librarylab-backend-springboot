package com.dev.delta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Writer;

public interface WriterRepository extends JpaRepository<Writer, Long> {

}
