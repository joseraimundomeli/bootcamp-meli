package br.com.digitalhouse.CalculadoraCalorias.dtos;

import java.util.ArrayList;

public class PratoResqustDTO {
    private String nome;
    private ArrayList<String> ingredientes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "PratoResqustDTO{" +
                "nome='" + nome + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
