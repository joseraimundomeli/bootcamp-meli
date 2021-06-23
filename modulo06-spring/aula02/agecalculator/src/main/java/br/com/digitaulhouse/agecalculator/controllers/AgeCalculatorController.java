package br.com.digitaulhouse.agecalculator.controllers;


import br.com.digitaulhouse.agecalculator.dtos.AgeDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Locale;

@RestController
public class AgeCalculatorController {

    @GetMapping("/{day}/{month}/{year}")
    public AgeDTO getAge(@PathVariable Integer day,@PathVariable Integer month,@PathVariable Integer year){
        AgeDTO ageDto = new AgeDTO();
        ageDto.setDate(day +"/" + month + "/" + year);
        ageDto.setIdade(this.calculateAge(day, month, year));
        return ageDto;
    }
    private Integer calculateAge(Integer day, Integer month, Integer year){
        Period age;
        try {
            LocalDate date = LocalDate.of(year, month, day);
            age = Period.between(date, LocalDate.now());
            return age.getYears();
        }catch (Exception ex){
            return  0;
        }
    }
}
