class Vechile {
    Vechile() {
    System.out.println("Vechile is Started");
    }
}
class Car extends Vechile {
    Car() {
        System.out.println("Car is started and moving");
    }
}
class Bike extends Car {
    Bike() {
        System.out.println("bike is started and moving");
    }
}

public class Inheritance
{
	public static void main(String[] args) {
		Bike v = new Bike();
		
	}
}