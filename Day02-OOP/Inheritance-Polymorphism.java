// Inheritance and polymorphism :

class Employee {
	String name ;
	double salary;

	Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	void work() {
		System.out.println(name + " is working");
	}
}

// Inheritance
class Developer extends Employee {
	Developer(String name, double salary) {
		super(name, salary);
	}

	//polymorphism
	void work() {
		System.out.println(name + " is writing code");
	}
}

// Inheritance
class Manager extends Employee {
	Manager(String name, double salary) {
		super(name, salary);
	}

	//polymorphism
	void work() {
		System.out.println(name + " is managing a team");
	}
}

public class Main {
	public static void main(String[] args) {
		Employee emp = new Employee("Doni", 50000);
		Developer dev = new Developer("Mani", 65000);
		Manager manager = new Manager("David", 95000);
		emp.work();
		dev.work();
		manager.work();
	}
}

/*
Output :

Doni is working
Mani is writing code
David is managing a team

Link : https://onlinegdb.com/tRWBc079N
*/
