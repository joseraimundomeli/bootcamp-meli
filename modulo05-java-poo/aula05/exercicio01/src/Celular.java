
public class Celular implements Precedente{
    private String number;
    private String holder;

    public Celular(String number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "number='" + number + '\'' +
                ", holder='" + holder + '\'' +
                '}';
    }

    @Override
    public int precedeA(Object o) {
        // Primeiro compara o nome

        if (this.holder.compareToIgnoreCase(((Celular) o).holder) > 0){
            return 1;
        }else if(this.holder.compareToIgnoreCase(((Celular) o).holder) < 0){
            return 0;
        }else{
            // Caso o nome seja igual compara o cpf
            if (this.number.compareTo(((Celular) o).number) < 0){
                return 0;
            }else if(this.number.compareTo(((Celular) o).number) > 0){
                return 1;
            }
        }
        // se ambos os dados forem igual, não mexe em nada
        return 0;
    }
}

