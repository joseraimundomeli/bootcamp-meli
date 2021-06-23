package com.digitalhouse.StarWars.controllers;

import com.digitalhouse.StarWars.services.CharacterService;
import com.digitalhouse.StarWars.services.CharacterServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CharacterController {


    private CharacterService characterService = new CharacterServiceImpl();

    @GetMapping("/{name}")
    public ResponseEntity<?> findCharacterByNameContent(@PathVariable String name){
        return new ResponseEntity<>(characterService.findByName(name), HttpStatus.OK);
    }
}
