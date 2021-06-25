package pl.devcezz.immutability;

public final class Weapon {

    private final String name;
    private final Kind kind;
    private final int attack;

    private Weapon(String name, Kind kind, int attack) {
        this.name = name;
        this.kind = kind;
        this.attack = attack;
    }

    public static Weapon createWeapon(String name, Kind kind, int attack) {
        return new Weapon(name, kind, attack);
    }

    public static void main(String[] args) {
        Weapon weapon = new Weapon("Exalibur", Kind.SWORD, 100);
        System.out.println(weapon);
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", kind=" + kind +
                ", attack=" + attack +
                '}';
    }

    public String getName() {
        return name;
    }

    public Kind getKind() {
        return kind;
    }

    public int getAttack() {
        return attack;
    }
}
