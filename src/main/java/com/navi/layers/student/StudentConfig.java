package com.navi.layers.student;

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
            Student ivanJr = new Student(
                    "Ivan",
                    "ivanjrjesus01@gmail.com",
                    LocalDate.of(2001, Month.JUNE, 27));

            Student ivanSantos = new Student(
                    "Ivan Santos",
                    "ivansuper@gmail.com",
                    LocalDate.of(1973, Month.SEPTEMBER, 04));

            Student carmen = new Student(
                    "Carmen Gomes",
                    "carmenjesus01@gmail.com",
                    LocalDate.of(1970, Month.NOVEMBER, 04));

            repository.saveAll(List.of(ivanJr, ivanSantos, carmen));
        };
    }

}
