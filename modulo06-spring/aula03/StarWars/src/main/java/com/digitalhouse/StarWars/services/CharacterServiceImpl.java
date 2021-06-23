package com.digitalhouse.StarWars.services;

import com.digitalhouse.StarWars.dtos.CharacterDTO;
import com.digitalhouse.StarWars.repositories.CharacterRepository;
import com.digitalhouse.StarWars.repositories.CharacterRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;
import java.util.Optional;

@Service
public class CharacterServiceImpl implements CharacterService{

    private CharacterRepository characterRepository = new CharacterRepositoryImpl();

    @Override
    public CharacterDTO findByName(String name) {
        List<CharacterDTO> characters = this.characterRepository.listCharacters();
        Optional<CharacterDTO> character = characters
                .stream()
                .filter(
                        x -> x.getName().toLowerCase().contains(name.toLowerCase())
                ).findFirst();

        if (character.isEmpty()){
            throw new RuntimeException("Character not found!");
        }
        return character.get();
    }
}
