import java.util.*;
class Student {
	int id;
	String name;
	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || getClass() != obj.getClass())
			return false;
		Student s = (Student) obj;
		return id == s.id && Objects.equals(name, s.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
}

public class Main {
	public static void main(String[] args) {
		HashSet<Student> set = new HashSet<>();
		Student s1 = new Student(1, "Mano");
		Student s2 = new Student(1, "Mano");
		Student s3 = new Student(2, "Doni");

		set.add(s1);
		set.add(s2);
		set.add(s3);

		System.out.println("Total Students in HashSet: " + set.size());
		for(Student s : set)
			System.out.println(s.id + " " + s.name);
	}
}

/*
Output :

Total Students in HashSet: 2
1 Mano
2 Doni

Link : https://onlinegdb.com/5i1wV4G1b
*/
