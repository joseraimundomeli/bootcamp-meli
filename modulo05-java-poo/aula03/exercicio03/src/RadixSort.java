
import java.util.*;
import java.util.stream.Collectors;
public class RadixSort {
    public static ArrayList<String> radixSort(ArrayList<String> sArr, Integer maior){
        if (maior == 0){
            return sArr;
        }
        HashMap<Integer, List<String>> listas = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            final char final_number = (char) (i + 48);
            listas.put(i, sArr.stream().filter((numero) -> numero.charAt(maior-1) ==  final_number).collect(Collectors.toList()));
        }
        ArrayList<String> secondArr = new ArrayList<>();
        for (Map.Entry<Integer, List<String>> numeros: listas.entrySet()) {
            secondArr.addAll(numeros.getValue());
        }
        return radixSort(secondArr,maior - 1);
    }
    public static void main(String[] args) {
        int iArr[] = {16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8};
        Integer maior = String.valueOf(Arrays.stream(iArr).max().getAsInt()).length();
        System.out.println(maior);
        ArrayList<String> sArr = new ArrayList<>();
        for (int n: iArr) {
            sArr.add(String.valueOf(String.format("%0"+maior+"d", n)));
        }
        System.out.println("============");
        System.out.println(radixSort(sArr,  maior));
    }
}