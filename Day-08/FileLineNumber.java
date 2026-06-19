import java.io.*;
public class FileLineNumber {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try (
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;
            int count = 1;

            while ((line = br.readLine()) != null) {
                bw.write(count + ". " + line);
                bw.newLine();
                count++;
            }

            System.out.println("File copied with line numbers.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}