//Abstract Class and abstract method
abstract class Employee {

	String name;
	double salary;
	Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	abstract void work();

	void display() {
		System.out.println(name + " " + salary);
	}
}

class Developer extends Employee {
	Developer(String name, double salary) {
		super(name, salary);
	}

	@Override
	void work() {
		System.out.println(name + " is writing code");
	}
}

public class Main
{
	public static void main(String[] args) {
		Employee dev1 = new Developer("Nandha Kishore", 75000);
		dev1.work();
		dev1.display();
	}
}

/*
Output :

Nandha Kishore is writing code
Nandha Kishore 75000.0

Link : https://onlinegdb.com/9YruNWxte

*/
