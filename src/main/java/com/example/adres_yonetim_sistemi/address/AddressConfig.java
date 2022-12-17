package com.example.adres_yonetim_sistemi.address;


import com.example.adres_yonetim_sistemi.musteri.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AddressConfig {


    @Bean
    CommandLineRunner commandLineRunner(AddressRepository adresRepository){
        return args -> {
            Customer musteri = new Customer();
            Address adres = new Address("Ev", "Istanbul", "Kagithane", musteri.getId());
            adresRepository.save(adres);
        };
    }
}
