package com.fnrsportfolio.negraeportfolio.service;

import com.fnrsportfolio.negraeportfolio.model.ExpLab;
import com.fnrsportfolio.negraeportfolio.repository.ExpLabRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpLabService implements IExpLabService {

    @Autowired
    public ExpLabRepository expRepo;

    @Override
    public List<ExpLab> verExperiencia() {
        return expRepo.findAll();
    }

    @Override
    public void crearExperiencia(ExpLab explab) {
        expRepo.save(explab);
    }

    @Override
    public void borrarExperiencia(Long id) {
        expRepo.deleteById(id);
    }

    @Override
    public ExpLab buscarExperiencia(Long id) {
        return expRepo.findById(id).orElse(null);

    }
}