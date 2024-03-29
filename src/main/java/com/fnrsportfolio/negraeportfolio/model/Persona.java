package com.fnrsportfolio.negraeportfolio.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String apodo;
    private String img;
    @Column(columnDefinition = "LONGTEXT")
    private String abouttext;
    private String seniority;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String apodo, String img, String abouttext, String seniority) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.apodo = apodo;
        this.img = img;
        this.abouttext = abouttext;
        this.seniority = seniority;
    }
    
    
    
}
