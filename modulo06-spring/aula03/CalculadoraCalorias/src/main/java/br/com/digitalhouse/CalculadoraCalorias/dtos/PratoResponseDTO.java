package br.com.digitalhouse.CalculadoraCalorias.dtos;

import java.util.List;

public class PratoResponseDTO {
    private String nome;
    private Integer totalCalories;
    private IngredienteDTO maxCaloric;
    private List<IngredienteDTO> ingredientes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getTotalCalories() {
        return totalCalories;
    }

    public void setTotalCalories(Integer totalCalories) {
        this.totalCalories = totalCalories;
    }

    public IngredienteDTO getMaxCaloric() {
        return maxCaloric;
    }

    public void setMaxCaloric(IngredienteDTO maxCaloric) {
        this.maxCaloric = maxCaloric;
    }

    public List<IngredienteDTO> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<IngredienteDTO> ingredientes) {
        this.ingredientes = ingredientes;
    }
}