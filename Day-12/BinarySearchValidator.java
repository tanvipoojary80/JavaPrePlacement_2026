public class BinarySearchValidator {

    public static int binarySearch(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] sortedArray =
                {1,2,3,4,5,6,7,8,9,10};

        Object[][] tests = {
            {sortedArray, 5, 4},
            {sortedArray, 1, 0},
            {sortedArray, 10, 9},
            {sortedArray, 11, -1},
            {new int[]{}, 5, -1},
            {new int[]{1}, 1, 0},
            {new int[]{1}, 2, -1}
        };

        int passed = 0;

        for (int i = 0; i < tests.length; i++) {

            int[] nums =
                    (int[]) tests[i][0];

            int target =
                    (int) tests[i][1];

            int expected =
                    (int) tests[i][2];

            int result =
                    binarySearch(
                        nums,
                        target
                    );

            if (result == expected) {

                passed++;

                System.out.println(
                        "Test "
                        + (i + 1)
                        + " passed"
                );

            } else {

                System.out.println(
                        "Test "
                        + (i + 1)
                        + " FAILED"
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