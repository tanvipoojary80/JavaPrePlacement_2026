/* . Display the series: 2, -4, 6, -8, 10, ... N.*/

import java.util.Scanner;
public class question9{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        
        for(int i=2;i<=n;i+=2){
            if(i%4==0){
                System.out.print(-i+"");
                }else{
                    System.out.print(i+"");
                }
            }
        }

    }
