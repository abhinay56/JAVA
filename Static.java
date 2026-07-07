class Student {

    String name;
    static String college = "ACE Engineering College";

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
    }
}

public class Static {

    public static void main(String[] args) {

        Student s1 = new Student("Abhinay");
        Student s2 = new Student("Rahul");

        s1.display();
        System.out.println();

        s2.display();
    }
}