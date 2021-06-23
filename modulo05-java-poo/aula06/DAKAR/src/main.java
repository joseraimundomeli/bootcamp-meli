public class main {
    public static void main(String[] args) {

        SocorristaCarro salvaVidasCarro = new SocorristaCarro();
        SocorristaMoto salvaVidasMoto = new SocorristaMoto();

        Corrida corridaMaluca = new Corrida(10000., 500000., "Corrida maluca", 5, salvaVidasCarro, salvaVidasMoto);

        corridaMaluca.registrarCarro(100.0, 100.0, 100.0, "PKVX1");
        corridaMaluca.registrarCarro(103.0, 102.0, 101.0, "MPXT2");
        corridaMaluca.registrarMoto(120.0, 105.0, 104.0, "MRTE3");
        corridaMaluca.registrarMoto(80.0, 105.0, 104.0, "VINT2");
        corridaMaluca.registrarCarro(104.0, 103.0, 102.0, "MKFA3");
        corridaMaluca.registrarCarro(105.0, 104.0, 103.0, "MTKF2");
        corridaMaluca.registrarCarro(106.0, 105.0, 104.0, "GYUV2");
        corridaMaluca.registrarMoto(80.0, 105.0, 104.0, "VINT2");





        corridaMaluca.socorrerCarro("PKVX1");
        corridaMaluca.socorrerMoto("VINT2");


        corridaMaluca.vencedor();

    }
}
