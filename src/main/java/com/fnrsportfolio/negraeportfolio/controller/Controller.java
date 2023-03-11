package com.fnrsportfolio.negraeportfolio.controller;

import com.fnrsportfolio.negraeportfolio.model.Contacto;
import com.fnrsportfolio.negraeportfolio.model.Educacion;
import com.fnrsportfolio.negraeportfolio.model.ExpLab;
import com.fnrsportfolio.negraeportfolio.model.HardSkill;
import com.fnrsportfolio.negraeportfolio.model.Persona;
import com.fnrsportfolio.negraeportfolio.model.Proyecto;
import com.fnrsportfolio.negraeportfolio.model.SoftSkill;
import com.fnrsportfolio.negraeportfolio.service.IPersonaService;
import com.fnrsportfolio.negraeportfolio.service.IContactoService;
import com.fnrsportfolio.negraeportfolio.service.IEducacionService;
import com.fnrsportfolio.negraeportfolio.service.IExpLabService;
import com.fnrsportfolio.negraeportfolio.service.IHardSkillService;
import com.fnrsportfolio.negraeportfolio.service.IProyectoService;
import com.fnrsportfolio.negraeportfolio.service.ISoftSkillService;
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
    
    @GetMapping ("/personas/admin")
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
    public Persona editarPersona (@PathVariable Long id, @RequestBody Persona persoed) {
        
    Persona perso = IPersonaService.buscarPersona(id);
    
    perso.setNombre(persoed.getNombre());
    perso.setApellido(persoed.getApellido());
    perso.setApodo(persoed.getApodo());
    perso.setImg(persoed.getImg());
    perso.setAbouttext(persoed.getAbouttext());
    perso.setSeniority(persoed.getSeniority());
    
    IPersonaService.crearPersona(perso);
    System.out.println("Se modifico la persona con ID " + id); 
    
    return perso;
    }

//    EDITPERSONA VIEJO CON REQUESTPARAM          
//    
//    @PutMapping ("/personas/editar/{id}")
//    public Persona editPersona (@PathVariable Long id,
//                                @RequestParam ("nombre") String nuevoNombre,
//                                @RequestParam ("apellido") String nuevoApellido,
//                                @RequestParam ("apodo") String nuevoApodo,
//                                @RequestParam ("img") String nuevaImg,
//                                @RequestParam ("abouttext") String nuevoAboutText,
//                                @RequestParam ("seniority") String nuevoSeniority)
//    {
//        Persona perso = IPersonaService.buscarPersona(id);
//        
//        perso.setApellido(nuevoApellido);
//        perso.setNombre(nuevoNombre);
//        perso.setApodo(nuevoApodo);
//        perso.setImg(nuevaImg);
//        perso.setAbouttext(nuevoAboutText);
//        perso.setSeniority(nuevoSeniority);
//        
//        IPersonaService.crearPersona(perso);
//        System.out.println("Se edito la persona con ID " + id); 
//        return perso;
//    }
    
    
    //Controlador para tabla CONTACTO.
    
    
    @Autowired
    private IContactoService IContactoService;

    @GetMapping ("/contacto/{id}")
    public Contacto buscarContacto(@PathVariable Long id){
    System.out.println("Se solicito el contacto con ID " + id); 
    return IContactoService.buscarContacto(id);
    }
    
    @GetMapping ("/contacto/admin")
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
    System.out.println("Se modifico el contacto con ID " + id); 
    
    return cont;
    }
    
    
    //Controlador para tabla EDUCACION.
    
    
    @Autowired
    private IEducacionService IEducacionService;

    @GetMapping ("/educacion/{id}")
    public Educacion buscarEducacion(@PathVariable Long id){
    System.out.println("Se solicito educacion con ID " + id); 
    return IEducacionService.buscarEducacion(id);
    }
    
    @GetMapping ("/educacion/admin")
    public Educacion buscarEducacion(){
    System.out.println("Se solicito educacion ADMIN"); 
    return IEducacionService.buscarEducacion((long) 1);
    }
    
    @GetMapping ("/educacion/vereducaciones")
    @ResponseBody
    public List<Educacion> verEducacion () {
    System.out.println("Se solicito la lista educacion");
    return IEducacionService.verEducacion();
    }    
    
    @PostMapping ("/educacion/nuevaeducacion")
    public String agregarEducacion (@RequestBody Educacion educ){
    IEducacionService.crearEducacion(educ);
    System.out.println("Se registro una nueva educacion");  
    return "Se registro una nueva educacion";
    }
 
    @DeleteMapping ("/educacion/borrar/{id}")
    public String borrarEducacion (@PathVariable Long id){
    IEducacionService.borrarEducacion(id);
    System.out.println("Se elimino educacion con ID " + id); 
    return "Se elimino educacion con ID " + id;
    }
 
    @PutMapping ("/educacion/editar/{id}")
    public Educacion editarEducacion (@PathVariable Long id, @RequestBody Educacion educ) {
        
    Educacion edu = IEducacionService.buscarEducacion(id);
    
    edu.setNombreEdu(educ.getNombreEdu());
    edu.setDescripcionEdu(educ.getDescripcionEdu());
    
    IEducacionService.crearEducacion(edu);
    System.out.println("Se modifico la educacion con ID " + id); 
    
    return edu;
    }
    
    
    //Controlador para tabla EXPLAB.
    
    
    @Autowired
    private IExpLabService IExpLabService;

    @GetMapping ("/experiencias/{id}")
    public ExpLab buscarExpLab(@PathVariable Long id){
    System.out.println("Se solicito la experiencia con ID " + id); 
    return IExpLabService.buscarExperiencia(id);
    }
    
    @GetMapping ("/experiencias/admin")
    public ExpLab buscarExpLab(){
    System.out.println("Se solicito la experiencia ADMIN"); 
    return IExpLabService.buscarExperiencia((long) 1);
    }
    
    @GetMapping ("/experiencias/verexperiencias")
    @ResponseBody
    public List<ExpLab> verExperiencia () {
    System.out.println("Se solicito la lista de experiencias");
    return IExpLabService.verExperiencia();
    }    
    
    @PostMapping ("/experiencias/nuevaexperiencia")
    public String agregarExperiencia (@RequestBody ExpLab exp){
    IExpLabService.crearExperiencia(exp);
    System.out.println("Se registro una nueva experiencia");  
    return "Se registro una nueva experiencia";
    }
 
    @DeleteMapping ("/experiencias/borrar/{id}")
    public String borrarExperiencia (@PathVariable Long id){
    IExpLabService.borrarExperiencia(id);
    System.out.println("Se elimino la experiencia con ID " + id); 
    return "Se elimino la experiencia con ID " + id;
    }

        @PutMapping ("/experiencias/editar/{id}")
    public ExpLab editarExperiencia (@PathVariable Long id, @RequestBody ExpLab exped) {
        
    ExpLab exp = IExpLabService.buscarExperiencia(id);
    
    exp.setNombreExp(exped.getNombreExp());
    exp.setDescripcionExp(exped.getDescripcionExp());
    
    IExpLabService.crearExperiencia(exp);
    System.out.println("Se modifico la experiencia con ID " + id);
    
    return exp;
    }
    
    
    //Controlador para tabla PROYECTO.
    
    
    @Autowired
    private IProyectoService IProyectoService;

    @GetMapping ("/proyecto/{id}")
    public Proyecto buscarProyecto(@PathVariable Long id){
    System.out.println("Se solicito proyecto con ID " + id); 
    return IProyectoService.buscarProyecto(id);
    }
    
    @GetMapping ("/proyecto/admin")
    public Proyecto buscarProyecto(){
    System.out.println("Se solicito proyecto ADMIN"); 
    return IProyectoService.buscarProyecto((long) 1);
    }
    
    @GetMapping ("/proyecto/verproyectos")
    @ResponseBody
    public List<Proyecto> verProyecto () {
    System.out.println("Se solicito la lista proyectos");
    return IProyectoService.verProyecto();
    }    
    
    @PostMapping ("/proyecto/nuevoproyecto")
    public String agregarProyecto (@RequestBody Proyecto proy){
    IProyectoService.crearProyecto(proy);
    System.out.println("Se registro un nuevo proyecto");  
    return "Se registro un nuevo proyecto";
    }
 
    @DeleteMapping ("/proyecto/borrar/{id}")
    public String borrarProyecto (@PathVariable Long id){
    IProyectoService.borrarProyecto(id);
    System.out.println("Se elimino proyecto con ID " + id); 
    return "Se elimino proyecto con ID " + id;
    }
 
    @PutMapping ("/proyecto/editar/{id}")
    public Proyecto editarProyecto (@PathVariable Long id, @RequestBody Proyecto proyec) {
        
    Proyecto proy = IProyectoService.buscarProyecto(id);
    
    proy.setNombreProyecto(proyec.getNombreProyecto());
    proy.setDescripcionProyecto(proyec.getDescripcionProyecto());
    proy.setUrlProyecto(proyec.getUrlProyecto());
    
    IProyectoService.crearProyecto(proy);
    System.out.println("Se modifico el proyecto con ID " + id); 
    
    return proy;
    }
    
    
    //Controlador para tabla HARDSKILL.
    
    
    @Autowired
    private IHardSkillService IHardSkillService;

    @GetMapping ("/hardskill/{id}")
    public HardSkill buscarHardSkill(@PathVariable Long id){
    System.out.println("Se solicito hardskill con ID " + id); 
    return IHardSkillService.buscarHardSkill(id);
    }
    
    @GetMapping ("/hardskill/admin")
    public HardSkill buscarHardSkill(){
    System.out.println("Se solicito hardskills ADMIN"); 
    return IHardSkillService.buscarHardSkill((long) 1);
    }
    
    @GetMapping ("/hardskill/verhardskills")
    @ResponseBody
    public List<HardSkill> verHardSkill () {
    System.out.println("Se solicito la lista hardskill");
    return IHardSkillService.verHardSkill();
    }    
    
    @PostMapping ("/hardskill/nuevahardskill")
    public String agregarHardSkill (@RequestBody HardSkill hard){
    IHardSkillService.crearHardSkill(hard);
    System.out.println("Se registro un nuevo hardskill");  
    return "Se registro un nuevo hardskill";
    }
 
    @DeleteMapping ("/hardskill/borrar/{id}")
    public String borrarHardSkill (@PathVariable Long id){
    IHardSkillService.borrarHardSkill(id);
    System.out.println("Se elimino hardskill con ID " + id); 
    return "Se elimino hardskill con ID " + id;
    }
 
    @PutMapping ("/hardskill/editar/{id}")
    public HardSkill editarHardSkill (@PathVariable Long id, @RequestBody HardSkill hardsk) {
        
    HardSkill hard = IHardSkillService.buscarHardSkill(id);
    
    hard.setNombreHaSkill(hardsk.getNombreHaSkill());
    hard.setPorcentajeHaSkill(hardsk.getPorcentajeHaSkill());
    
    IHardSkillService.crearHardSkill(hard);
    System.out.println("Se modifico hardskill con ID " + id); 
    
    return hard;
    }
    
    
    //Controlador para tabla SOFTSKILL.
    
    
    @Autowired
    private ISoftSkillService ISoftSkillService;

    @GetMapping ("/softskill/{id}")
    public SoftSkill buscarSoftSkill(@PathVariable Long id){
    System.out.println("Se solicito softskill con ID " + id); 
    return ISoftSkillService.buscarSoftSkill(id);
    }
    
    @GetMapping ("/softskill/admin")
    public SoftSkill buscarSoftSkill(){
    System.out.println("Se solicito softskills ADMIN"); 
    return ISoftSkillService.buscarSoftSkill((long) 1);
    }
    
    @GetMapping ("/softskill/versoftskills")
    @ResponseBody
    public List<SoftSkill> verSoftSkill () {
    System.out.println("Se solicito la lista softskill");
    return ISoftSkillService.verSoftSkill();
    }    
    
    @PostMapping ("/softskill/nuevasoftskill")
    public String agregarSoftSkill (@RequestBody SoftSkill soft){
    ISoftSkillService.crearSoftSkill(soft);
    System.out.println("Se registro un nuevo softskill");  
    return "Se registro un nuevo softskill";
    }
 
    @DeleteMapping ("/softskill/borrar/{id}")
    public String borrarSoftSkill (@PathVariable Long id){
    ISoftSkillService.borrarSoftSkill(id);
    System.out.println("Se elimino softskill con ID " + id); 
    return "Se elimino softskill con ID " + id;
    }
 
    @PutMapping ("/softskill/editar/{id}")
    public SoftSkill editarSoftSkill (@PathVariable Long id, @RequestBody SoftSkill softsk) {
        
    SoftSkill soft = ISoftSkillService.buscarSoftSkill(id);
    
    soft.setNombreSoSkill(softsk.getNombreSoSkill());
    soft.setPorcentajeSoSkill(softsk.getPorcentajeSoSkill());
    
    ISoftSkillService.crearSoftSkill(soft);
    System.out.println("Se modifico softskill con ID " + id); 
    
    return soft;
    }
    
    
}
