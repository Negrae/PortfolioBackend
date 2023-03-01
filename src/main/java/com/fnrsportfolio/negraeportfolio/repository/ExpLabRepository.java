package com.fnrsportfolio.negraeportfolio.repository;

import com.fnrsportfolio.negraeportfolio.model.ExpLab;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpLabRepository extends JpaRepository<ExpLab, Long> {
/*
    public Optional<ExpLab> findByNombreExp(String nombreExp);

    public boolean existByNombreExp(String nombreExp);
*/
}
