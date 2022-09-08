package com.app.gestion.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.gestion.entities.Reglement;

@Repository
public interface ReglementRepository extends JpaRepository<Reglement, Long> {
}
