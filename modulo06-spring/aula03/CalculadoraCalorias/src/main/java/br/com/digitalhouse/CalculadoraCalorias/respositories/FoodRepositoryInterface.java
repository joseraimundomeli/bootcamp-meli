package br.com.digitalhouse.CalculadoraCalorias.respositories;

import br.com.digitalhouse.CalculadoraCalorias.dtos.IngredienteDTO;

import java.util.List;

public interface FoodRepositoryInterface {
    public List<IngredienteDTO> loadIngredientes();
    public IngredienteDTO findByName(String name);
}
