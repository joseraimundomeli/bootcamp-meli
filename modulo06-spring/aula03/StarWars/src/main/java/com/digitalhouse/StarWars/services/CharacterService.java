package com.digitalhouse.StarWars.services;

import com.digitalhouse.StarWars.dtos.CharacterDTO;

public interface CharacterService {
    CharacterDTO findByName(String name);
}
