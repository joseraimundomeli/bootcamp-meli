package br.com.digitalhouse.CalculadoraCalorias.respositories;

public class test {
    public static void main(String[] args) {
        PratoRepository p = new PratoRepository();
        System.out.println(p.loadIngredientes());
    }
}
