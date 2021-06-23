package personagens;

import rpg_jogo.armas.Arma;
import rpg_jogo.armas.Cajado;

public class Mago extends Personagem{
    public Mago(String nome, Arma arma, int nivel) {
        this.nome = nome;
        this.arma = arma;
        this.nivel = nivel;
    }

    @Override
    public void gritoDeGuerra() {
        System.out.println("Alakadabra!");
    }
}
