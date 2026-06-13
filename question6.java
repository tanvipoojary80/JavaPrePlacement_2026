/* Series: 1, 4, 7, 12, 23 */

import java.util.Scanner;
public class question6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int a=1;

        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            a=a+i*i;
        }
    }
}