import java.util.function.IntUnaryOperator;

public class CycleDetection {

    public static boolean hasCycle(
            int start,
            IntUnaryOperator f
    ) {

        int slow = start;
        int fast = start;

        while (true) {

            slow = f.applyAsInt(slow);

            fast = f.applyAsInt(
                    f.applyAsInt(fast)
            );

            if (slow == fast) {
                return true;
            }
        }
    }

    public static void main(String[] args) {

        IntUnaryOperator f1 =
                x -> (x + 1) % 5;

        Object[][] tests = {

            {
                0,
                f1,
                true
            },

            {
                0,
                (IntUnaryOperator)
                (x -> x < 10 ? x + 1 : x),
                true
            },

            {
                0,
                (IntUnaryOperator)
                (x -> x == 5 ? 0 : x + 1),
                true
            }
        };

        int passed = 0;

        for (int i = 0; i < tests.length; i++) {

            int start =
                    (int) tests[i][0];

            IntUnaryOperator f =
                    (IntUnaryOperator)
                    tests[i][1];

            boolean expected =
                    (boolean)
                    tests[i][2];

            boolean result =
                    hasCycle(start, f);

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