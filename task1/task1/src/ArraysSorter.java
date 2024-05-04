import java.util.Arrays;

public class ArraysSorter {
    // sortArrayByAsc - сортирует массив по возрастанию
    public static int[] sortArrayByAsc(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Некорректный массив");
        }
        Arrays.sort(array);
        return array;
    }
}
