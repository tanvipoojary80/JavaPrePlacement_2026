/* Series: 1, 4, 9, 25, 36, 49*/

import java.util.Scanner;
public class question5{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter N: ");
        int n=sc.nextInt();

        for(int i=1;i*i<=n;i++){

            if(i%2!=0 || (i%2==0 && i%3==0))
                System.out.print(i*i+" ");
        }
    }
}
