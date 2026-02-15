//Interface
interface Workable {
	void work();
}

class Developer implements Workable {
	public void work() {
		System.out.println("Developer is writing code");
	}
}

class Manager implements Workable {
	public void work() {
		System.out.println("Manager is managing team");
	}
}

public class Main {
	public static void main(String[] args) {
		Workable dev = new Developer();
		Workable manager = new Manager();
		dev.work();
		manager.work();
	}
}

/*
Output :

Developer is writing code
Manager is managing team

Link : https://onlinegdb.com/f67uv2_kd

*/
