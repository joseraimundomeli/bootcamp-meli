import rpg_jogo.armas.Arco;
import rpg_jogo.armas.Cajado;
import rpg_jogo.personagens.Barbaro;
import rpg_jogo.personagens.FactoryBarbaro;
import rpg_jogo.personagens.Personagem;

public class main {
    public static void main(String[] args) {

        Personagem personagem = new FactoryBarbaro().criaPersonagem();
        personagem.gritoDeGuerra();
        personagem.getArma().ataca();
        personagem.setArma(new Cajado());
        personagem.getArma().ataca();
        personagem.setArma(new Arco());
        personagem.getArma().ataca();


    }
}
