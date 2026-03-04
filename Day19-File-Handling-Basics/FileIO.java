import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileIO {
    public static void main(String[] args) {
      String[] myfriends = {"Doni", "Manikandan", "Nanda Kishore", "Nikil", "Nithish Kumar"};
      try {
        BufferedWriter writer = new BufferedWriter(new FileWriter("Output.txt"));
        writer.write("Accessing the file.");
        writer.write("\n"); // New line
        writer.write("My friends are:");
        for(String friend : myfriends) {
          writer.write("\n     " + friend);
        }
        writer.close();
      } 
      catch (Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
      }
      try {
         BufferedReader reader = new BufferedReader(new java.io.FileReader("Output.txt"));
         String line;
         while ((line = reader.readLine()) != null) {
             System.out.println(line);
         }
         reader.close();
      } 
      catch (Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
      }
     
    }
}


/*
Output.txt
  Accessing the file.
  My friends are:
     Doni
     Manikandan
     Nanda Kishore
     Nikil
     Nithish Kumar


Output : (Console)
  Accessing the file.
  My friends are:
     Doni
     Manikandan
     Nanda Kishore
     Nikil
     Nithish Kumar

*/

