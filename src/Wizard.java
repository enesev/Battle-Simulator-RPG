import interfaces.Attacker;

public class Wizard extends Character implements Attacker {
    private int mana;
    private int intelligence;

    public Wizard(int id, String name, int hp, int mana, int intelligence) {
        super(id, name, hp);
        this.mana = mana;
        this.intelligence = intelligence;
    }

    @Override
    public void attack() {

        if (mana >= 5) {
            fireball();
        } else {
            staffHit();
        }
    }

    public void fireball(){
        int damage = intelligence;
        int manaDecrease = 5;
        this.mana = this.mana + manaDecrease;

        //              este volumen + el nuevo, es mas grande que max? si es que si, sera MAX, sino sera este volume+volume nuevo

    }

    public void staffHit(){
        int damage = 2;
        int manaIncrease = 1;
        this.mana = this.mana + manaIncrease;
    }
}
