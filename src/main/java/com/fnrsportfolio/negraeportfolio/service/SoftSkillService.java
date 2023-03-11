package com.fnrsportfolio.negraeportfolio.service;

import com.fnrsportfolio.negraeportfolio.model.SoftSkill;
import com.fnrsportfolio.negraeportfolio.repository.SoftSkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SoftSkillService implements ISoftSkillService{

    @Autowired
    public SoftSkillRepository softRepo;
    
    @Override
    public List<SoftSkill> verSoftSkill() {
        return softRepo.findAll();
    }

    @Override
    public void crearSoftSkill(SoftSkill softsk) {
        softRepo.save(softsk);
    }

    @Override
    public void borrarSoftSkill(Long id) {
        softRepo.deleteById(id);
    }

    @Override
    public SoftSkill buscarSoftSkill(Long id) {
        return softRepo.findById(id).orElse(null);
    }
      
}
