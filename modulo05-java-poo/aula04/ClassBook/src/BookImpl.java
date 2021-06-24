public class BookImpl implements  Book {

    private String title;
    private String situacao = "Disponível";

    public BookImpl(){

    }

    public BookImpl(String title, String situacao){
        this.situacao = situacao;
        this.title = title;
    }

    @Override
    public void emprestimo(){
        this.situacao = "Emprestado";
    }

    @Override
    public void devolver(){
        this.situacao = "Disponível";
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", situacao='" + situacao + '\'' +
                '}';
    }
}
