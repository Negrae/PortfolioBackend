package com.fnrsportfolio.negraeportfolio.service;

import com.fnrsportfolio.negraeportfolio.model.HardSkill;
import com.fnrsportfolio.negraeportfolio.repository.HardSkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HardSkillService implements IHardSkillService{

    @Autowired
    public HardSkillRepository hardRepo;
    
    @Override
    public List<HardSkill> verHardSkill() {
        return hardRepo.findAll();
    }

    @Override
    public void crearHardSkill(HardSkill hardsk) {
        hardRepo.save(hardsk);
    }

    @Override
    public void borrarHardSkill(Long id) {
        hardRepo.deleteById(id);
    }

    @Override
    public HardSkill buscarHardSkill(Long id) {
        return hardRepo.findById(id).orElse(null);
    }
      
}
