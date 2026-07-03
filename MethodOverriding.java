class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog makes sound");
    }
}

public class MethodOverriding
{
	public static void main(String[] args) {
	//	Animal c = new Animal();
		Dog d = new Dog();
		d.sound();
	//	c.sound();
	}
}