import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReplaceWordInFile {

    public static void main(String[] args){

        String inputFile = "input.txt";
        String outputFile = "output.txt";

        String oldWord = "Handling";
        String newWord = "Handling Practice";

        try{
            BufferedReader reader = new BufferedReader(new FileReader("inputFile.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("outputFile.txt"));

            String line;

            while ((line = reader.readLine()) != null){

                line = line.replace(oldWord, newWord);

                writer.write(line);
                writer.newLine();
            }

            reader.close();
            writer.close();

            System.out.println("Word replaced successfully.");

        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}

/*

inputFile.txt(file)
  Java File Handling
  Practice makes perfect
  Backend development

outputFile.txt(file)
  Java File Handling Practice
  Practice makes perfect
  Backend development


Output : Word replaced successfully.

  */

  
