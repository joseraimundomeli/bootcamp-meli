public class main {
    public static void main(String[] args) {
        Contador c1 = new Contador();
        Contador c2 = new Contador(30);
        Contador c3 = new Contador(c1);
        System.out.println("------------------");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        c1.incrementaCount();
        c2.decrementaCount();
        c3.setCount(15);

        System.out.println("------------------");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
