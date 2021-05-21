package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercicio_02_01 {
    public static void main(String[] args) {
        Integer[] array = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};
        ArrayList<Integer> array_temp = new ArrayList<>(Arrays.asList(array));

        System.out.println(array_temp.stream().max(Integer::compareTo));
        Collections.sort(array_temp);
        System.out.println(array_temp);
        Collections.reverse(array_temp);
        System.out.println(array_temp);
    }
}
