package pratica;

import java.util.Scanner;

public class exercicio_01_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int result = 0;
        for (int i = 3; i < n; i+=2) {
            if (n % i == 0){
                result = 1;
                break;
            }
        }
        if (result == 0){
            System.out.println("é primo");
        }else{
            System.out.println("não é primo");
        };
    }
}
