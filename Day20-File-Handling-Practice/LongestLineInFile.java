import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LongestLineInFile{
    public static void main(String[] args){
        String fileName = "data.txt";
        String longestLine = "";
        int maxLength = 0;

        try{
            BufferedReader reader = new BufferedReader(new FileReader("sourceFile.txt"));
            String line;

            while ((line = reader.readLine()) != null){

                if (line.length() > maxLength){
                    maxLength = line.length();
                    longestLine = line;
                }

            }

            reader.close();

            System.out.print("Longest Line : ");
            System.out.println(longestLine);
            System.out.println("Length: " + maxLength);

        } catch (IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

/*
sourceFile.txt(file)
  Java File Handling
  Practice makes perfect
  Backend development

Output : 
  Longest Line : Practice makes perfect
  Length: 22

*/
