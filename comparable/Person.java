package comparable;

/**
 * Practical example of the usage of interfaces. In this case,
 * we use the Comparable interface.
 */
public class Person implements Comparable<Person> {
    String firstName;
    String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * compareTo is defined in the Comparable interface, which we must implement.
     * We can easily change the behavior of the comparison by only changing one
     * line of code!
     * @param person another person to compare with
     * @return int
     */
    @Override
    public int compareTo(Person person) {
        return this.firstName.compareTo(person.firstName);
        //return this.lastName.compareTo(person.lastName);
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.firstName, this.lastName);
    }
}
