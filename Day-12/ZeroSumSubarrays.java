import java.util.*;

public class ZeroSumSubarrays {

    public static int countZeroSumSubarrays(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {

            prefixSum += num;

            if (map.containsKey(prefixSum)) {
                count += map.get(prefixSum);
            }

            map.put(
                prefixSum,
                map.getOrDefault(prefixSum, 0) + 1
            );
        }

        return count;
    }

    public static void main(String[] args) {

        int[] largeZeros = new int[10000];

        int expectedLarge =
                10000 * 10001 / 2;

        Object[][] tests = {
            {new int[]{1, -1, 1, -1}, 4},
            {new int[]{0, 0, 0}, 6},
            {new int[]{1, 2, 3}, 0},
            {new int[]{}, 0},
            {largeZeros, expectedLarge}
        };

        int passed = 0;

        for (int i = 0; i < tests.length; i++) {

            int[] input =
                    (int[]) tests[i][0];

            int expected =
                    (int) tests[i][1];

            long start =
                    System.currentTimeMillis();

            int result =
                    countZeroSumSubarrays(input);

            long elapsed =
                    System.currentTimeMillis()
                    - start;

            if (result == expected &&
                elapsed < 2000) {

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
            passed +
            "/" +
            tests.length +
            " tests passed"
        );
    }
}