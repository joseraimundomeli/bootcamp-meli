public abstract class Convidado {
    protected String nome;

    public Convidado(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract String comemora();

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
