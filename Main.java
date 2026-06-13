import java.util.Scanner;
class Main {
    public{
        var sc=new Scanner(System.in);
        double trainee1=0;
        double trainee2=0;
        double trainee3=0;
        int input=0,i=1;
        for(boolean flag=true;i<=9&&flag ;i++){
            input=sc.nextInt();
            if(input<=1||input>100){
                flag=false;
                else if(i%3==1){
                    trainee1+=input;
                }
            }
        }
    }
}