package com.fnrsportfolio.negraeportfolio.service;

import com.fnrsportfolio.negraeportfolio.model.ExpLab;
import java.util.List;

public interface IExpLabService {

    public List<ExpLab> verExperiencia();

    public void crearExperiencia(ExpLab explab);

    public void borrarExperiencia(Long id);

    public ExpLab buscarExperiencia(Long id);
    
}
