package com.example.adres_yonetim_sistemi.musteri;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class musteriService {

    public List<Musteri> getMusteriler(){
        return List.of(new Musteri("malik@gmail.com", "1234"));
    }
}
