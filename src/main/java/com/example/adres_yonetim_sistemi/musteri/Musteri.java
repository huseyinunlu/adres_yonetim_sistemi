package com.example.adres_yonetim_sistemi.musteri;

import com.example.adres_yonetim_sistemi.adres.Adres;
import jakarta.persistence.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="musteriler")
public class Musteri {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name="mail", unique = true)
    private String mail;

    @Column(name="password")
    private String password;



    public Musteri(String mail, String password) {
        this.mail = mail;
        this.password = password;
    }

    public Musteri(Long id, String mail, String password) {
        this.id = id;
        this.mail = mail;
        this.password = password;
    }

    public Musteri() {

    }

    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }

}
