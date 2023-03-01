package com.fnrsportfolio.negraeportfolio.repository;

import com.fnrsportfolio.negraeportfolio.model.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion, Long> {
/*
    public Optional<Educacion> findByNombreEdu(String nombreEdu);

    public boolean existByNombreEdu(String nombreEdu);
*/
}
