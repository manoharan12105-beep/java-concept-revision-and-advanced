class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null || getClass() != obj.getClass())
            return false;

        Student s = (Student) obj;
        return this.rollNo == s.rollNo;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Mano", 101);
        Student s2 = new Student("Rahul", 101);
        Student s3 = new Student("Arun", 102);

        System.out.println("s1 equals s2 : " + s1.equals(s2));
        System.out.println("s1 equals s3 : " + s1.equals(s3));
    }
}

/*
Output :

s1 equals s2 : true
s1 equals s3 : false

Link : https://onlinegdb.com/gwZYmGpF_
*/
