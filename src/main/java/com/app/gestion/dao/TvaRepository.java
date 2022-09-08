package com.app.gestion.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.gestion.entities.Tva;

@Repository
public interface TvaRepository extends JpaRepository<Tva, Long> {
}
