package com.app.gestion.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.gestion.entities.Reduction;

@Repository
public interface ReductionRepository extends JpaRepository<Reduction, Long> {
}
