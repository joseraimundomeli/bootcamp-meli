import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        GuardaRoupa guardaRoupa = new GuardaRoupa();


        ArrayList<Vestuario> roupasDaPaulo = new ArrayList<>();
        roupasDaPaulo.add(new Vestuario("Calvin Klein", "Camiseta"));
        roupasDaPaulo.add(new Vestuario("Calvin Klein", "Meias"));
        roupasDaPaulo.add(new Vestuario("Calvin Klein", "Calça"));
        roupasDaPaulo.add(new Vestuario("Calvin Klein", "Cueca"));

        ArrayList<Vestuario> roupasDaMaria = new ArrayList<>();
        roupasDaMaria.add(new Vestuario("Prada", "Moletom"));
        roupasDaMaria.add(new Vestuario("Prada", "Short"));
        roupasDaMaria.add(new Vestuario("Prada", "Saia"));
        roupasDaMaria.add(new Vestuario("Prada", "Xale"));

        Integer codigo = guardaRoupa.guardarVestuarios(roupasDaMaria);
        System.out.println(codigo);
        guardaRoupa.mostrarVestuarios(codigo);
        codigo = guardaRoupa.guardarVestuarios(roupasDaPaulo);
        System.out.println(codigo);
        guardaRoupa.mostrarVestuarios(codigo);

        guardaRoupa.mostrarVestuarios();

    }
}
