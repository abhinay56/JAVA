class Employee {

    void start() {
        System.out.println("Employee");
    }
}

class Manager extends Employee {

    @Override
    void start() {
        System.out.println("Manager");
    }
}

class Developer extends Employee {

    @Override
    void start() {
        System.out.println("Developer");
    }
}

class Tester extends Employee {

    @Override
    void start() {
        System.out.println("Tester");
    }
}

public class Polymorphism {

    public static void main(String[] args) {

        Employee e;

        e = new Employee();
        e.start();

        e = new Manager();
        e.start();

        e = new Developer();
        e.start();

        e = new Tester();
        e.start();
    }
}