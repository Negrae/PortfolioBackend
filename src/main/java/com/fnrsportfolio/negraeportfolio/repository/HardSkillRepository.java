package com.fnrsportfolio.negraeportfolio.repository;

import com.fnrsportfolio.negraeportfolio.model.HardSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HardSkillRepository extends JpaRepository <HardSkill, Long>{
     
}

