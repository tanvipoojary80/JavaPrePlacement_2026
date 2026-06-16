import java.util.*;
public class ArrayListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();
        System.out.println("Enter numbers:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.print("Enter operation (Insert/Delete): ");
        String op = sc.next();
        if (op.equals("Insert")) {
            System.out.print("Enter position: ");
            int pos = sc.nextInt();
            System.out.print("Enter value: ");
            int val = sc.nextInt();
            list.add(pos, val);
        }
        if (op.equals("Delete")) {
            System.out.print("Enter position: ");
            int pos = sc.nextInt();
            list.remove(pos);
        }
        System.out.println("Output: " + list);
    }
}