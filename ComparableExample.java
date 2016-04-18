import comparable.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Real world example of how to sort objects using the Comparable interface.
 */
public class ComparableExample {
    private List<Person> people = new ArrayList<>();

    public ComparableExample() {
        // Let's add some people to the list that made the world a better place
        this.people.add(new Person("Grace", "Hopper"));
        this.people.add(new Person("Edsger","Dijkstra"));
        this.people.add(new Person("Dennis","Ritchie"));
        this.people.add(new Person("Alan",  "Turing"));
        this.people.add(new Person("Ada",   "Lovelace"));
    }

    /**
     * Print all people
     */
    public void printAll(String message) {
        System.out.println(message);
        this.people.forEach(System.out::println);
        System.out.println();
    }

    /**
     * Sort the array according to the compareTo method we implemented in Person.
     * Collections.sort invokes compareTo method during each comparison.
     */
    public void sort() {
        Collections.sort(this.people);
    }

    public static void main(String[] args) {
        ComparableExample example = new ComparableExample();
        example.printAll("Unsorted array:");

        example.sort();
        example.printAll("Sorted array:");
    }
}
