public class ArraySortedCheck {

    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[][] tests = {
            {1, 2, 3, 4, 5},
            {5, 4, 3, 2, 1},
            {},
            {1},
            {1, 1, 1, 1},
            {2, 1, 3},
            new int[100000]
        };

        boolean[] expected = {
            true,
            false,
            true,
            true,
            true,
            false,
            true
        };

        int passed = 0;

        for (int i = 0; i < tests.length; i++) {

            long start = System.nanoTime();

            boolean result = isSorted(tests[i]);

            long elapsed = System.nanoTime() - start;

            if (result == expected[i] && elapsed < 1_000_000) {
                passed++;
                System.out.println("Test " + (i + 1) + " passed");
            } else {
                System.out.println(
                    "Test " + (i + 1) +
                    " FAILED (got " +
                    result +
                    ", expected " +
                    expected[i] +
                    ")"
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