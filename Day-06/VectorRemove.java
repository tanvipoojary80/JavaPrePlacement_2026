import java.util.*;
public class VectorRemove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
            v.add(sc.nextInt());
        v.remove(0);
        System.out.println(v);
    }
}