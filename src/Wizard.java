import interfaces.Attacker;

public class Wizard extends Character implements Attacker {
    private int mana;
    private int intelligence;

    public Wizard(int id, String name, int hp, int mana, int intelligence) {
        super(id, name, hp);
        this.mana = mana;
        this.intelligence = intelligence;
    }

    public void setWizardHp(int hp) {
        if (hp < 50){
            setHp(50);
        }else if (hp > 100){
            setHp(100);
        }else
        setHp(hp);
    }
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (mana < 10){
            setMana(10);
        }else if (mana > 50){
            setMana(50);
        }else
        this.mana = mana;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        if (intelligence < 1){
            setIntelligence(1);
        }else if (intelligence > 50){
            setIntelligence(50);
        }else
        this.intelligence = intelligence;
    }

    @Override
    public void attack() {

        if (this.getMana() >= 5) {
            fireball();
        } else {
            staffHit();
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


/*
 ESTO VA EN BATTLE

    wizard.setAlive(false);

*/



}


