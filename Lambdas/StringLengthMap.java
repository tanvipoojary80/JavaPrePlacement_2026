import java.util.*;
import java.util.function.Function;

public class StringLengthMap {

    public static List<Integer> map(List<String> list, Function<String, Integer> mapper) {
        List<Integer> result = new ArrayList<>();

        for (String s : list) {
            result.add(mapper.apply(s));
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("code", "java", "fun");

        List<Integer> lengths = map(words, s -> s.length());

        System.out.println(lengths);
    }
}