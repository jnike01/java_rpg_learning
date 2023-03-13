package basicrpg;

public abstract class Character {
    // variables / attributes all characters have
    public String name;
    public int maxHp, hp, xp;

    // constructor for character
    public Character(String name, int maxHp, int xp){
        this.name = name;
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.xp = xp;
    }

    // methods every character has
    public abstract int attack();
    public abstract int defense();
}
