import java.util.Scanner;
public class NumberToWords {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String num=sc.next();
        String[] words={
                "Zero","One","Two",
                "Three","Four",
                "Five","Six",
                "Seven","Eight",
                "Nine"
        };
        for(int i=0;i<num.length();i++){
            int digit=num.charAt(i)-'0';
            System.out.print(words[digit]+" ");
        }
    }
}