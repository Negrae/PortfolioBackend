package com.fnrsportfolio.negraeportfolio.controller;

import com.fnrsportfolio.negraeportfolio.model.Persona;
import com.fnrsportfolio.negraeportfolio.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class Controller {
    
    @Autowired
    private IPersonaService IPersonaService;

    @GetMapping ("/personas/{id}")
    public Persona buscarPersona(@PathVariable Long id){
    return IPersonaService.buscarPersona(id);
    }
    
       @GetMapping ("/personas/perfiladmin")
    public Persona buscarPersona(){
    return IPersonaService.buscarPersona((long) 1);
    }
    
    @GetMapping ("/personas/verpersonas")
    @ResponseBody
    public List<Persona> verPersonas () {
    System.out.println("Se solicito la lista de personas");
    return IPersonaService.verPersonas();
    }    
    
    @PostMapping ("/personas/nuevapersona")
    public String agregarPersona (@RequestBody Persona pers){
    IPersonaService.crearPersona(pers);
    System.out.println("Se registro una nueva persona");  
    return "Se registro una nueva persona";
    }
 
    @DeleteMapping ("/personas/borrar/{id}")
    public String borrarPersona (@PathVariable Long id){
    IPersonaService.borrarPersona(id);
    System.out.println("Se elimino el registro con ID " + id); 
    return "Se elimino el registro con ID " + id;
    }
 
    @PutMapping ("/personas/editar/{id}")
    public Persona editPersona (@PathVariable Long id,
                                @RequestParam ("nombre") String nuevoNombre,
                                @RequestParam ("apellido") String nuevoApellido,
                                @RequestParam ("apodo") String nuevoApodo,
                                @RequestParam ("img") String nuevaImg,
                                @RequestParam ("abouttext") String nuevoAboutText,
                                @RequestParam ("seniority") String nuevoSeniority)
                                 {
Persona perso = IPersonaService.buscarPersona(id);
        
        perso.setApellido(nuevoApellido);
        perso.setNombre(nuevoNombre);
        perso.setApodo(nuevoApodo);
        perso.setImg(nuevaImg);
        perso.setAbouttext(nuevoAboutText);
        perso.setSeniority(nuevoSeniority);
        
        IPersonaService.crearPersona(perso);
        System.out.println("Se edito la persona con ID " + id); 
        return perso;
}
    
}
