public class main {
    public static void main(String[] args) {
        Conta c1 = new ContaCorrente();
        Conta c2 = new ContaCorrente("C2", 50.0);
        ((ContaCorrente) c1).setCodigo("C1");
        System.out.println("--------------------");
        c1.extrato();
        c2.extrato();

        System.out.println("--------------------");
        c1.deposito(1500.00);
        c2.saque(25.0);
        c1.extrato();
        c2.extrato();

        System.out.println("--------------------");
        c1.transferencia(500.0, (ContaCorrente) c2);
        c1.extrato();
        c2.extrato();



    }
}
