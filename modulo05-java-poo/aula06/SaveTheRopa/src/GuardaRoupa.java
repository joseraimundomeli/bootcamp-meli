import java.util.*;
import java.util.stream.Collectors;

public class GuardaRoupa {

    private static Integer contador = 0;
    private static HashMap<Integer, List<Vestuario>> vestuarios = new HashMap<>();

    public Integer guardarVestuarios(List<Vestuario> listaDeVestuario) {
        contador++;
        vestuarios.put(contador, listaDeVestuario);
        return contador;
    }

    public void mostrarVestuarios(Integer codigo){
        if (vestuarios.containsKey(codigo)) {
            vestuarios.get(codigo).stream().forEach(System.out::println);
        }else{
            System.out.println("Roupas não encontradas!");
        }
    }

    public List<Vestuario> devolverVestuarios(Integer codigo){
        if(vestuarios.containsKey(codigo)) {
            List<Vestuario> roupas = vestuarios.get(codigo).stream().collect(Collectors.toList());
            vestuarios.remove(codigo);
            return roupas;
        }
        return null;
    }

    public void mostrarVestuarios(){
        for (Map.Entry<Integer, List<Vestuario>> vestuario: vestuarios.entrySet()) {
            System.out.println("Chave: " + vestuario.getKey() + " - Valor: " + vestuario.getValue() + "\n");
        }
    }
}