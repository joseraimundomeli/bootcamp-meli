import java.util.ArrayList;

public class EventoSystem {
    private ArrayList<Convidado> listaConvidadeos = new ArrayList<>();
    private ArrayList<FogoArtificio> listaFogos = new ArrayList<>();

    public void registraConvidado(Convidado c){
        listaConvidadeos.add(c);
    }

    public void registarFogo(FogoArtificio f){
        listaFogos.add(f);
    }

    public void exibeFogos(){
        listaFogos.stream().forEach((x) -> x.fazSom());
    }



    public void exibeListaConvidados(){
        listaConvidadeos.stream().forEach((x) -> System.out.println("Convidado: " +
                x.getNome() + " " +
                x.comemora()));
    }
}
