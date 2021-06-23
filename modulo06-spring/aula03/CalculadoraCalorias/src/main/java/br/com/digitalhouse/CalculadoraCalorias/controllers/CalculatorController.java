package br.com.digitalhouse.CalculadoraCalorias.controllers;

import br.com.digitalhouse.CalculadoraCalorias.dtos.IngredienteDTO;
import br.com.digitalhouse.CalculadoraCalorias.dtos.PratoResponseDTO;
import br.com.digitalhouse.CalculadoraCalorias.dtos.PratoResqustDTO;
import br.com.digitalhouse.CalculadoraCalorias.respositories.PratoRepository;
import br.com.digitalhouse.CalculadoraCalorias.services.IngredientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/")
public class CalculatorController {

    @Autowired
    private PratoRepository respositoryPrato;

    @Autowired
    private IngredientesService ingredientesService;

    @GetMapping("/test")
    public ResponseEntity<PratoResponseDTO> caloriesCalculator(@RequestBody PratoResqustDTO pratoRequest){
        ArrayList<IngredienteDTO> selectIngredients = new ArrayList<>();
        for (String ingredientName : pratoRequest.getIngredientes()) {
            selectIngredients.add(respositoryPrato.findByName(ingredientName));
        }

        PratoResponseDTO pratoResponse = new PratoResponseDTO();
        pratoResponse.setNome(pratoRequest.getNome());
        pratoResponse.setIngredientes(selectIngredients);
        pratoResponse.setMaxCaloric(ingredientesService.computerMaxCalories(selectIngredients));
        pratoResponse.setTotalCalories(ingredientesService.computerTotalCalories(selectIngredients));

        return new ResponseEntity<>(pratoResponse, HttpStatus.OK);
    }
}
