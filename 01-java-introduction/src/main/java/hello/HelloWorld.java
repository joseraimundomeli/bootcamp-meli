package hello;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("E aí mundão veio, tudo na paz?!");
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0){
                System.out.println(i + " é par");
            }else{
                System.out.println(i + " éimpar");
            }
        }
    }
}
