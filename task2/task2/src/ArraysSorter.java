import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArraysSorter {
    // customSort - сортирует массив А посредством использования Map, в которую мы добавляем элементы массива B для дальнейшего сравнения
    public static void customSort(Integer[] A, Integer[] B) {
        if (A == null || B == null) {
            throw new IllegalArgumentException("Некорретный массив");
        }
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < B.length; i++) {
            indexMap.put(B[i], i);
        }

        Arrays.sort(A, (a, b) -> {
            if (indexMap.containsKey(a) && indexMap.containsKey(b)) {
                return indexMap.get(a) - indexMap.get(b);
            } else if (indexMap.containsKey(a)) {
                return -1;
            } else if (indexMap.containsKey(b)) {
                return 1;
            } else {
                return b - a;
            }
        });
    }
}
