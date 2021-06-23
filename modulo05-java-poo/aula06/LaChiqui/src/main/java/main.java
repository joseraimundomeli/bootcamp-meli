public class main {
    public static void main(String[] args) {
        EventoSystem eventoSystem = new EventoSystem();

        eventoSystem.registraConvidado(new ConvidadoMeli("José"));
        eventoSystem.registraConvidado(new ConvidadoMeli("Paulo"));
        eventoSystem.registraConvidado(new ConvidadoMeli("Amanda"));
        eventoSystem.registraConvidado(new ConvidadeStandard("Gustavo"));
        eventoSystem.registraConvidado(new ConvidadeStandard("Rafael"));
        eventoSystem.exibeListaConvidados();

        FogoPacote fogoP = new FogoPacote();
        fogoP.add(new FogoItem("weii Powwww"));
        fogoP.add(new FogoItem("weeiiiiii Powwww"));
        fogoP.add(new FogoItem("Po Powwww"));
        fogoP.add(new FogoItem("PO PO Powwww"));
        FogoArtificio f = new FogoItem("Phooowowowowowowo");
        eventoSystem.registarFogo(fogoP);
        eventoSystem.registarFogo(f);
        eventoSystem.exibeFogos();
    }
}
