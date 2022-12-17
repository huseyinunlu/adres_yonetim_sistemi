package com.example.adres_yonetim_sistemi.musteri;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class CustomerConfig {
    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            Customer customer = new Customer("malik@gmail.com", "1234");
            customerRepository.save(customer);
        };
    }
}
