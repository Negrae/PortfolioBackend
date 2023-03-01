package com.fnrsportfolio.negraeportfolio.service;

import com.fnrsportfolio.negraeportfolio.model.HardSkill;
import java.util.List;

public interface IHardSkillService {

    public List<HardSkill> verHardSkill();

    public void crearHardSkill(HardSkill hardsk);

    public void borrarHardSkill(Long id);

    public HardSkill buscarHardSkill(Long id);
    
}

