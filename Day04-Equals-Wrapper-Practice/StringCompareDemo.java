import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first string : ");
		String s1 = scanner.nextLine();
		System.out.print("Enter second string : ");
		String s2 = scanner.nextLine();

		System.out.println("\n--- Comparison Result ---");
		if(s1 == s2)
			System.out.println("Using == : Same Reference");
		else
			System.out.println("Using == : Different Reference");

		if(s1.equals(s2))
			System.out.println("Using equals() : Same Value");
		else
			System.out.println("Using equals() : Different Value");
	}
}

/*
Output :

Enter first string : Java
Enter second string : Java

--- Comparison Result ---
Using == : Different Reference
Using equals() : Same Value

Link : https://onlinegdb.com/-tCSK3QawB

*/
