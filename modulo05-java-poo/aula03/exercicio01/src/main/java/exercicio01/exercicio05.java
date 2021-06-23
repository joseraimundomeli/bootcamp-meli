package exercicio01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/*
Desenvolver um programa para exibição por console os n primeiros números
naturais que têm pelo menos de m dígitos de d, sendo n, m e d valores
que o utilizador vai entrar pela consola.

Por exemplo: se o usuário inserir n = 5, m = 2 e d = 3, o programa
deve exibir os primeiros 5 números naturais que tenham pelo
menos 2 dígitos 3 no console. Neste caso, a saída será:
33, 133 , 233, 303, 313.
*/
public class exercicio05 {

    public static int countChar(final String str, final String c) {
        return str.replaceAll("[^" + c + "]","").length();
    }
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "teste");


    }
}
