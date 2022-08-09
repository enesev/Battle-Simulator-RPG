import interfaces.Attacker;

public class Wizard extends Character implements Attacker {
    private int mana;
    private int intelligence;

    public Wizard(int id, String name, int hp, int mana, int intelligence) {
        super(id, name, hp);
        this.mana = mana;
        this.intelligence = intelligence;
    }

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
    public void attack() {

        if (this.getMana() >= 5) {
            fireball();
        } else {
            staffHit();
        }
    }

    public int fireball(){
        int damage = this.getIntelligence();
        int manaDecrease = 5;
        this.setMana(this.getMana() - manaDecrease);
        return damage;
    }


    public void staffHit(){
        int damage = 2;
        int manaIncrease = 1;
        this.mana = this.mana + manaIncrease;
    }

    public void decreaseHealth(Character player){
        player.setHp(player.getHp()-fireball());
    }




}


