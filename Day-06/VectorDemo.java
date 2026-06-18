import java.util.*;
public class VectorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
            v.add(sc.nextInt());
        System.out.println(v);
        sc.close();
    }
}