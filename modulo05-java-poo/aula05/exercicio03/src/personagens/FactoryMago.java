package personagens;

import rpg_jogo.armas.Cajado;

public class FactoryMago implements FactoryPersonagem{
    @Override
    public Personagem criaPersonagem() {
        return new Mago("Mago", new Cajado(), 0);
    }
}
