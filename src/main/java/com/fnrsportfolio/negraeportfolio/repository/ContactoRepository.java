package com.fnrsportfolio.negraeportfolio.repository;

import com.fnrsportfolio.negraeportfolio.model.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactoRepository extends JpaRepository <Contacto, Long>{
    
}