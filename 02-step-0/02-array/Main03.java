
// Introduction to ArraysList
import java.util.ArrayList;

public class Main03 {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> names = new ArrayList<>();

        // Adding elements to the ArrayList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // Displaying the elements of the ArrayList
        System.out.println("ArrayList elements: " + names);

        // Accessing elements by index
        System.out.println("Element at index 1: " + names.get(1));

        // Modifying an element
        names.set(2, "Eve");
        System.out.println("Modified ArrayList: " + names);

        // Removing an element
        names.remove("Bob");
        System.out.println("ArrayList after removing 'Bob': " + names);

        // Checking if an element is present
        System.out.println("Is 'Alice' present? " + names.contains("Alice"));

        // Getting the size of the ArrayList
        System.out.println("Size of ArrayList: " + names.size());
    }
}
