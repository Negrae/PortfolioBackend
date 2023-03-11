package com.fnrsportfolio.negraeportfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class SoftSkill {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombreSoSkill;
    private Long porcentajeSoSkill;

    public SoftSkill() {
    }

    public SoftSkill(Long id, String nombreSoSkill, Long porcentajeSoSkill) {
        this.id = id;
        this.nombreSoSkill = nombreSoSkill;
        this.porcentajeSoSkill = porcentajeSoSkill;
    }
    
}
