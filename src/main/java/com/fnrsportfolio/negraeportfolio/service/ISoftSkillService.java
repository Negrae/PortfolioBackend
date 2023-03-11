package com.fnrsportfolio.negraeportfolio.service;

import com.fnrsportfolio.negraeportfolio.model.SoftSkill;
import java.util.List;

public interface ISoftSkillService {

    public List<SoftSkill> verSoftSkill();

    public void crearSoftSkill(SoftSkill softsk);

    public void borrarSoftSkill(Long id);

    public SoftSkill buscarSoftSkill(Long id);
    
}
