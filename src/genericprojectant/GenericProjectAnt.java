package genericprojectant;

class GenericBox<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void displayInfo() {
        if (item != null) {
            System.out.println("Stored Value: " + item);
            System.out.println("Data Type: " + item.getClass().getName());
        } else {
            System.out.println("The box is currently empty.");
        }
    }
}

public class GenericProjectAnt {
    public static void main(String[] args) {
        System.out.println("=== Demonstrating Java Generics ==\n");

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.setItem("Hello, Professor! This is my Generics assignment.");
        stringBox.displayInfo();

        System.out.println("-----------------------------------");

        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.setItem(2026);
        intBox.displayInfo();
    }
}
