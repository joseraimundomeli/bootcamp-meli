import java.util.List;

public interface Conta {
    Double deposito(Double valor);

    Double saque(Double valor);

    Double transferencia(Double valor, ContaCorrente destino);

    void extrato();
}
