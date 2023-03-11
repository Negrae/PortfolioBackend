package com.fnrsportfolio.negraeportfolio.repository;

import com.fnrsportfolio.negraeportfolio.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository <Proyecto, Long>{
     
}
