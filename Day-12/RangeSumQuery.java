import java.util.*;
public class RangeSumQuery {
    public static void main(String[] args) {
        int[] largeNums = new int[100000];
        Random r = new Random(123);

        for (int i = 0; i < largeNums.length; i++) {
            largeNums[i] = r.nextInt(100) - 50;
        }

        NumArray na = new NumArray(largeNums);

        int[][] testQueries = {
            {0, 0},
            {0, largeNums.length - 1},
            {100, 200},
            {99999, 99999}
        };

        int[] expectedSums = new int[testQueries.length];

        for (int q = 0; q < testQueries.length; q++) {
            int l = testQueries[q][0];
            int rgt = testQueries[q][1];

            int sum = 0;

            for (int i = l; i <= rgt; i++) {
                sum += largeNums[i];
            }

            expectedSums[q] = sum;
        }

        boolean allPass = true;

        long start = System.currentTimeMillis();

        for (int q = 0; q < testQueries.length; q++) {
            int result = na.sumRange(
                testQueries[q][0],
                testQueries[q][1]
            );

            if (result != expectedSums[q]) {
                System.out.println(
                    "Query [" +
                    testQueries[q][0] +
                    "," +
                    testQueries[q][1] +
                    "] FAILED"
                );

                allPass = false;
            }
        }

        long elapsed = System.currentTimeMillis() - start;

        if (allPass && elapsed < 50) {
            System.out.println(
                "All tests passed in " +
                elapsed +
                " ms"
            );
        } else if (!allPass) {
            System.out.println("Some tests failed");
        } else {
            System.out.println(
                "Too slow (took " +
                elapsed +
                " ms)"
            );
        }
    }
}