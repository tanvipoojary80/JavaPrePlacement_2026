import java.util.*;
public class LongestUniqueSubstring {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLen = 0;
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
    
    public static void main(String[] args) {
        Object[][] tests = {
                {"abcabcbb", 3},
                {"bbbbb", 1},
                {"pwwkew", 3},
                {"", 0},
                {"a", 1},
                {"abcdef", 6},
                {generateLargeString(100000), 26}
        };
        int passed = 0;
        for (int i = 0; i < tests.length; i++) {
            String input = (String) tests[i][0];
            int expected = (int) tests[i][1];
            long start = System.currentTimeMillis();
            int result = lengthOfLongestSubstring(input);
            long elapsed = System.currentTimeMillis() - start;
            if (result == expected && elapsed < 2000) {
                passed++;
                System.out.println("Test " + (i + 1) + " passed (" + elapsed + " ms)");
            } else {
                System.out.println(
                        "Test " + (i + 1) +
                        " FAILED (got " + result +
                        ", expected " + expected + ")"
                );
            }
        }

        System.out.println(passed + "/" + tests.length + " tests passed");
    }
    private static String generateLargeString(int length) {
        StringBuilder sb = new StringBuilder(length);
        Random r = new Random(42);
        for (int i = 0; i < length; i++) {
            sb.append((char) ('a' + r.nextInt(26)));
        }
        return sb.toString();
    }
}

