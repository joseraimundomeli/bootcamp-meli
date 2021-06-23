
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Pessoa pessoas[] = new Pessoa[8];
        pessoas[0] = new Pessoa("01676512471", "Jose");;
        pessoas[1] = new Pessoa("01676512472", "Paulo");
        pessoas[2] = new Pessoa("01676512473", "Gustavo");
        pessoas[3] = new Pessoa("01676512471", "Gustavo");
        pessoas[4] = new Pessoa("01676512472", "Gustavo");
        pessoas[5] = new Pessoa("01676512474", "Henrique");
        pessoas[6] = new Pessoa("01676512475", "Ernest");
        pessoas[7] = new Pessoa("01676512476", "Julia");
        System.out.println("|-------- Lista origianal ----------|");
        for (Pessoa p: pessoas) {
            System.out.println(p);
        }
        System.out.println("|-------- Lista Ordenada ----------|");
        Pessoa[] teste = (Pessoa[]) SortUtil.sort(pessoas);
        for (Object p: teste) {
            System.out.println(p);
        }
    }
}

