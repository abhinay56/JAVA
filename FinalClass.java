final class Animal {

    final void sound() {
        System.out.println("Animal makes sound");
    }
}

/*class Dog extends Animal {

}*/

public class FinalClass {

    public static void main(String[] args) {

        Animal d = new Animal();
        d.sound();
    }
}