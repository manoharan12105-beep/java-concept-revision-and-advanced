//Encapsulation
class Student {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if(age > 0)
            this.age = age;
    }

    public int getAge() {
        return age;
    }
}
public class Main
{
	public static void main(String[] args) {
		Student st1 = new Student();
		st1.setName("Navin");
		st1.setAge(20);
		System.out.println("Name: " + st1.getName());
		System.out.println("Age : " + st1.getAge());
	}
}

/*
Output :

Name: Navin
Age : 20

*/

