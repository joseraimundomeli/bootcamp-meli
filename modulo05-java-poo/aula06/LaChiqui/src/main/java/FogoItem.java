public class FogoItem implements FogoArtificio{
    private String sound;

    public FogoItem(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }


    @Override
    public void fazSom() {
        System.out.println(this.sound);
    }
}
