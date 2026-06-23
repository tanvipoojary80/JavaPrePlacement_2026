import java.util.*;

class TestCase {

    final String input;
    final String expectedOutput;

    TestCase(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof TestCase)) {
            return false;
        }

        TestCase t = (TestCase) obj;

        return Objects.equals(input, t.input)
                &&
                Objects.equals(
                        expectedOutput,
                        t.expectedOutput
                );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                input,
                expectedOutput
        );
    }
}

public class TestCaseStore {

    static class TestCaseManager {

        private final Map<
                String,
                List<TestCase>
        > map =
                new HashMap<>();

        public void addTestCase(
                String problemId,
                String input,
                String expectedOutput
        ) {

            map.computeIfAbsent(
                    problemId,
                    k -> new ArrayList<>()
            )
            .add(
                    new TestCase(
                            input,
                            expectedOutput
                    )
            );
        }

        public List<TestCase> getTestCases(
                String problemId
        ) {

            return map.getOrDefault(
                    problemId,
                    Collections.emptyList()
            );
        }
    }

    public static void main(
            String[] args
    ) {

        TestCaseManager manager =
                new TestCaseManager();

        manager.addTestCase(
                "sum",
                "1 2 3",
                "6"
        );

        manager.addTestCase(
                "sum",
                "0 0",
                "0"
        );

        manager.addTestCase(
                "max",
                "5 3 9",
                "9"
        );

        manager.addTestCase(
                "max",
                "1",
                "1"
        );

        boolean test1 = manager
                .getTestCases("sum")
                .equals(
                        Arrays.asList(
                                new TestCase(
                                        "1 2 3",
                                        "6"
                                ),
                                new TestCase(
                                        "0 0",
                                        "0"
                                )
                        )
                );

        boolean test2 = manager
                .getTestCases("max")
                .equals(
                        Arrays.asList(
                                new TestCase(
                                        "5 3 9",
                                        "9"
                                ),
                                new TestCase(
                                        "1",
                                        "1"
                                )
                        )
                );

        boolean test3 = manager
                .getTestCases(
                        "unknown"
                )
                .isEmpty();

        System.out.println(
                "Test 1: "
                + (test1 ? "passed" : "FAILED")
        );

        System.out.println(
                "Test 2: "
                + (test2 ? "passed" : "FAILED")
        );

        System.out.println(
                "Test 3: "
                + (test3 ? "passed" : "FAILED")
        );
    }
}