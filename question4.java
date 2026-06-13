/*Print squares of even numbers*/

import java.util.Scanner;
public class question4{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter terms:");

        int n=sc.nextInt();
        int a=1;
        
        for(int i=1;i<=n;i++){
            System.out.println(a+"");
            a=a+i;
        }
    }
}