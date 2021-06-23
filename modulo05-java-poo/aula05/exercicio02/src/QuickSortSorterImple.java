import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;


public class QuickSortSorterImple<T> implements Sorter<T> {

    private Comparator<T> comparator;

    @Override
    public void sort(T[] arr, Comparator<T> c) {
        this.comparator = c;
        quickSort(arr, 0, arr.length-1);
    }

    public void quickSort(T[] arr, int l, int h) {
        int[] stack = new int[h - l + 1];
        int top = -1;
        stack[++top] = l;
        stack[++top] = h;
        while (top >= 0) {
            h = stack[top--];
            l = stack[top--];

            int p = partition(arr, l, h);

            if (p - 1 > l) {
                stack[++top] = l;
                stack[++top] = p - 1;
            }

            if (p + 1 < h) {
                stack[++top] = p + 1;
                stack[++top] = h;
            }
        }
    }

    private int partition(T arr[], int low, int high)
    {
        T pivot = arr[high];

        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (this.comparator.compare(arr[j], pivot) > 0) {
                i++;
                T temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        T temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
//        System.out.println(Arrays.stream(arr).collect(Collectors.toList()));
        return i + 1;
    }
}
