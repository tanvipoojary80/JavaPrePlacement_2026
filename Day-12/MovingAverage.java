import java.util.*;

public class MovingAverage {

    public static List<Double> movingAverage(int[] nums, int k) {

        List<Double> result = new ArrayList<>();

        if (nums == null || nums.length == 0 || k <= 0 || k > nums.length) {
            return result;
        }

        double sum = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (i >= k) {
                sum -= nums[i - k];
            }

            if (i >= k - 1) {

                result.add(sum / k);

                System.out.println(
                    "Window: "
                    + Arrays.toString(
                        Arrays.copyOfRange(nums, i - k + 1, i + 1)
                    )
                    + " -> Avg = "
                    + (sum / k)
                );
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Object[][] tests = {
            {new int[]{1, 2, 3, 4, 5}, 3, Arrays.asList(2.0, 3.0, 4.0)},
            {new int[]{5, 5, 5, 5}, 1, Arrays.asList(5.0, 5.0, 5.0, 5.0)},
            {new int[]{}, 3, Collections.emptyList()},
            {new int[]{10}, 1, Arrays.asList(10.0)},
            {new int[]{1, 2, 3, 4, 5}, 5, Arrays.asList(3.0)},
            {new int[]{1, 2, 3, 4, 5}, 6, Collections.emptyList()}
        };

        int passed = 0;

        for (int i = 0; i < tests.length; i++) {

            int[] nums = (int[]) tests[i][0];
            int k = (int) tests[i][1];

            @SuppressWarnings("unchecked")
            List<Double> expected = (List<Double>) tests[i][2];

            List<Double> result = movingAverage(nums, k);

            if (expected.equals(result)) {
                passed++;
                System.out.println("Test " + (i + 1) + " passed");
            } else {
                System.out.println("Test " + (i + 1) + " FAILED");
                System.out.println("Expected: " + expected);
                System.out.println("Got: " + result);
            }

            System.out.println();
        }

        System.out.println(passed + "/" + tests.length + " tests passed");
    }
}