package com.example.adres_yonetim_sistemi.musteri;

import com.example.adres_yonetim_sistemi.adres.Adres;

import java.util.List;

public class Musteri {
    Integer id;
    String mail;
    List<Adres> adresler;


    public Musteri(Integer id, String mail, List<Adres> adresler) {
        this.id = id;
        this.mail = mail;
        this.adresler = adresler;
    }

    public Musteri(String mail, List<Adres> adresler) {
        this.mail = mail;
        this.adresler = adresler;
    }

    public Integer getId() {
        return id;
    }

    public String getMail() {
        return mail;
    }

    public List<Adres> getAdresler() {
        return adresler;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setAdresler(List<Adres> adresler) {
        this.adresler = adresler;
    }
}
