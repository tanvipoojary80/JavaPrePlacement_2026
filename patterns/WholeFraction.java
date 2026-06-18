import java.util.Scanner;
public class WholeFraction {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        int whole=(int)n;
        double fraction=n-whole;
        System.out.println("Whole = "+whole);
        System.out.println("Fraction = "+fraction);
        sc.close();
    }
}