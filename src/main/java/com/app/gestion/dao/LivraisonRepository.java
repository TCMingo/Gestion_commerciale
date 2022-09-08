package com.app.gestion.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.gestion.entities.Livraison;

@Repository
public interface LivraisonRepository extends JpaRepository<Livraison, Long> {
}
