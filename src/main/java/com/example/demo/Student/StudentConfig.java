package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {


    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {

          Student john = new Student(
                            "John",
                            "john@gmail.com",
                            LocalDate.of(2002, Month.MAY, 20)
            );

            Student nathan = new Student(
                    "Nathan",
                    "nathan@gmail.com",
                    LocalDate.of(1994, Month.MAY, 20)
            );

            repository.saveAll(List.of(john, nathan));

        };
    }

}
