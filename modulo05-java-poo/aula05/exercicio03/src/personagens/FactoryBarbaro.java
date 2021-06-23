package personagens;

import rpg_jogo.armas.Espada;

public class FactoryBarbaro implements FactoryPersonagem {

    @Override
    public Personagem criaPersonagem() {
        return new Barbaro("Barbaro", new Espada(), 0);
    }
}
