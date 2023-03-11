package com.fnrsportfolio.negraeportfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class HardSkill {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombreHaSkill;
    private Long porcentajeHaSkill;

    public HardSkill() {
    }

    public HardSkill(Long id, String nombreHaSkill, Long porcentajeHaSkill) {
        this.id = id;
        this.nombreHaSkill = nombreHaSkill;
        this.porcentajeHaSkill = porcentajeHaSkill;
    }
    
}
