package arrays;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exercicio_02_03 {
    static  class Produto{
        Integer codigo;
        String nome;
        Double valor;
        Integer quantidade;

        public Produto(Integer codigo, String nome, Double valor, Integer quantidade) {
            this.codigo = codigo;
            this.nome = nome;
            this.valor = valor;
            this.quantidade = quantidade;
        }

        @Override
        public String toString() {
            return "Produto " + codigo + "\n"
                    + nome + "\n" +
                    "R$" + valor + "\n"+
                    "Quantidade: " + quantidade+ "\n";
        }

        public Double getValorTotal(){
            return this.valor * this.quantidade;
        }
    }
    public static void main(String[] args) {
        HashMap<Integer, Produto> produtos = new HashMap<Integer, Produto>();

        produtos.put(1, new Produto(1, "Arroz", 10.99, 2));
        produtos.put(2, new Produto(2, "Feijão", 14.49, 1));
        produtos.put(3, new Produto(3, "Tomate", 9.99, 5));
        Double valor_total = 0.0;
        for (Map.Entry<Integer, Produto> prod: produtos.entrySet()) {
            System.out.println(prod.getValue().toString());
            valor_total = valor_total + prod.getValue().getValorTotal();
        }
        System.out.println("Valor total: R$"+valor_total);
    }
}
