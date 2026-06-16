import java.util.*;
public class LinkedToArray {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
            l.add(sc.nextInt());
        ArrayList<Integer> a = new ArrayList<>(l);
        System.out.println(a);
    }
}