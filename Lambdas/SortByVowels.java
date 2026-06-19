import java.util.*;

public class SortByVowels {

    public static int countVowels(String s) {
        int count = 0;

        for (char ch : s.toLowerCase().toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        List<String> words = new ArrayList<>(
            Arrays.asList("apple", "sky", "banana", "code", "java")
        );

        words.sort((a, b) -> countVowels(a) - countVowels(b));

        System.out.println(words);
    }
}