public class ComplexityScore {

    public static int scoreComplexity(String code) {

        if (code == null || code.trim().isEmpty()) {
            return 0;
        }

        int current = 0;
        int max = 0;

        for (String word : code.split(" ")) {

            if ("for".equals(word)) {

                current++;

                if (current > max) {
                    max = current;
                }

            } else {

                current = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Object[][] tests = {
            {"for for for", 3},
            {"for", 1},
            {"for for", 2},
            {"", 0},
            {"no loop", 0},
            {"for something for", 1},
            {"for if for", 1}
        };

        int passed = 0;

        for (int i = 0; i < tests.length; i++) {

            String code = (String) tests[i][0];

            int expected =
                    (int) tests[i][1];

            int result =
                    scoreComplexity(code);

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
}