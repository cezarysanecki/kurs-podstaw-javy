package pl.devcezz.things.diffrent;

import pl.devcezz.things.Chest;
import pl.devcezz.things.Lamp;
import pl.devcezz.things.Thing;

public class Fun {

    public static void main(String[] args) {
        Thing[] things = new Thing[3];
        things[0] = new Chest();
        things[1] = new Chest();
        things[2] = new Lamp();

//        Chest chest = new Chest();
//        chest.doSomething();
//        Thing thing = chest;
//        thing.doSomething();

        for (Thing t : things) {
            t.interactWith();
        }

        System.out.println("====");

        for (Thing t2 : things) {
            guessThing(t2);
        }

        System.out.println("====");

        Lamp lamp = new Lamp();
        Thing thing = lamp;
        Lamp lamp2 = (Lamp) thing;
    }

    public static void guessThing(Thing thing) {
        if (thing instanceof Chest) {
            System.out.println("It is a chest");
        } else if (thing instanceof Lamp) {
            System.out.println("It is a lamp");
        } else {
            System.out.println("I don't know this thing.");
        }
    }
}
