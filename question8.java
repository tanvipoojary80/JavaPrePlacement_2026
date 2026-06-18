/*Fibonacci Series*/

import java.util.Scanner;
public class question8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int a=1,b=1,c;

        System.out.print(a+" "+b+" ");
        while(true){
            c=a+b;
            if(c>n)
                break;
            System.out.print(c+" ");
            a=b;
            b=c;
            sc.close();
        }
    }
}