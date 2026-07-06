abstract class Vechicle {
    String vec;
    Vechicle(String name) {
        this.vec = name;
    }
    abstract void start();
    void fuleType() {
        System.out.println("Vehicle: " + vec);
        System.out.println("fuleType : PETROL");
    }
}
class Bike extends Vechicle {
    Bike() {
        super("Bike");
    }
    void start() {
        System.out.println("Bike is Started");
    }
}
class Car extends Vechicle {
    Car() {
        super("Car");
    }
    void start() {
        System.out.println("Car is Started");
    }
}
public class Abstraction
{
	public static void main(String[] args) {
		Vechicle v;
		v = new Bike();
		v.start();
		v = new Car();
		v.start();
	}
}