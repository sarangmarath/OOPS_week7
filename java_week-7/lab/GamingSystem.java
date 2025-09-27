class Character {
    protected String name;

    public Character(String name) { this.name = name; }
    public void attack() { System.out.println(name + " attacks generically."); }
}

class Warrior extends Character {
    public Warrior(String name) { super(name); }
    @Override
    public void attack() { System.out.println(name + " swings a mighty sword!"); }
}

class Mage extends Character {
    public Mage(String name) { super(name); }
    @Override
    public void attack() { System.out.println(name + " casts a powerful spell using mana!"); }
}

class Archer extends Character {
    public Archer(String name) { super(name); }
    @Override
    public void attack() { System.out.println(name + " shoots an arrow from afar!"); }
}

public class GamingSystem {
    public static void main(String[] args) {
        Character[] army = {
            new Warrior("Thor"),
            new Mage("Merlin"),
            new Archer("Legolas")
        };

        for (Character c : army) {
            c.attack();  // Executes based on actual object type
        }
    }
}
