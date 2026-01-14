package Exercise2;

public class Main {
    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();

        Person person = new Person("Aitor", "Menta", 47);

        gm.printElements(person, "Hello", 42);
        gm.printElements(4.43, "Patata", person);
        gm.printElements(100, 200, 300);
    }
}
