/*Generate prime numbers: 2, 3, 5, 7, 11, 13, ... N.*/

import java.util.Scanner;
public class question10{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        for(int i=2;i<=n;i++){
            int count=0;

            for(int j=1;j<=i;j++){
                if(i%j==0)
                    count++;
            }

            if(count==2)
                System.out.print(i+" ");
            sc.close();
        }
    }
}