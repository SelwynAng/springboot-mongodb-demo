package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner runner(StudentRepository repository) {
        return args -> {
            Address address = new Address(
                    "England",
                    "London",
                    "NE9"
            );
            String email = "nabeibai@gmail.com";

            Student student = new Student(
                    "Nabei",
                    "Bai",
                    email,
                    Gender.FEMALE,
                    address,
                    List.of("Computer Science", "Maths"),
                    BigDecimal.TEN,
                    LocalDateTime.now()

            );

            repository.save(student);
        };
    }
}
