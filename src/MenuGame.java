import java.util.Scanner;

public class MenuGame {


    public static void menu(){
        boolean exit = false;
        Scanner scan = new Scanner(System.in);
        do{
            try{

                System.out.println("****************************************************");
                System.out.println("*\tWelcome to RPG Battle Simulator\t *");
                System.out.println("****************************************************\n \n");
                System.out.println("****************************************************");
                System.out.println("*\tWe are a group 1\t *");
                System.out.println("****************************************************");
                System.out.println("****************************************************");
                System.out.println("Please choose one of the options below: \n" +

                        " 1. Create a Party \n" +
                        " 2. Import a Party \n" +
                        " 3. Show graveyard  \n" +
                        " 4. Fight \n" +
                        " 0. Exit the Game \n");


                //TODO verificar y cambiar nombre de Clase Parties
                    /*   if (Parties.userArmy.size() == 0) {
                    System.err.println("Your army is empty and enemies are getting closer!");
                } else {
                    System.err.println("Your army: " + Parties.userArmy);
                }*/

                int option = scan.nextInt();

                switch (option){
                    case 0:
                        System.out.println("You have exited the game");
                        exit = true;
                        break;
                    case 1:
                        Party.createParty();
                        break;
                    case 2:
                       // Parties.importParty();
                        break;
                    case 3:

                        break;
                    case 4:

                    default:
                        System.err.println("You have to select an appropriate option");
                }
            }catch (Exception e){
                System.out.println("Options are from 0 to 3");
                scan.next();
            }
        }while (!exit);

    }


}



