package com.digitalhouse.StarWars.repositories;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.digitalhouse.StarWars.dtos.CharacterDTO;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Repository
public class CharacterRepositoryImpl implements CharacterRepository{

    @Override
    public List<CharacterDTO> listCharacters() {
        File file = null;
        try{
            file = ResourceUtils.getFile("classpath:starwars.json");
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        ObjectMapper mapper = new ObjectMapper();

        TypeReference<List<CharacterDTO>> typeRef = new TypeReference<>(){};
        List<CharacterDTO> ingredienteDTOSs = null;

        try {
            ingredienteDTOSs = mapper.readValue(file,  typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ingredienteDTOSs;
    }
}
