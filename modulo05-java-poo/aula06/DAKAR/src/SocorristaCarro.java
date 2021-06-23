public class SocorristaCarro implements SocorristaInterface{

    @Override
    public void socorrerCarro(Veiculo v) {
        System.out.println("Salvando carros! " + v.getPlaca());
    }
}
