import java.util.*;
public class LinkedListRemove {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++)
            list.add(sc.nextLine());
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}