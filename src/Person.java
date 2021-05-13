import java.util.Random;

public class Person {

    static int COUNTER = 0;

    final String name;

    public Person(final String name) {
        this.name = name;
        COUNTER++;
    }

    public void greet() {
        System.out.println("Hello. My name is " + name + ".");
    }

    public static int countPeople() {
        return COUNTER;
    }

    public static void main(String[] args) {
        System.out.println("There are " + Person.countPeople() + " people.");
        Person john = new Person("John");
        Person jane = new Person("Jane");

        john.greet();
        System.out.println("There are " + Person.countPeople() + " people.");

        // Person.greet();
        Person frank = new Person("Frank");
        frank.greet();
        System.out.println("There are " + Person.countPeople() + " people.");

        frank.greetFriends();
    }

    public void greetFriends() {
        System.out.println("I have " + (Person.COUNTER - 1) + " friends. Hello!");
    }
}
