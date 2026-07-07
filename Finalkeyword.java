class Student {

    final int x;

    Student(int x) {
        this.x = x;
    }

    void display() {
        System.out.println(x);
    }
}

public class Finalkeyword {

    public static void main(String[] args) {

        Student s = new Student(10);
        Student s1 = new Student(20);

        s.display();
        s1.display();
    }
}