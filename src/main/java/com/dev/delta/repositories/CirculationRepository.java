package com.dev.delta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Circulation;

public interface CirculationRepository extends JpaRepository<Circulation, Long> {

}
