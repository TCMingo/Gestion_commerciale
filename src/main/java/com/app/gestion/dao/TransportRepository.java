package com.app.gestion.dao;
  
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.gestion.entities.Transport; 


@Repository
public interface TransportRepository extends JpaRepository<Transport, Long>  
{
}  

