package personagens;

import rpg_jogo.armas.Arma;

public class Barbaro extends Personagem {

    public Barbaro(String nome, Arma arma, Integer nivel){
        this.nome = nome;
        this.arma =  arma;
        this.nivel = nivel;
    }

    @Override
    public void gritoDeGuerra() {
        System.out.println("Barbaro esmaaaaaaga!");
    }
}
