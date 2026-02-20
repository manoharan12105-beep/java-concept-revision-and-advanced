import java.util.HashSet;
public class Main {
	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(20);
		numbers.add(40);
		numbers.add(10);
		System.out.println("HashSet Elements: " + numbers);
		System.out.println("Contains 30 : " + numbers.contains(30));
		System.out.println("Contains 50 : " + numbers.contains(50));

		numbers.remove(20);
		System.out.println("After Removing 20: " + numbers);

		System.out.println("Size of HashSet: " + numbers.size());
	}
}

/*
Output 

HashSet Elements: [20, 40, 10, 30]
Contains 30 : true
Contains 50 : false
After Removing 20: [40, 10, 30]
Size of HashSet: 3

Link : https://onlinegdb.com/ZuEnLvWba6
*/
