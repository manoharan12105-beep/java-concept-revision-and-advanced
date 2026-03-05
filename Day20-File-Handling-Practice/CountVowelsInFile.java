import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountVowelsInFile{
    public static void main(String[] args){
        String fileName = "data.txt";
        int vowelCount = 0;
        try{
            BufferedReader reader = new BufferedReader(new FileReader("fileName.txt"));
            String line;

            while((line = reader.readLine()) != null){
                line = line.toLowerCase();

                for (int i = 0; i < line.length(); i++) {
                    char ch = line.charAt(i);

                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowelCount++;
                    }
                }
            }
            reader.close();

            System.out.println("Total Vowels: " + vowelCount);

        } 
        catch (IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

/*
fileName.txt : 


    import java.io.BufferedReader;
    import java.io.FileReader;
    import java.io.IOException;
    
    public class CountVowelsInFile{
        public static void main(String[] args){
            String fileName = "data.txt";
            int vowelCount = 0;
            try{
                BufferedReader reader = new BufferedReader(new FileReader("fileName.txt"));
                String line;
                while((line = reader.readLine()) != null){
                    line = line.toLowerCase();
    
                    for (int i = 0; i < line.length(); i++) {
    
                        char ch = line.charAt(i);
    
                        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                            vowelCount++;
                        }
                    }
                }
                reader.close();
    
                System.out.println("Total Vowels: " + vowelCount);
            } 
            catch (IOException e){
                System.out.println("Error reading file: " + e.getMessage());
            }
        }
    }



Output : 
  Total Vowels: 182

*/
