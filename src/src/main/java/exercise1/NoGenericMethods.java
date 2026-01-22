package exercise1;

public class NoGenericMethods {
    private Object element1;
    private Object element2;
    private Object element3;

    public NoGenericMethods(Object element1, Object element2, Object element3) {
        this.element1 = element1;
        this.element2 = element2;
        this.element3 = element3;
    }

    public Object getElement1() {
        return element1;
    }

    public Object getElement2() {
        return element2;
    }

    public Object getElement3() {
        return element3;
    }

    public void printElements() {
        System.out.println("Element 1: " + element1 +
                "\nElement 2: " + element2 +
                "\nElement 3: " + element3);
    }
}