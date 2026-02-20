class GenericExample<T> {
	T thingToPrint;

	public GenericExample(T thingToPrint) {
		this.thingToPrint = thingToPrint;
	}

	public void print() {
		System.out.println("Value : " + thingToPrint + " (" + thingToPrint.getClass().getSimpleName() + ")");
	}

	public <U> void showBoth(T first, U second) {
		System.out.println("First : " + first + " (" + first.getClass().getSimpleName() + ")" +
		                   " | Second : " + second + " (" + second.getClass().getSimpleName() + ")");
	}
}

public class Main {
	public static void main(String[] args) {
		GenericExample<Integer> integerPrinter = new GenericExample<>(123);
		GenericExample<String> stringPrinter = new GenericExample<>("Hello");

		integerPrinter.print();
		stringPrinter.print();

		integerPrinter.showBoth(10, "Java");
		stringPrinter.showBoth("Backend", 3.14);
	}
}

/*
Output : 

Value : 123 (Integer)
Value : Hello (String)
First : 10 (Integer) | Second : Java (String)
First : Backend (String) | Second : 3.14 (Double)

Link : https://onlinegdb.com/McTnW1S7f
*/
