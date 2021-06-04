package pl.devcezz.methods;

public class KitchenRoom extends Room {

    private String walls;

    public KitchenRoom(String floor, String walls) {
        super(floor, walls);
        this.walls = walls;
    }

    private void infoWalls() {
        System.out.println("The kitchen room has green walls");
    }

    private static void infoSurface() {
        System.out.println("Surface of room is 588");
    }

    @Override
    public void infoFloor() {
        System.out.println("Info floor from kitchen room");
    }

    public static void main(String[] args) {
        KitchenRoom kitchenRoom = new KitchenRoom("black floor", "white walls");
        kitchenRoom.infoFloor();
        kitchenRoom.infoWalls();

        KitchenRoom.infoHeight();
        KitchenRoom.infoSurface();
        System.out.println(kitchenRoom.walls);
    }
}
