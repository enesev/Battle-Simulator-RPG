import java.util.Scanner;

public class MenuGame {

    public static void menu(){
        boolean exit = false;
        Party party1 = new Party();
        Party party2 = new Party();
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        do{
            try{
                System.out.println("****************************************************");
                System.out.println("*\tWelcome to RPG Battle Simulator\t *");
                System.out.println("****************************************************\n \n");
                System.out.println("Please choose one of the options below: \n" +
                        " 1. Create a Party \n" +
                        " 2. Import a Party \n" +
                        " 3. Show graveyard  \n" +
                        " 4. Fight \n" +
                        " 0. Exit the Game \n");

                int option = scan.nextInt();


                switch (option){
                    case 0:
                        System.out.println("Thank you for playing!");
                        exit = true;
                        break;
                    case 1:
                        if(counter == 0) party1 = new Party(Party.createParty());
                        else party2 = new Party(Party.createParty());
                        counter++;


                        break;
                    case 2:
                        CSVHandler.importCSVParty();
                        break;
                    case 3:
                        if (Graveyard.getDeadCharacters() == null) System.out.println("No hay muertos en el cementerio");
                        else {
                            System.out.println(Graveyard.getDeadCharacters().toArray().toString());
                        }
                        break;
                    case 4:
                        System.out.println("Party 1" +  " has " +  party1.getParty().size() + " fighters");
                        System.out.println("Party 2" +  " has " +  party2.getParty().size() + " fighters");

                        Battle battle = new Battle();
                        battle.battle(party1, party2);

                        break;
                    default:
                        System.err.println("You have to select an appropriate option");
                }
            }catch (Exception e){
                System.err.println("Options are from 0 to 3");
                e.printStackTrace();
                scan.next();
            }
        }while (!exit);

    }


}



