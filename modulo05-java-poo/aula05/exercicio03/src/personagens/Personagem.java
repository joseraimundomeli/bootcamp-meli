package personagens;

import rpg_jogo.armas.Arma;

public abstract class Personagem {
    protected String nome;
    protected Integer nivel;
    protected String classe;
    protected Arma arma;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public abstract void gritoDeGuerra();
}
