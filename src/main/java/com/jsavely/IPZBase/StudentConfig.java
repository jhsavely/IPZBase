package com.jsavely.IPZBase;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student john = new Student(
                    "John",
                    LocalDate.of(1990, AUGUST, 27),
                    "johnny@beautiful.server.on.the web"
            );
            Student bill = new Student(
                    "Bill",
                    LocalDate.of(1996, MARCH, 1),
                    "bill@beautiful.server.on.the web"
            );
            repository.saveAll(
                    List.of(
                            john, bill
                    )
            );
        };
    }
}
