package com.fnrsportfolio.negraeportfolio.service;

import com.fnrsportfolio.negraeportfolio.model.Contacto;
import java.util.List;

public interface IContactoService {
    
    public List<Contacto> verContacto();
    
    public void crearContacto(Contacto cont);
    
    public void borrarContacto(Long id);
    
    public Contacto buscarContacto(Long id);
    
}

