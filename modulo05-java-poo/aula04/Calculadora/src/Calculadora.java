public class Calculadora {

    public Double sum(Integer num1, Integer num2){
        return .0;
    }

    public Double sum(String frac, Double num){
        Double dfrac = parse(frac);
        return .0;
    }




    private double parse(String ratio) {
        if (ratio.contains("/")) {
            String[] rat = ratio.split("/");
            return Double.parseDouble(rat[0]) / Double.parseDouble(rat[1]);
        } else {
            return Double.parseDouble(ratio);
        }
    }
}
