package br.com.digitalhouse.FirstProject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FirstController {
    @GetMapping("/{numero}")
    public String cumprimento(@PathVariable String numero){
        ConversorDecimalRomano convesor = new ConversorDecimalRomano();
        String response = convesor.conversor(Integer.parseInt(numero));
        return response;
    }

    public void conversor(){

    }
}
