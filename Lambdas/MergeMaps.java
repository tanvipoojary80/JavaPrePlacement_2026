import java.util.*;

public class MergeMaps {
    public static void main(String[] args) {

        Map<String, Integer> m1 = new HashMap<>();
        m1.put("A", 10);
        m1.put("B", 20);

        Map<String, Integer> m2 = new HashMap<>();
        m2.put("B", 30);
        m2.put("C", 40);

        m2.forEach(
            (k, v) -> m1.merge(k, v,
                (oldVal, newVal) -> oldVal + newVal)
        );

        System.out.println(m1);
    }
}