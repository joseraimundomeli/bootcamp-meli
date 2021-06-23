import java.util.ArrayList;

public class FogoPacote extends ArrayList<FogoArtificio> implements  FogoArtificio{
    public FogoPacote(){
    }

    @Override
    public void fazSom() {
        this.stream().forEach(x -> x.fazSom());
    }
}
