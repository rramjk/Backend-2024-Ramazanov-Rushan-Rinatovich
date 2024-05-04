import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> sortedList = List.of(1, 3, 5, 7, 9, 11, 13, 15);
        int target = 7;
        System.out.println(BinarySearch.binarySearch(sortedList, target));
    }
}