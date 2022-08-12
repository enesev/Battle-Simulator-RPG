import java.util.Scanner;

public class Battle {

/*

    wizard.setAlive(false);

*/

    private Scanner input = new Scanner(System.in);

    Graveyard g1 = new Graveyard();



    public void battle(Party party1, Party party2){
        do {
            Character f1 = chooseCharacter(party1);
            Character f2 = chooseCharacter(party2);
            round(f1, f2, party1, party2);

        }while (!party1.getParty().isEmpty() || !party2.getParty().isEmpty()
                || party1.getParty() != null || party2.getParty() != null);
        if (party1.getParty().isEmpty()) System.out.println("Party 2 has won!");
        if (party2.getParty().isEmpty()) System.out.println("Party 1 has won!");

    }

    public Character chooseCharacter(Party party){
        System.out.println("===================");
        System.out.println("Choose your fighter");
        String chosenCharacter = input.nextLine();

        Character fighter = null;

        for (int i = 0; i < party.getParty().size(); i++){

            Character f = party.getParty().get(i);

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

    public void round (Character fighter1, Character fighter2, Party party1, Party party2){
        do{
            System.out.println(fighter2.getName() + " lost " + fighter1.attack() + " hp");
            fighter1.setHp(fighter1.getHp()-fighter2.attack());

            System.out.println(fighter1.getName() + " lost " + fighter2.attack() + " hp");
            fighter2.setHp(fighter2.getHp()-fighter1.attack());
            if (fighter1.getHp() <= 0) {
                fighter2.setAlive(false);
                System.err.println("Your fighter " + fighter1.getName() + " has died!");
                Graveyard.addDeadCharacter(fighter1);
                party1.getParty().remove(fighter1);
                break;

            }if (fighter2.getHp() <= 0){
                fighter2.setAlive(false);
                System.err.println("Your fighter " + fighter2.getName() + " has died!");
                Graveyard.addDeadCharacter(fighter2);
                party2.getParty().remove(fighter2);
                break;
            }
        }while (fighter1.getHp() > 0 || fighter2.getHp() > 0);
        System.out.println("======ROUND FINISHED======");


    }


}
