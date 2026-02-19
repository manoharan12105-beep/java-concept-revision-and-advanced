class GenericExample<T> {
	T thingToPrint;

	public GenericExample(T thingToPrint) {
		this.thingToPrint = thingToPrint;
	}

	public void print() {
		System.out.println("Value : " + thingToPrint + " (" + thingToPrint.getClass().getSimpleName() + ") ");
	}
}

public class Main {
	public static void main(String[] args) {
		GenericExample<Integer> integerPrinter = new GenericExample<>(123);
		GenericExample<Double> doublePrinter = new GenericExample<>(3.14);
		GenericExample<Character> charPrinter = new GenericExample<>('@');
		GenericExample<String> stringPrinter = new GenericExample<>("String");

		integerPrinter.print();
		doublePrinter.print();
		charPrinter.print();
		stringPrinter.print();
	}
}

/*
Output : 

Value : 123 (Integer) 
Value : 3.14 (Double) 
Value : @ (Character) 
Value : String (String) 

Link : https://onlinegdb.com/VVbATAHbEZ
*/
