package com.fnrsportfolio.negraeportfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombreEdu;
    private String descripcionEdu;

    public Educacion() {
    }

    public Educacion(Long id, String nombreEdu, String descripcionEdu) {
        this.id = id;
        this.nombreEdu = nombreEdu;
        this.descripcionEdu = descripcionEdu;
    }

}
