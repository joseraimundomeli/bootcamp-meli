public class SocorristaMoto implements SocorristaInterface{

    @Override
    public void socorrerCarro(Veiculo v) {
        System.out.println("Salvando motos! " + v.getPlaca());
    }
}