public class Warrior extends Character{

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
    public void attack() {
        if (this.getStamina() >= 5) {
            heavyAttack();
        } else {
            weakAttack();
        }
    }

    public int heavyAttack() {
        int damage = this.getStrength();
        setStamina(this.getStamina() - 5);

        return damage;
    }

    public int weakAttack() {
        int damage = this.getStrength() / 2;
        setStamina(this.getStamina() + 1);

        return damage;
    }

    public void setWarriorHp(int hp){
        if (hp < 100) setHp(100);
        else if (hp > 200) setHp(200);
        else setHp(hp);
        }

    public void setStamina(int Stamina) {
        if (stamina < 10) setStamina(10);
        else if (stamina > 50) setStamina(50);
        else this.stamina = stamina;
    }

    public int getStamina() {
        return stamina;
    }


    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        if(strength < 1) setStrength(1);
        else if (strength > 10) setStrength(10);
        else this.strength = strength;
        }

    }
