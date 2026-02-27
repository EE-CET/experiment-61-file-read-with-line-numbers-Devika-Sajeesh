import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileLineReader {
    public static void main(String[] args) {
        String fileName = "input.txt";
        
        try{
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            int lineNumber = 1;
            while((line = reader.readLine()) != null){
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }
        } catch (IOException e) {
            System.err.println("An IOException occurred: " + e.getMessage());
        }
        
        
    }
}
