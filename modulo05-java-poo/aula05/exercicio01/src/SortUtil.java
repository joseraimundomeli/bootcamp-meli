
public class SortUtil {
    public static <T> Object sort(Precedente<T> arr[]){
        // bubble sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].precedeA((T) arr[j]) == 0){
                    Precedente<T> pTemp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = pTemp;
                    arr[j] = pTemp;
                    arr[j] = pTemp;
                    arr[j] = pTemp;
                }
            }
        }
        return arr;
    }
}

