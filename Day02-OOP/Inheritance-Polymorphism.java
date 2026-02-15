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
	
	void increament(){
	    salary += salary * 0.05;
	}
	
	void display(){
	    System.out.println("Name : " + name);
	    System.out.println("salary : " + salary);
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
	
	void increament(){
	    salary += salary * 0.15;
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
	
	void increament(){
	    salary += salary * 0.10;
	}
	
}

public class Main {
	public static void main(String[] args) {
		Employee emp = new Employee("Doni", 50000);
		Employee dev = new Developer("Mani", 65000);
		Employee manager = new Manager("David", 95000);
		emp.work();
		dev.work();
		manager.work();
		dev.increament();
		dev.display();
	}
}

/*
Output :

Doni is working
Mani is writing code
David is managing a team
Name : Mani
salary : 74750.0


Link : https://onlinegdb.com/tRWBc079N
*/
