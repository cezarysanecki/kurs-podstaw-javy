package pl.devcezz.interfaces;

import java.io.Serializable;

public class Duck implements BeingDuck, Serializable {

    private final String name;

    public Duck(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("I'm duck named " + name);
    }

    @Override
    public void fly() {
        System.out.println("Flying using power of wings");
    }

    public static void main(String[] args) {
        Duck duck = new Duck("Johnny");
        duck.introduce();
        duck.fly();
        duck.quack();

        BeingDuck beingDuck = duck;
        beingDuck.fly();
        beingDuck.quack();

        FlyAbility flyingDuck = duck;
        flyingDuck.fly();

        FlyAbility anonymous = new FlyAbility() {
            @Override
            public void fly() {
                System.out.println("Flying using imagination");
            }
        };
        anonymous.fly();

        Plane plane = new Plane();
        plane.fly();

        System.out.println("========");

        method(duck, anonymous, plane);
    }

    public static void method(FlyAbility... objects) {
        for (FlyAbility object : objects) {
            object.fly();
        }
    }
}
