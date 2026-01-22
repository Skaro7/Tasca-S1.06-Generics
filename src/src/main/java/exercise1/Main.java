package exercise1;

public class Main {
    public static void main(String[] args) {
        NoGenericMethods obj1 = new NoGenericMethods("Hello", 123, 45.67);
        NoGenericMethods obj2 = new NoGenericMethods(45.67, "Hello", 123);
        NoGenericMethods obj3 = new NoGenericMethods(123, 45.67, "Hello");

        System.out.println("Object 1:\n" + obj1 +
                "\n\nObject 2:\n" + obj2 +
                "\n\nObject 3:\n" + obj3);

        System.out.println("\nUsing printElements method:");
        obj1.printElements();
    }
}