import interfaces.Attacker;

public class Wizard extends Character implements Attacker{
    private int mana;
    private int intelligence;

    public Wizard(int id, String name, int hp, int mana, int intelligence) {
        super(id, name, hp);
        this.mana = mana;
        this.intelligence = intelligence;
    }
    public Wizard(){}


    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    @Override
    public int attack() {

        if (this.getMana() >= 5) {
         return fireball();
        } else {
            return staffHit();
        }
    }

    public int fireball(){
        int damage = this.getIntelligence();
        setMana(this.getMana() - 5);
        return damage;
    }


    public int staffHit(){
        setMana(this.getMana() + 1);
        return 2;
    }

    public void decreaseHealth(int damage){
        setHp(getHp() - damage);
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "ID=" + super.getId() +
                ", name=" + super.getName() +
                ", Hp=" + super.getHp() +
                ", mana=" + mana +
                ", intelligence=" + intelligence +
                '}';
    }

    /*
 ESTO VA EN BATTLE

    wizard.setAlive(false);

*/



}


