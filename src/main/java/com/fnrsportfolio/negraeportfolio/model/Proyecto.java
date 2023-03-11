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
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombreProyecto;
    @Column(columnDefinition = "LONGTEXT")
    private String descripcionProyecto;
    private String urlProyecto;

    public Proyecto() {
    }

    public Proyecto(Long id, String nombreProyecto, String descripcionProyecto, String urlProyecto) {
        this.id = id;
        this.nombreProyecto = nombreProyecto;
        this.descripcionProyecto = descripcionProyecto;
        this.urlProyecto = urlProyecto;
    }


    
}