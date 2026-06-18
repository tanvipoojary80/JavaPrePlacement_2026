import java.util.*;
public class ArrayListRemoveEven {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());
        list.removeIf(x -> x % 2 == 0);
        System.out.println(list);
        sc.close();
    }
}