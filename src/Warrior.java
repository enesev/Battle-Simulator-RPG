public class Warrior extends Character{

    //Variables
    private int stamina;
    private int strength;
    //Constructor
    public Warrior(int id, String name, int hp, int stamina, int strength) {
        super(id, name, hp);
        this.stamina = stamina;
        this.strength = strength;
    }

    //Implement the attack interface
    @Override
    public int[] Attacker(){
        int[] damage = new int[2];
        if (getStamina() < 5){
            damage[0] = 0;                  //Indicates that is a weak attack
            damage[1] = getStrength()/2;
            setStamina(getStamina()+1);
        } else{
            damage[0] = 1;                  //Indicates that is a heavy attack
            damage[1] = getStrength();
            setStamina(getStamina() + 5);
        }
        return damage;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

}
