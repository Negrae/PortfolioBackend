package com.fnrsportfolio.negraeportfolio.repository;

import com.fnrsportfolio.negraeportfolio.model.SoftSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoftSkillRepository extends JpaRepository <SoftSkill, Long>{
     
}

