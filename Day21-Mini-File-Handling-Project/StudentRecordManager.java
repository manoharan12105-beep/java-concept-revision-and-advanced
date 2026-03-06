import java.io.*;
import java.util.Scanner;
public class StudentRecordManager{
    static final String FILE_NAME = "students.txt";
  
    public static int getNextId(){
        int lastId = 0;
        try(BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))){
            String line;

            while((line = reader.readLine()) != null){
                String[] data = line.split(",");
                lastId = Integer.parseInt(data[0]);
            }
        }
        catch(IOException e){
            return 1;
        }
        return lastId + 1;
    }

    public static void addStudent(String name, int age){
        int id = getNextId();

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))){
            writer.write(id + "," + name + "," + age);
            writer.newLine();
            System.out.println("Student added with ID: " + id);
        }
        catch(IOException e){
            System.out.println("Error writing file.");
        }
    }

    public static void viewStudents(){
        try(BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))){
            String line;

            while((line = reader.readLine()) != null){
                String[] data = line.split(",");
                System.out.println("ID: " + data[0] + " | Name: " + data[1] + " | Age: " + data[2]);
            }
        }
        catch(IOException e){
            System.out.println("Error reading file.");
        }
    }

    public static void searchStudent(int id){
        try(BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))){
            String line;
            boolean found = false;

            while((line = reader.readLine()) != null){
                String[] data = line.split(",");

                if(Integer.parseInt(data[0]) == id){
                    System.out.println("Found -> Name: " + data[1] + ", Age: " + data[2]);
                    found = true;
                }
            }

            if(!found)
                System.out.println("Student not found.");
        }
        catch(IOException e){
            System.out.println("Error searching file.");
        }
    }

    public static void deleteStudent(int id){
        File inputFile = new File(FILE_NAME);
        File tempFile = new File("temp.txt");

        boolean found = false;

        try(
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))
        ){
            String line;

            while((line = reader.readLine()) != null){
                String[] data = line.split(",");
                int currentId = Integer.parseInt(data[0]);

                if(currentId == id){
                    found = true;
                    continue;
                }

                writer.write(line);
                writer.newLine();
            }
        }
        catch(IOException e){
            System.out.println("Error deleting record.");
            return;
        }

        inputFile.delete();
        tempFile.renameTo(inputFile);

        if(found)
            System.out.println("Student deleted successfully.");
        else
            System.out.println("Student ID not found.");
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search by ID");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            if(!scanner.hasNextInt()){
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter age: ");

                    if(!scanner.hasNextInt()){
                        System.out.println("Invalid age.");
                        scanner.next();
                        continue;
                    }

                    int age = scanner.nextInt();
                    addStudent(name, age);
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    System.out.print("Enter student ID: ");
                    int searchId = scanner.nextInt();
                    searchStudent(searchId);
                    break;

                case 4:
                    System.out.print("Enter student ID to delete: ");
                    int deleteId = scanner.nextInt();
                    deleteStudent(deleteId);
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}





/*
Output :

1. Add Student
2. View Students
3. Search by ID
4. Delete Student
5. Exit
1
Enter name: Manoharan M
Enter age: 20
Student added with ID: 1

1. Add Student
2. View Students
3. Search by ID
4. Delete Student
5. Exit
1
Enter name: Manikandan A
Enter age: 20
Student added with ID: 2

1. Add Student
2. View Students
3. Search by ID
4. Delete Student
5. Exit
1
Enter name: Nikil R
Enter age: 20
Student added with ID: 3

1. Add Student
2. View Students
3. Search by ID
4. Delete Student
5. Exit
1
Enter name: Doni A
Enter age: 21
Student added with ID: 4

1. Add Student
2. View Students
3. Search by ID
4. Delete Student
5. Exit
2
ID: 1 | Name: Manoharan M | Age: 20
ID: 2 | Name: Manikandan A | Age: 20
ID: 3 | Name: Nikil R | Age: 20
ID: 4 | Name: Doni A | Age: 21

1. Add Student
2. View Students
3. Search by ID
4. Delete Student
5. Exit
3
Enter student ID: 3
Found -> Name: Nikil R, Age: 20

1. Add Student
2. View Students
3. Search by ID
4. Delete Student
5. Exit
1
Enter name: Nithish Kumar V
Enter age: 19
Student added with ID: 5

1. Add Student
2. View Students
3. Search by ID
4. Delete Student
5. Exit
2
ID: 1 | Name: Manoharan M | Age: 20
ID: 2 | Name: Manikandan A | Age: 20
ID: 3 | Name: Nikil R | Age: 20
ID: 4 | Name: Doni A | Age: 21
ID: 5 | Name: Nithish Kumar V | Age: 19

1. Add Student
2. View Students
3. Search by ID
4. Delete Student
5. Exit
4
Enter student ID to delete: 4
Student deleted successfully.

1. Add Student
2. View Students
3. Search by ID
4. Delete Student
5. Exit
2
ID: 1 | Name: Manoharan M | Age: 20
ID: 2 | Name: Manikandan A | Age: 20
ID: 3 | Name: Nikil R | Age: 20
ID: 5 | Name: Nithish Kumar V | Age: 19

1. Add Student
2. View Students
3. Search by ID
4. Delete Student
5. Exit
5

*/
