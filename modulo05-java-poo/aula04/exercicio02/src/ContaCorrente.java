import java.util.ArrayList;
import java.util.List;

public class ContaCorrente implements Conta {
    private String codigo = "C-Default";
    private Double saldo = 0.0;
    private List<String> extrato = new ArrayList<>();

    public ContaCorrente(){
        this.extrato.add(this.codigo + "Valor atual: " + this.saldo);
    }

    public ContaCorrente(String codigo, Double saldo){
        this.saldo = saldo;
        this.codigo = codigo;
        this.extrato.add("Saldo atual: " + this.saldo);
    }

    public ContaCorrente(ContaCorrente c){
        this.saldo = c.getSaldo();
    }

    @Override
    public Double deposito(Double valor){
        this.saldo = this.saldo + valor;
        this.extrato.add("Deposito de : " + valor + " - Saldo atual: " + this.saldo);
        return this.saldo;
    }

    @Override
    public Double saque(Double valor){
        this.saldo = this.saldo - valor;
        this.extrato.add("Saque de : " + valor + " - Saldo atual: " + this.saldo);
        return this.saldo;
    }

    @Override
    public Double transferencia(Double valor, ContaCorrente destino){
        if (this.saldo < valor){
            System.out.println("Saldo insuficiente!");
            return 0.0;
        }
        this.saldo = this.saldo - valor;
        this.extrato.add("Transferancia de: " + valor + " para " + destino.getCodigo() + " - Saldo atual: " + this.saldo);
        destino.deposito(valor);
        return this.saldo;
    }

    @Override
    public void extrato(){
        System.out.println("XXXXXXXXXXX- " +this.codigo+ " -XXXXXXXXXXXX");
        extrato.stream().forEach(x -> System.out.println(this.codigo + " -> " + x));
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.extrato.add(this.codigo + " alterou o nome para " + codigo);
        this.codigo = codigo;
    }
}
