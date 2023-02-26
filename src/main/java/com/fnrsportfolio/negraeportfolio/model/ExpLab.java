package com.fnrsportfolio.negraeportfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class ExpLab {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombreExp;
    private String descripcionExp;

    public ExpLab() {
    }

    public ExpLab(long id, String nombreExp, String descripcionExp) {
        this.id = id;
        this.nombreExp = nombreExp;
        this.descripcionExp = descripcionExp;
    }
   
    
}
