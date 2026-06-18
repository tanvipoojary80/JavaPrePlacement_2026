import java.util.*;
public class QueueDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
            q.add(sc.nextInt());
        System.out.println(q);
        sc.close();
    }
}