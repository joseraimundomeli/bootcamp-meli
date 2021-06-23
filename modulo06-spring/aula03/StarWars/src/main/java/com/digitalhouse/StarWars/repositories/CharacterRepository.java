package com.digitalhouse.StarWars.repositories;

import com.digitalhouse.StarWars.dtos.CharacterDTO;

import java.util.List;

public interface CharacterRepository {
    List<CharacterDTO> listCharacters();
}
