package pl.devcezz.immutability;

public final class Hero {

    private final String name;
    private final String quest;
    private final Weapon weapon;

    public Hero(String name, String quest, Weapon weapon) {
        this.name = name;
        this.quest = quest;
        this.weapon = weapon;
    }

    public Hero changeQuest(String quest) {
        return new Hero(this.name, quest, this.weapon);
    }

    public static void main(String[] args) {
        Weapon weapon = Weapon.createWeapon("Extra BOW", Kind.BOW, 1000);
        Hero hero = new Hero("Józek", "Find goblins", weapon);
        System.out.println(hero);

        String john = "John";
        String jane = john + " Jane";
        john += " Jane";
        System.out.println(jane);
        System.out.println(john);

        System.out.println("====");
        Hero heroWithChangedQuest = hero.changeQuest("Rescue princess");
        System.out.println(hero);
        System.out.println(heroWithChangedQuest);
        System.out.println(hero == hero);
        System.out.println(hero == heroWithChangedQuest);
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", quest='" + quest + '\'' +
                ", weapon=" + weapon +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getQuest() {
        return quest;
    }

    public Weapon getWeapon() {
        return weapon;
    }
}
