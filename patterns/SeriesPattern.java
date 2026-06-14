import java.util.Scanner;
public class SeriesPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        for(int i=1;i<=n;i++){
            if(i%2==0)
                System.out.print(-num+" ");
            else
                System.out.print(num+" ");
            num+=4;
        }
    }
}