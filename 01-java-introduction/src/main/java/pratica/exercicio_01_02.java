package pratica;

import java.util.Scanner;

public class exercicio_01_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m =  input.nextInt();
        for (int i = 0; i < n; i++) {
            if (n % m == 0)  System.out.println(i);
        }
    }
}
