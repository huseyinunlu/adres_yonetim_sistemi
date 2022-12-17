package com.example.adres_yonetim_sistemi.musteri;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerService {

    public List<Customer> getMusteriler(){
        return List.of(new Customer("malik@gmail.com", "1234"));
    }
}
