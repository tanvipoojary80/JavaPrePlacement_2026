import java.util.*;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> seen = new HashSet<>(nums.length);

        for (int num : nums) {
            if (!seen.add(num)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Object[][] tests = {
            {new int[]{1, 2, 3, 1}, true},
            {new int[]{1, 2, 3, 4}, false},
            {new int[]{}, false},
            {new int[]{1}, false},
            {new int[]{0, 0, 0, 0}, true},
            {generateDistinctArray(100000), false}
        };

        int passed = 0;

        for (int i = 0; i < tests.length; i++) {

            int[] nums = (int[]) tests[i][0];
            boolean expected = (boolean) tests[i][1];

            long start = System.currentTimeMillis();

            boolean result = containsDuplicate(nums);

            long elapsed =
                    System.currentTimeMillis()
                    - start;

            if (result == expected && elapsed < 500) {

                passed++;

                System.out.println(
                    "Test "
                    + (i + 1)
                    + " passed ("
                    + elapsed
                    + " ms)"
                );

            } else {

                System.out.println(
                    "Test "
                    + (i + 1)
                    + " FAILED (got "
                    + result
                    + ", expected "
                    + expected
                    + ")"
                );
            }
        }

        System.out.println(
            passed
            + "/"
            + tests.length
            + " tests passed"
        );
    }

    private static int[] generateDistinctArray(
            int size
    ) {

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }

        return arr;
    }
}