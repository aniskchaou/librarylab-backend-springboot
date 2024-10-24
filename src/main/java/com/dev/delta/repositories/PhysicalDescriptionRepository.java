package com.dev.delta.repositories;

import com.dev.delta.entities.PhysicalDescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhysicalDescriptionRepository extends JpaRepository<PhysicalDescription, Long> {
}
