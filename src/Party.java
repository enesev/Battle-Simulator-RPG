import java.util.ArrayList;
import java.util.Scanner;

public class Party {

    private ArrayList<Character> party;


    public Party(ArrayList<Character> party) {
        this.party = party;
    }

    public ArrayList<Character> getParty() {
        return party;
    }

    public void setParty(ArrayList<Character> party) {
        this.party = party;
    }

    public static void createParty() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to create a party Manually or Randomly?");
        System.out.println("Select: \n" +
                "1. For Manually \n" +
                "2. For Randomly");
        int choice = scan.nextInt();
        if (choice == 1) { createManualParty();
            }else if (choice == 2){ createRandomParty();
        }
    }

    public static void createManualParty(){
        int partySize = PideDatos.pideValorMinMax(1, 4, "¿Cuántos soldados tiene tu ejército?");
        ArrayList<Character> party1 = new ArrayList<>(partySize);

        for (int i = 0; i < partySize; i++ ){
            int opcionElegida = PideDatos.pideValorMinMax(1, 2, "Qué tipo de personaje quieres crear? \n" +
                    "1- Warrior\n" +
                    "2- Wizard");
            if (opcionElegida == 1) {
                int id = PideDatos.pideEntero("Elige un id para tu Warrior");
                String name = PideDatos.pideString("¿Cómo se llama tu Warrior #" + id + " ?");
                int health = PideDatos.pideValorMinMax(100, 200, "¿Cuantos healthpoints tiene tu Warrior " + name + " ?");
                int stamina = PideDatos.pideValorMinMax(10, 50, "¿Cuánta stamina tiene tu Warrior " + name + " ?");
                int strength = PideDatos.pideValorMinMax(1, 10, "¿Cuánta strength tiene tu Warrior " + name + " ?");
                Warrior warrior1 = new Warrior(id, name, health, stamina, strength);
                party1.add(warrior1);
                System.out.println("Cuenta con el hacha de " + warrior1.getName() + " para tu ejército!");
            }else {
                int id = PideDatos.pideEntero("Elige un id para tu Wizard");
                String name = PideDatos.pideString("¿Cómo se llama tu Wizard #" + id + " ?");
                int health = PideDatos.pideValorMinMax(50, 100, "¿Cuantos healthpoints tiene tu Wizard " + name + " ?");
                int mana = PideDatos.pideValorMinMax(10, 50, "¿Cuánta mana tiene tu Wizard " + name + " ?");
                int intelligence = PideDatos.pideValorMinMax(1, 50, "¿Cuánta intelligence tiene tu Wizard " + name + " ?");
                Wizard wizard1 = new Wizard(id, name, health, mana, intelligence);
                party1.add(wizard1);
                System.out.println("Cuenta con la magia de " + wizard1.getName() + " para tu ejército!");
            }
        }


    }

    public static void createRandomParty() {
        System.out.println("Cuántos soldados tiene tu ejército?");
            int partySize = (int) Math.ceil(Math.random()*3+1);
            ArrayList<Character> party2 = new ArrayList<>(partySize);
            for (int i = 0; i < partySize; i++ ){
                System.out.println("Qué tipo de personaje quieres crear? \n" +
                        "1- Warrior\n" +
                        "2- Wizard");
                int opcionElegida = (int) Math.ceil(Math.random()*2-1);

                if (opcionElegida == 1) {
                    int id = (int) Math.ceil(Math.random()*15+1);
                    String name = "Juan";
                    int health = (int) Math.ceil(Math.random()*200);
                    int stamina = (int) Math.ceil(Math.random()*50);
                    int strength = (int) Math.ceil(Math.random()*10);
                    Warrior warrior1 = new Warrior(id, name, health, stamina, strength);
                    party2.add(warrior1);
                    System.out.println("Se ha creado un Warrior con los siguientes datos :" + warrior1.toString());
                }else {
                    int id = (int) Math.ceil(Math.random()*15+1);
                    String name = "Pedro";
                    int health = (int) Math.ceil(Math.random()*100);
                    int mana = (int) Math.ceil(Math.random()*50);
                    int intelligence = (int) Math.ceil(Math.random()*50);
                    Wizard wizard1 = new Wizard(id, name, health, mana, intelligence);
                    party2.add(wizard1);
                    System.out.println("Se ha creado un Wizard con los siguientes datos :" + wizard1.toString());
                }
            }

        }




}
