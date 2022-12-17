package com.example.adres_yonetim_sistemi.musteri;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(path="api/v1/musteri")
public class musteriController {

    private final musteriService musteriService;

    @Autowired
    public musteriController(musteriService musteriService){
        this.musteriService = musteriService;
    }
    @GetMapping
    public List<Musteri> getMusteriler(){
        return musteriService.getMusteriler();
    }


}
