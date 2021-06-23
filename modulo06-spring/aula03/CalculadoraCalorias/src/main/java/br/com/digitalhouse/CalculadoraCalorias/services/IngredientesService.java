package br.com.digitalhouse.CalculadoraCalorias.services;

import br.com.digitalhouse.CalculadoraCalorias.dtos.IngredienteDTO;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class IngredientesService {

    public IngredienteDTO computerMaxCalories(List<IngredienteDTO> ingredientes){
        IngredienteDTO result = ingredientes.stream()
                                    .max(Comparator.comparingInt(IngredienteDTO::getCalories))
                                    .stream().findFirst()
                                    .get();
        return result;
    }

    public Integer computerTotalCalories(List<IngredienteDTO> ingredientes){
        Integer result = ingredientes.stream().
                mapToInt(IngredienteDTO::getCalories).
                reduce(Integer::sum).
                getAsInt();
        return result;
    }
}
