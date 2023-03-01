package com.fnrsportfolio.negraeportfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Contacto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String whatsapp;
    private String email;
    private String linkedin_url;
    private String instagram_url;
    private String facebook_url;
    private String youtube_url;
    

    public Contacto() {
    }

    public Contacto(Long id, String whatsapp, String email, String linkedin_url, String instagram_url, String facebook_url, String youtube_url) {
        this.id = id;
        this.whatsapp = whatsapp;
        this.email = email;
        this.linkedin_url = linkedin_url;
        this.instagram_url = instagram_url;
        this.facebook_url = facebook_url;
        this.youtube_url = youtube_url;
    }
}