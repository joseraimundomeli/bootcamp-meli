package br.com.digitalhouse.CasaCalculator.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CasaController {

    @GetMapping("/")
    public String test(){
        return "Teste";
    }
}
