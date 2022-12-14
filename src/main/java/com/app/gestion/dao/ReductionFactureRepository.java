package com.app.gestion.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.gestion.entities.ReductionFacture;

@Repository
public interface ReductionFactureRepository extends JpaRepository<ReductionFacture, Long> {
}
