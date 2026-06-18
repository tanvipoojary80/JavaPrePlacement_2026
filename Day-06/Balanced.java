import java.util.*;
public class Balanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int c = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(')
                c++;
            else
                c--;
        }
        if (c == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
        sc.close();
    }
}