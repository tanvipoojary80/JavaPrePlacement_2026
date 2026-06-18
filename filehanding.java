import java.io.FileWriter;
public class filehanding{
    public static void main(String[]args){
        try{
            FileWriter fw=new FileWriter("test.txt");
            fw.write("Hello");
            fw.close();
            System.out.println("File Created");
        }catch(Exception e){
            System.out.println("Error");
        }
    }
}     