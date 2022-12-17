package com.example.adres_yonetim_sistemi.address;

import jakarta.persistence.*;


@Entity
@Table(name="adresler")
public class Address {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    @Column(name="adresIsmi", unique = true)
    String addressName;
    String city;
    String district;
    Long customerId;

    public Address(String addressName, String city, String district, Long customerId) {
        this.addressName = addressName;
        city = city;
        district = district;
        this.customerId = customerId;
    }

    public Address(Integer id, String addressName, String city, String district, Long customerId) {
        this.id = id;
        this.addressName = addressName;
        city = city;
        district = district;
        this.customerId = customerId;
    }

    public Address() {

    }


    public String getAddressName() {
        return addressName;
    }

    public String getCity() {
        return city;
    }

    public String getDistrict() {
        return district;
    }

    public Long getCustomerId() {
        return customerId;
    }



    public void setAddressName(String adresIsmi) {
        this.addressName = adresIsmi;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setCustomerId(Long musteri) {
        this.customerId = musteri;
    }


}
