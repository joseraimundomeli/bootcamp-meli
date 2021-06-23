import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Corrida {
    private Double distancia;
    private Double premioEmDolares;
    private String nome;
    private Integer quantidadeVeiculosPermitidos;
    private ArrayList<Veiculo> listaVeiculos;
    private SocorristaCarro salvaVidasCarro;
    private SocorristaMoto salvaVidasMoto;

    public Corrida(Double distancia, Double premioEmDolares, String nome, Integer quantidadeVeiculosPermitidos, SocorristaCarro salvaVidasCarro, SocorristaMoto salvaVidasMoto) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
        this.listaVeiculos  = new ArrayList<>();
        this.salvaVidasCarro = salvaVidasCarro;
        this.salvaVidasMoto = salvaVidasMoto;
    }

    public void registrarCarro(Double velocidade, Double acelearacao, Double anguloDeGiro, String placa){
        // verifica se já existe esse carro
        if (this.listaVeiculos.size() < this.quantidadeVeiculosPermitidos) {
            listaVeiculos.add(new Carro(velocidade, acelearacao, anguloDeGiro, placa));
            System.out.println("Carro registrado com sucesso!");
        }else{
            System.out.println("Limite de veiculos atingido!");
        }
    }

    public void registrarMoto(Double velocidade, Double acelearacao, Double anguloDeGiro, String placa){
        // verifica se já existe esse moto
        if (this.listaVeiculos.size() < this.quantidadeVeiculosPermitidos) {
            listaVeiculos.add(new Moto(velocidade, acelearacao, anguloDeGiro, placa));
            System.out.println("Carro registrado com sucesso!");
        }else{
            System.out.println("Limite de veiculos atingido!");
        }
    };

    public void removerVeiculoo(Veiculo veiculo){
        // verifica se já existe esse moto

        listaVeiculos.remove(veiculo);
    }

    public void removerVeiculoPorPlaca(String placa){
        var result = listaVeiculos.stream().findFirst().filter((x) -> x.getPlaca().equals(placa));
        listaVeiculos.remove(result.get());
    }

    public void vencedor(){
        var result = listaVeiculos.stream().max(Comparator.comparing((x) -> (x.getVelocidade() * x.getAceleracao())/(x.getAnguloDeGiro() * (x.getPeso() - x.getRodas())))).get();
        System.out.println("Vencedor: " + result.getPlaca());
    }

    public void socorrerCarro(String placa) {
        Carro carro = (Carro) this.listaVeiculos
                .stream()
                .filter(veiculo -> veiculo.getPlaca().equalsIgnoreCase(placa))
                .findFirst()
                .get();
        this.salvaVidasCarro.socorrerCarro(carro);
    }

    public void socorrerMoto(String placa) {
        Moto moto = (Moto) this.listaVeiculos
                .stream()
                .filter(veiculo -> veiculo.getPlaca().equalsIgnoreCase(placa))
                .findFirst()
                .get();
        this.salvaVidasMoto.socorrerCarro(moto);
    }


}
