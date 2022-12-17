package com.example.adres_yonetim_sistemi.musteri;

import jakarta.persistence.*;


@Entity
@Table(name="musteriler")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name="mail", unique = true)
    private String mail;

    @Column(name="password")
    private String password;



    public Customer(String mail, String password) {
        this.mail = mail;
        this.password = password;
    }

    public Customer(Long id, String mail, String password) {
        this.id = id;
        this.mail = mail;
        this.password = password;
    }

    public Customer() {

    }

    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }

    public Long getId() {
        return id;
    }
}