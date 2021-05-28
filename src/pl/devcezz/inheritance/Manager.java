package pl.devcezz.inheritance;

public class Manager extends Worker {

    public Manager(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println(name + ": I am the boss!");
    }

    public void order() {
        System.out.println("Do it now!");
    }

    @Override
    protected String getThoughts() {
        return "I want new penthouse";
    }
}
