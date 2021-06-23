

public class Pessoa implements Precedente{
    private String cpf;
    private String nome;

    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public int precedeA(Object o) {
        // Primeiro compara o nome

        if (this.nome.compareToIgnoreCase(((Pessoa) o).nome) > 0){
            return 1;
        }else if(this.nome.compareToIgnoreCase(((Pessoa) o).nome) < 0){
            return 0;
        }else{
            // Caso o nome seja igual compara o cpf
            if (this.cpf.compareTo(((Pessoa) o).cpf) < 0){
                return 0;
            }else if(this.cpf.compareTo(((Pessoa) o).cpf) > 0){
                return 1;
            }
        }
        // se ambos os dados forem igual, não mexe em nada
        return 0;
    }
}

