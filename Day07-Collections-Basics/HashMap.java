import java.util.*;
public class Main {
	public static void main(String[] args) {
		HashMap<String, Integer> studentMarks = new HashMap<>();
		studentMarks.put("Mano", 85);
		studentMarks.put("Doni", 90);
		studentMarks.put("Mani", 78);
		studentMarks.put("Mano", 95);

		System.out.println("Student Marks: " + studentMarks);
		System.out.println("Marks of Doni: " + studentMarks.get("Doni"));
		System.out.println("Contains key 'Mani'? " + studentMarks.containsKey("Mani"));

		studentMarks.remove("Mani");
		System.out.println("After Removing Mani: " + studentMarks);

		System.out.println("\nIterating through HashMap:");
		for(Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		System.out.println("\nSize of HashMap: " + studentMarks.size());
	}
}

/*
Output 

Student Marks: {Mano=95, Doni=90, Mani=78}
Marks of Doni: 90
Contains key 'Mani'? true
After Removing Mani: {Mano=95, Doni=90}

Iterating through HashMap:
Mano : 95
Doni : 90

Size of HashMap: 2

Link : https://onlinegdb.com/LaFRG9Kh1u
*/
