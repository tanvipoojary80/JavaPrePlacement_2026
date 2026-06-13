/* Print odd numbers*/

import java.util.Scanner;
public class question2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter N:");

        int n=sc.nextInt();
        
        for(int i=1;i<=n;i+=2){
            System.out.println(i+" ");
        }
    }
}