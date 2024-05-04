import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordCounter {
        public static Map<String, Integer> countWordFrequencies(String fileName) throws IOException {
            Map<String, Integer> wordCounts = new HashMap<>();
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] words = line.split("\\s+");
                    for (String word : words) {
                        wordCounts.merge(word, 1, Integer::sum);
                    }
                }
            }
            return wordCounts;
        }

        public static void printWordFrequencies(Map<String, Integer> wordCounts) {
            wordCounts.entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        }

}
