package exercicio01;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i < n+1; i+=2) {
            int result = 0;
            for (int j = 3; j < i; j+=2) {
                if (i % j == 0){
                    result = 1;
                }
            }
            if(result == 0){
                System.out.println(i);
            }
        }
    }
}
