import java.util.*;

public class RemoveShortStrings {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(
            Arrays.asList("a", "code", "java", "is", "fun")
        );

        words.removeIf(s -> s.length() < 4);

        System.out.println(words);
    }
}