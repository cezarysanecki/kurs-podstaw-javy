package pl.devcezz.firstlessons;

public class Section {

    final Point p1;
    final Point p2;

    public Section(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double length() {
        int deltaX = p2.x - p1.x;
        int deltaY = p2.y - p1.y;
        // √((x2 - x1)^2 + (y2 - y1)^2)
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }
}
