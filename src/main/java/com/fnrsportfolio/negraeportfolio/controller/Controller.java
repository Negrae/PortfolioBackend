package com.fnrsportfolio.negraeportfolio.controller;

import com.fnrsportfolio.negraeportfolio.model.Contacto;
import com.fnrsportfolio.negraeportfolio.model.Persona;
import com.fnrsportfolio.negraeportfolio.service.IPersonaService;
import com.fnrsportfolio.negraeportfolio.service.IContactoService;
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
    
    //Controlador para tabla PERSONA.
    
    @Autowired
    private IPersonaService IPersonaService;

    @GetMapping ("/personas/{id}")
    public Persona buscarPersona(@PathVariable Long id){
    System.out.println("Se solicito la persona con ID " + id); 
    return IPersonaService.buscarPersona(id);
    }
    
    @GetMapping ("/personas/perfiladmin")
    public Persona buscarPersona(){
    System.out.println("Se solicito la persona ADMIN"); 
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
    System.out.println("Se elimino la persona con ID " + id); 
    return "Se elimino la persona con ID " + id;
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
    
    //Controlador para tabla CONTACTO.
    
    @Autowired
    private IContactoService IContactoService;

    @GetMapping ("/contacto/{id}")
    public Contacto buscarContacto(@PathVariable Long id){
    System.out.println("Se solicito el contacto con ID " + id); 
    return IContactoService.buscarContacto(id);
    }
    
    @GetMapping ("/contacto/contactoadmin")
    public Contacto buscarContacto(){
    System.out.println("Se solicito el contacto ADMIN"); 
    return IContactoService.buscarContacto((long) 1);
    }
    
    @GetMapping ("/contacto/vercontactos")
    @ResponseBody
    public List<Contacto> verContacto () {
    System.out.println("Se solicito la lista de contactos");
    return IContactoService.verContacto();
    }    
    
    @PostMapping ("/contacto/nuevocontacto")
    public String agregarContacto (@RequestBody Contacto cont){
    IContactoService.crearContacto(cont);
    System.out.println("Se registro un nuevo contacto");  
    return "Se registro un nuevo Contacto";
    }
 
    @DeleteMapping ("/contacto/borrar/{id}")
    public String borrarContacto (@PathVariable Long id){
    IContactoService.borrarContacto(id);
    System.out.println("Se elimino el contacto con ID " + id); 
    return "Se elimino el contacto con ID " + id;
    }
 
    @PutMapping ("/contacto/editar/{id}")
    public Contacto editarContacto (@PathVariable Long id, @RequestBody Contacto conted) {
        
    Contacto cont = IContactoService.buscarContacto(id);
    
    cont.setWhatsapp(conted.getWhatsapp());
    cont.setEmail(conted.getEmail());
    cont.setLinkedin_url(conted.getLinkedin_url());
    cont.setInstagram_url(conted.getInstagram_url());
    cont.setFacebook_url(conted.getFacebook_url());
    cont.setYoutube_url(conted.getYoutube_url());
    
    IContactoService.crearContacto(cont);
    
    return cont;
    }
    
}
