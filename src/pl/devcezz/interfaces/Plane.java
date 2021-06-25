package pl.devcezz.interfaces;

public class Plane implements FlyAbility {

    @Override
    public void fly() {
        System.out.println("Flying using power of engine");
    }

    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.fly();
    }
}
