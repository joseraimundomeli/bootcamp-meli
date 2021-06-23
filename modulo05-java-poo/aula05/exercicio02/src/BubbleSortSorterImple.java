import java.util.Comparator;

public class BubbleSortSorterImple<T> implements Sorter<T>{

    private Comparator<T> comparator;

    @Override
    public void sort(T[] arr, Comparator<T> c) {
        this.comparator = c;
        bubbleSort(arr);
    }

    public void bubbleSort(T arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(this.comparator.compare(arr[i], arr[j]) > 0){
                    Object o = arr[i];
                    arr[i] = arr[j];
                    arr[j] = (T) o;
                }
            }
        }
    }
}
