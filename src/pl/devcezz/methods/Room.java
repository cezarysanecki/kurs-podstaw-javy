package pl.devcezz.methods;

public class Room {

    public static int HEIGHT = 260;
    private static int SURFACE = 10;

    public String floor;
    private String walls;

    public Room(final String floor, final String walls) {
        this.floor = floor;
        this.walls = walls;
    }

    public void infoFloor() {
        System.out.println("The room has " + floor);
    }

    private void infoWalls() {
        System.out.println("The room has " + walls);
    }

    public static void infoHeight() {
        System.out.println("Height of room is " + HEIGHT);
    }

    public int getNumberOfRooms() {
        return 4;
    }

    public int getNumberOfRooms(int[] array) {
        return 4;
    }

//    public int getNumberOfRooms(int... array) {
//        return 4;
//    }

    public double getNumberOfRooms(String w) {
        System.out.println(this.walls);
        String walls = "123";

        if (true) {
            String a = "a";
            System.out.println(walls);

            for (int i = 0; i < 10; i++) {
                System.out.println(a);
            }
        }


        return 4;
    }

    public int getNumberOfRooms(int arg) {
        return 4;
    }

    public int getNumberOfRooms(Room room) {
        return 4;
    }

    public int getNumberOfRooms(KitchenRoom room) {
        return 4;
    }

    public int getNumberOfRooms(String arg, int arg2) {
        return 4;
    }

    private static void infoSurface() {
        System.out.println("Surface of room is " + SURFACE);
    }

    public static void main(String[] args) {
        Room kitchenRoom = new KitchenRoom("black floor", "white walls");
        kitchenRoom.infoFloor();
        kitchenRoom.infoWalls();
    }
}
