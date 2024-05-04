import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 7, 4, 1, 8);
        System.out.println(maxSumOfArray(numbers));
    }

    public static int maxSumOfArray(List<Integer> numbers) {
        if (numbers == null || numbers.size() < 2) {
            throw new IllegalArgumentException("Некорректный массив");
        }
        // Найдем два максимальных числа в списке
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        return max1 + max2;
    }
}