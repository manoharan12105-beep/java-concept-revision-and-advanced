class AppForm {
	String name;
	int rollNo;
	//Constructor
	AppForm(String name, int rollNo) {
		this.name = name;
		this .rollNo= rollNo;
	}
    
	public void display() {
		System.out.println(name);
		System.out.println(rollNo);
	}
}

public class Main
{
	public static void main(String[] args) {
		AppForm nikil = new AppForm("Nikil R.I", 108);
		System.out.println(nikil.name);
		System.out.println(nikil.rollNo);
		AppForm nithish = new AppForm("Nithish S", 110);
		nithish.display();
	}
}

/* 
OUTPUT :

Nikil R.I
108
Nithish S
110

*/



