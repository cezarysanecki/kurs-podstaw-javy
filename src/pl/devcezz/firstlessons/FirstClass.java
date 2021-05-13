package pl.devcezz.firstlessons;

import java.util.Random;

public class FirstClass {

    public static void main(String[] args) {
        Point p1 = new Point(10, 5);
        Point p2 = new Point();
        System.out.println(p1.x);
        Section section = new Section(p1, p2);
        System.out.println(section.length());

        System.out.println("====");

        for (int i = 0; i < 10; i++) {
            Point point = generatePoint();
            printPoint(point, "p" + (i + 1));
        }
    }

    public static Point generatePoint() {
        Random random = new Random();
        return new Point(random.nextInt(20), random.nextInt(20));
    }

    public static void printPoint(Point point, String name) {
        System.out.println("pl.devcezz.firstlessons.Point " + name + " [x=" + point.x + ", y=" + point.y + "]");
    }
}
