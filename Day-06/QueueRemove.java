import java.util.*;
public class QueueRemove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
            q.add(sc.nextInt());
        q.remove();
        System.out.println(q);
    }
}