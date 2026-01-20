package exercise1;

public class Main {
    public static void main(String[] args) {
        NoGenericMethods obj1 = new NoGenericMethods("Hello", 123, 45.67);
        NoGenericMethods obj2 = new NoGenericMethods(45.67, "Hello", 123);
        NoGenericMethods obj3 = new NoGenericMethods(123, 45.67, "Hello");

        System.out.println("Object 1:");
        System.out.println("Element 1: " + obj1.getElement1());
        System.out.println("Element 2: " + obj1.getElement2());
        System.out.println("Element 3: " + obj1.getElement3());

        System.out.println("\nObject 2:");
        System.out.println("Element 1: " + obj2.getElement1());
        System.out.println("Element 2: " + obj2.getElement2());
        System.out.println("Element 3: " + obj2.getElement3());

        System.out.println("\nObject 3:");
        System.out.println("Element 1: " + obj3.getElement1());
        System.out.println("Element 2: " + obj3.getElement2());
        System.out.println("Element 3: " + obj3.getElement3());

        System.out.println("\nUsing printElements method:");
        obj1.printElements();
    }
}