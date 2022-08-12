import interfaces.Attacker;

public class Warrior extends Character implements Attacker {

    //Variables
    private int stamina;
    private int strength;
    //Constructor
    public Warrior(int id, String name, int hp, int stamina, int strength) {
        super(id, name, hp);
        setStamina(stamina);
        setStrength(strength);
    }

    @Override
    public int attack() {
        if (this.getStamina() >= 5) {
           return heavyAttack();
        } else {
            weakAttack();
        }
        return weakAttack();
    }

    public int heavyAttack() {
        System.out.println("Warrior uses Heavy attack!!");
        int damage = this.getStrength();
        setStamina(this.getStamina() - 5);

        return damage;
    }

    public int weakAttack() {
        System.out.println("Warrior uses Weak attack!!");
        int damage = this.getStrength() / 2;
        setStamina(this.getStamina() + 1);

        return damage;
    }



    public void setStamina(int Stamina) {
        this.stamina = stamina;
    }

    public int getStamina() {
        return stamina;
    }


    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
         this.strength = strength;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "ID=" + super.getId() +
                ", name=" + super.getName() +
                ", Hp=" + super.getHp() +
                ", stamina=" + stamina +
                ", strength=" + strength +
                '}';
    }
}