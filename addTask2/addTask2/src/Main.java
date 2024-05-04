import java.io.IOException;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String fileName = "example.txt";
        try {
            Map<String, Integer> wordCounts = WordCounter.countWordFrequencies(fileName);
            WordCounter.printWordFrequencies(wordCounts);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}