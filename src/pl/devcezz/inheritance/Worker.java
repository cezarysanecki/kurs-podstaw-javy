package pl.devcezz.inheritance;

public class Worker {

    protected final String name;
    protected final int salary;

    public Worker(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void work() {
        System.out.println(name + ": I earn " + salary);
    }

    public final void takeABreak() {
        System.out.println("It is time for break!");
    }

    public final String getBaseInfo() {
        return name + ": salary - " + salary + " (" + getThoughts() + ")";
    }

    protected String getThoughts() {
        return "I want new car";
    }
}
