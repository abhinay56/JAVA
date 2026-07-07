class Demo {

    static void showStatic() {
        System.out.println("This is Static Method");
    }

    void show() {
        System.out.println("This is Non-Static Method");
    }
}

public class StaticMethod {

    public static void main(String[] args) {

        Demo.showStatic();

        Demo d = new Demo();
        d.show();
    }
}