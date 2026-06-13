import java.util.Scanner;
public class pattern {
    public static void main(String[]args) {
        int n=5;
        for (int i=n;i>=1;i--) {
            for (char j='A';j<'A'+i;j++) {
                System.out.print(" ");
            }
                for (int s=1;s<=(n-i)*2-1;s++); {
                    System.out.print(" ");
                }
                for (char j=(char)('A'+i-2);j>='A';j--) {
                    System.out.print(j);
                }
                System.out.println();
                }
            }
        }
    
