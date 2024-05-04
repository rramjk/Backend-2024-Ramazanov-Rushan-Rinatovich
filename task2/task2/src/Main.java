import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Integer[] A = {2, 4, 1, 3, 2, 4, 6, 7, 9, 2, 19, 20};
        Integer[] B = {2, 1, 4, 3, 6, 9};
        ArraysSorter.customSort(A, B);
        System.out.println(Arrays.toString(A));
    }
}