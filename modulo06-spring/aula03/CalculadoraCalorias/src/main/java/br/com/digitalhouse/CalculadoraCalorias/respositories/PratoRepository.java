package br.com.digitalhouse.CalculadoraCalorias.respositories;

import br.com.digitalhouse.CalculadoraCalorias.dtos.IngredienteDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;
import java.io.File;
import java.io.IOException;
import java.util.List;


@Repository
public class PratoRepository implements FoodRepositoryInterface {

    @Override
    public List<IngredienteDTO> loadIngredientes() {
        File file = null;
        try{
            file = ResourceUtils.getFile("classpath:food.json");
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        ObjectMapper mapper = new ObjectMapper();

        TypeReference<List<IngredienteDTO>> typeRef = new TypeReference<>(){};
        List<IngredienteDTO> ingredienteDTOSs = null;

        try {
            ingredienteDTOSs = mapper.readValue(file,  typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ingredienteDTOSs;
    }

    @Override
    public IngredienteDTO findByName(String name) {
        List<IngredienteDTO> ingredientes = loadIngredientes();
        ingredientes.forEach(System.out::println);
        IngredienteDTO result =  ingredientes
                                .stream()
                                .filter(x -> x.getName().equals(name))
                                .findFirst()
                                .get();
        // Tratamento do optinal
        return result;
    }
}
