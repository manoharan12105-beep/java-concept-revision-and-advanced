import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileContent{
    public static void main(String[] args){
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        try{
            BufferedReader reader = new BufferedReader(new FileReader("sourceFile.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("destinationFile.txt"));

            String line;

            while((line = reader.readLine()) != null){
                writer.write(line);
                writer.newLine();
            }

            reader.close();
            writer.close();

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}


/*
source.txt(file)

  Java File Handling
  Practice makes perfect
  Backend development

destination.txt(file)

  Java File Handling
  Practice makes perfect
  Backend development

//Output : File copied successfully.

  */

