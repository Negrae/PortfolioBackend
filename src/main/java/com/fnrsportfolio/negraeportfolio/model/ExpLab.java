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
public class ExpLab {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombreExp;
    @Column(columnDefinition = "LONGTEXT")
    private String descripcionExp;

    public ExpLab() {
    }

    public ExpLab(Long id, String nombreExp, String descripcionExp) {
        this.id = id;
        this.nombreExp = nombreExp;
        this.descripcionExp = descripcionExp;
    }
   
    
}
