import java.util.List;

public class BinarySearch {

    public static int binarySearch(List<Integer> sortedList, int target) {
        int left = 0;
        int right = sortedList.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (sortedList.get(mid) == target) {
                return mid;
            } else if (sortedList.get(mid) < target) {
                left = mid + 1; // Игнорируем левую часть
            } else {
                right = mid - 1; // Игнорируем правую часть
            }
        }
        return -1;
    }


}