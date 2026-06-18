import java.util.*;
public class IteratorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());
        Iterator<Integer> i = list.iterator();
        while (i.hasNext())
            System.out.print(i.next() + " ");
        sc.close();
    }
}