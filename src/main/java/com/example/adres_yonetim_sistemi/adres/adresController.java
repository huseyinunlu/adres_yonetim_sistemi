package com.example.adres_yonetim_sistemi.adres;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/adres")
@RestController
public class adresController {

    @GetMapping
    public String firstPage() {
        return "Hello World";
    }
}
