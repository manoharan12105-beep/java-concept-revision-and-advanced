import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWordsInFile {
    public static void main(String[] args){
        String fileName = "data.txt";
        int wordCount = 0;
        try{
            BufferedReader reader = new BufferedReader(new FileReader("sourceFile.txt"));
            String line;

            while((line = reader.readLine()) != null) {

                String[] words = line.trim().split("\\s+");

                if (!line.trim().isEmpty()){
                    wordCount += words.length;
                }
            }

            reader.close();

            System.out.println("Total Words: " + wordCount);

        } catch (IOException e) {
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
  Total Words: 8

*/
