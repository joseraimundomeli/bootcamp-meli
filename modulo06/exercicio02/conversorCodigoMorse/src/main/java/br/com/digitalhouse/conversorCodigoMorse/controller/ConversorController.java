package br.com.digitalhouse.conversorCodigoMorse.controller;

import br.com.digitalhouse.conversorCodigoMorse.services.DecoderMorse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ConversorController {
    @GetMapping("/{codigo}")
    public String conversor(@PathVariable String codigo){
        DecoderMorse decoder = new DecoderMorse();
        String result = decoder.decoderMorse(codigo);
        return result;
    }

}
