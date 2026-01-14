package Exercise2;

public class GenericMethods {
    public <T, U, V> void printElements(T first, U second, V third) {
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}