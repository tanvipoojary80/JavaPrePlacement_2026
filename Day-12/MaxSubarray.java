import java.util.*;

public class MaxSubarray {

    public static int maxSubArray(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            currentSum =
                Math.max(
                    nums[i],
                    currentSum + nums[i]
                );

            maxSum =
                Math.max(
                    maxSum,
                    currentSum
                );
        }

        return maxSum;
    }

    public static void main(String[] args) {

        Object[][] tests = {

            {
                new int[]{
                    -2, 1, -3, 4,
                    -1, 2, 1,
                    -5, 4
                },
                6
            },

            {
                new int[]{1},
                1
            },

            {
                new int[]{
                    5, 4, -1, 7, 8
                },
                23
            },

            {
                new int[]{},
                0
            },

            {
                generateLargeArray(
                    100000
                ),
                100000
            }
        };

        int passed = 0;

        for (int i = 0; i < tests.length; i++) {

            int[] nums =
                (int[]) tests[i][0];

            int expected =
                (int) tests[i][1];

            long start =
                System.currentTimeMillis();

            int result =
                maxSubArray(nums);

            long elapsed =
                System.currentTimeMillis()
                - start;

            if (
                result == expected
                &&
                elapsed < 2000
            ) {

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

    private static int[] generateLargeArray(
            int size
    ) {

        int[] arr =
            new int[size];

        Arrays.fill(
            arr,
            1
        );

        return arr;
    }
}