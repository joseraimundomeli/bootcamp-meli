import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.Collectors;

public class main {
    private static final int MAX_MAT = 5000;

    public static void genereteData(Object vet[]){
        Random random = new Random();
        for (int i = 0; i < vet.length; i++) {
            vet[i] = random.nextInt(100);
        }
    }

    public static void printArray(Object vet[]){
        for (int i = 0; i < 10; i++) {
            System.out.print(vet[i * 100] + " ");
        }
        System.out.println();
    }

    public static void running(String algoritmo) throws IOException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        System.out.println("|------- " + algoritmo + "-------|");
        System.out.println("Print dos dez primeiros números antes e deopis");

        Integer arr[] = new Integer[MAX_MAT];
        genereteData(arr);
        Comparator c = new MyComparator();
        Time time = new Time();

        printArray(arr);
        Sorter sort = new MyFactory().getInstance(algoritmo);
        time.start();
        sort.sort(arr, c);
        time.stop();
        printArray(arr);
        System.out.println("Total time:" + time.elapsedTime());
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        running("sorterQuick");

        running("sorterBubble");
        running("sorterHeap");


    }
}
