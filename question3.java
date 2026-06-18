/* Print squares of even numbers*/

import java.util.Scanner;
public class question3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter N:");

        int n=sc.nextInt();

        for(int i=2;i*i<=n;i+=2){
            System.out.println((i*i)+"");
            sc.close();
        }
    }
}