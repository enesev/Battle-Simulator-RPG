import java.util.Scanner;

public class Battle {

/*

    wizard.setAlive(false);

*/

    private Scanner input = new Scanner(System.in);

    private Party party1 = new Party(Party.createParty());
    private Party party2 = new Party(Party.createParty());

    private Graveyard graveyard = new Graveyard();


    public void battle(){
        do {
            Character f1 = chooseCharacter(party1);
            Character f2 = chooseCharacter(party2);
            round(f1, f2);

        }while (party1.getParty().get(0).isAlive() == true
                || party1.getParty().get(1).isAlive() == true
                || party1.getParty().get(2).isAlive() == true
                || party1.getParty().get(3).isAlive() == true
        );

    }

    public Character chooseCharacter(Party party){
        System.out.println("Choose your fighter");
        String chosenCharacter = input.nextLine();

        Character fighter = null;

        for (int i = 0; i < party1.getParty().size(); i++){

            Character f = party1.getParty().get(i);

            if (f.getName().equals(chosenCharacter)){
                System.out.println(f.getName() + " was selected to fight.");
                fighter = f;
            }
        }
        if (fighter == null) {
            System.err.println("Fighter not found! Try again, please.");
            fighter = chooseCharacter(party);
        }
        //stats(fighter);
        return fighter;

    }

    public void round (Character fighter1, Character fighter2){
        do{
            System.out.println(fighter1.getName() + " does a: " + fighter1.attack()
                    +"\n" + fighter2.getName() + " does a: " + fighter2.attack());

        fighter1.setHp(fighter1.getHp()-fighter2.attack());
        fighter2.setHp(fighter2.getHp()-fighter1.attack());
        }while (fighter1.getHp() > 0 || fighter2.getHp() > 0);

        if (fighter1.getHp() <= 0) {
            System.out.println("Your fighter " + fighter1.getName() + " ha muerto!");
            graveyard.addDeadCharacter(party1.getParty(), fighter1);
        }
        if (fighter2.getHp() <= 0){
            System.out.println("Tu luchador " + fighter2.getName() + " has died!");
            graveyard.addDeadCharacter(party2.getParty(), fighter2);

        }
    }


}
