import java.util.Scanner;
class ifelse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age = 0;
        while(age<18 || age>60){
            System.out.println("Enter the age:");
            age=sc.nextInt();
            System.out.println("Valid age");
            sc.close();

        }
        }
           
    }
