import java.util.*;
public class remove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.print("Enter operations: ");
        int q = sc.nextInt();
        while (q > 0) {
            String op = sc.next();
            if (op.equals("Insert")) {
                int pos = sc.nextInt();
                int value = sc.nextInt();
                list.add(pos, value);
            } else {
                int pos = sc.nextInt();
                list.remove(pos);
            }
            q--;
        }
        System.out.println(list);
        sc.close();
    }
}

   

