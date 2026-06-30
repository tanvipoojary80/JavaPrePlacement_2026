import java.util.Scanner;
public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int[] arr = new int[n - 1];
        int sum = 0;
        System.out.println("Enter numbers:");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        int total = n * (n + 1) / 2;
        System.out.println("Missing Number = " + (total - sum));
        sc.close();
    }
}