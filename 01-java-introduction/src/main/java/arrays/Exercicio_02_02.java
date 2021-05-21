package arrays;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercicio_02_02 {

    public static class Empresa{
        String nome;
        Double valor;
        Double crescimento;

        public Empresa(String nome, Double valor, Double crescimento){
            this.nome = nome;
            this.valor = valor;
            this.crescimento = crescimento;
        }

        public double updateValor(){
            this.valor = this.valor * crescimento;
            return (this.valor);
        }
    }

    public static String printEmpresaNaData(Empresa emp, String data) {
        return emp.nome + " - " + data + " - Valor da empresa: " + emp.valor + "m";
    }

    public static void main(String[] args) {
        Empresa empresaX = new Empresa("Empresa X", 1.13,14.80);
        Empresa empresaY = new Empresa("Empresa Y", 18.4,3.20);

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");

        while (true){
            empresaX.updateValor();
            empresaY.updateValor();

            calendar.add(Calendar.YEAR, 1);

            System.out.println(printEmpresaNaData(empresaX, dt.format(calendar.getTime()).toString()));
            System.out.println(printEmpresaNaData(empresaY, dt.format(calendar.getTime()).toString()));

            if (empresaX.valor > empresaY.valor) {
                break;
            }
        }
    }
}
