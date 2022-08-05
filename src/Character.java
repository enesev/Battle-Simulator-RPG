public abstract class Character {

    private int id;
    private String name;
    private int hp;
    private boolean isAlive = true;

    public Character(int id, String name, int hp) {
        this.id = id;
        this.name = name;
        this.hp = hp;
    }
}
