package com.example.adres_yonetim_sistemi.adres;

import com.example.adres_yonetim_sistemi.musteri.Musteri;

public class Adres {
    Integer id;
    String adresIsmi;
    String Sehir;
    String Ilce;
    Musteri musteri;

    public Adres(String adresIsmi, String sehir, String ilce, Musteri musteri) {
        this.adresIsmi = adresIsmi;
        Sehir = sehir;
        Ilce = ilce;
        this.musteri = musteri;
    }

    public Adres(Integer id, String adresIsmi, String sehir, String ilce, Musteri musteri) {
        this.id = id;
        this.adresIsmi = adresIsmi;
        Sehir = sehir;
        Ilce = ilce;
        this.musteri = musteri;
    }

    public Integer getId() {
        return id;
    }

    public String getAdresIsmi() {
        return adresIsmi;
    }

    public String getSehir() {
        return Sehir;
    }

    public String getIlce() {
        return Ilce;
    }

    public Musteri getMusteri() {
        return musteri;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAdresIsmi(String adresIsmi) {
        this.adresIsmi = adresIsmi;
    }

    public void setSehir(String sehir) {
        Sehir = sehir;
    }

    public void setIlce(String ilce) {
        Ilce = ilce;
    }

    public void setMusteri(Musteri musteri) {
        this.musteri = musteri;
    }
}
