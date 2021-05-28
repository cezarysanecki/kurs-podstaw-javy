package pl.devcezz.inheritance;

import pl.devcezz.inheritance.dev.Developer;

public class InheritanceClass {

    public static void main(String[] args) {
        Worker worker = new Worker("Frank", 2500);
        worker.work();
        Manager manager = new Manager("Ana", 5000);
        manager.work();
        Developer developer = new Developer("Jeff", 4000);
        developer.work();

        manager.order();

        Worker manager2 = manager;
        Worker developer2 = developer;

        System.out.println("====");

        manager2.work();
        developer2.work();

//        manager2.order();

        Worker newWorker = new Worker("John", 900);
        Worker newDeveloper = new Developer("Mark", 3400);
        Worker newManager = new Manager("Patrick", 7000);

        System.out.println(newWorker.getBaseInfo());
        System.out.println(newDeveloper.getBaseInfo());
        System.out.println(newManager.getBaseInfo());
    }
}
