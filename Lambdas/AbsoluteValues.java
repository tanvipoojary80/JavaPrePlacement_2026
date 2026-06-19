import java.util.*;

public class AbsoluteValues {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(
            Arrays.asList(-2, 5, -7, 0)
        );

        nums.replaceAll(x -> Math.abs(x));

        System.out.println(nums);
    }
}