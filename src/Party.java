import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Party {

    private ArrayList<Character> party;


    public Party(ArrayList<Character> party) {
        setParty(party);
    }
    public Party(){};

    public ArrayList<Character> getParty() {
        return this.party;
    }

    public void setParty(ArrayList<Character> party) {
        this.party = party;
    }

    public static ArrayList<Character> createParty() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to create a party Manually or Randomly?");
        System.out.println("Select: \n" +
                "1. For Manually \n" +
                "2. For Randomly");
        int choice = scan.nextInt();
        if (choice == 1) {
            return createManualParty();
        } else if (choice == 2) {
            return createRandomParty();
        } else {
            return null;
        }
    }

    public static ArrayList<Character> createManualParty(){
        int partySize = PideDatos.pideValorMinMax(1, 4, "¿How many characters has your party?");
        ArrayList<Character> party1 = new ArrayList<>(partySize);

        for (int i = 0; i < partySize; i++ ){
            int opcionElegida = PideDatos.pideValorMinMax(1, 2, "Which character do you want to create? \n" +
                    "1- Warrior\n" +
                    "2- Wizard");
            if (opcionElegida == 1) {
                int id = PideDatos.pideEntero("Choose an id for your Warrior");
                String name = PideDatos.pideString("¿What is your Warrior's #" + id + " ?");
                int health = PideDatos.pideValorMinMax(100, 200, "¿How many Healthpoints does your Warrior " + name + " have?");
                int stamina = PideDatos.pideValorMinMax(10, 50, "¿How many stamina does your Warrior " + name + " have?");
                int strength = PideDatos.pideValorMinMax(1, 10, "¿How many strength does your Warrior " + name + " have?");
                Warrior warrior1 = new Warrior(id, name, health, stamina, strength);
                party1.add(warrior1);
                System.out.println(warrior1.getName() + " has joined your party");
            }else {
                int id = PideDatos.pideEntero("Choose an id for your Wizard");
                String name = PideDatos.pideString("¿What is your Wizard's #" + id + " ?");
                int health = PideDatos.pideValorMinMax(50, 100, "¿How many Healthpoints does your Wizard " + name + " have?");
                int mana = PideDatos.pideValorMinMax(10, 50, "¿How many mana does your Wizard " + name + " have?");
                int intelligence = PideDatos.pideValorMinMax(1, 50, "¿How many intelligence does your Wizard " + name + " have?");
                Wizard wizard1 = new Wizard(id, name, health, mana, intelligence);
                party1.add(wizard1);
                System.out.println(wizard1.getName() + " has joined your party");
            }
        }

    return party1;
    }

    public static ArrayList<Character> createRandomParty() {
        int partySize = PideDatos.pideValorMinMax(1, 4, "¿How many characters has your party?");
            ArrayList<Character> party2 = new ArrayList<>(partySize);
            for (int i = 0; i < partySize; i++ ){
                System.out.println("Which character do you want to create? \n" +
                        "1- Warrior\n" +
                        "2- Wizard");
                int opcionElegida = (int) Math.ceil(Math.random()*2-1);

                if (opcionElegida == 1) {
                    int id = (int) (Math.random()*1+10);
                    String name = setRandomName();
                    int health = (int) (Math.random() * 100 + 100);
                    int stamina = (int) (Math.random() * 10 + 35);
                    int strength = (int) (Math.random() * 10 + 0);
                    Warrior warrior1 = new Warrior(id, name, health, stamina, strength);
                    party2.add(warrior1);
                    System.out.println("A Warrior was created with the following stats :" + warrior1.toString());
                }else {
                    int id = (int) (Math.random()*1+10);
                    String name = setRandomName();
                    int health = (int) (Math.random() * 50 + 50);
                    int mana = (int) (Math.random() * 40 + 10);
                    int intelligence = (int) (Math.random() * 50 + 0);
                    Wizard wizard1 = new Wizard(id, name, health, mana, intelligence);
                    party2.add(wizard1);
                    System.out.println("A Wizard was created with the following stats :" + wizard1.toString());
                }
            }
        return party2;
        }

        public static String setRandomName() {
            List<String> names = new ArrayList<>();
            names.add("Julio");
            names.add("Alberto");
            names.add("Mario");
            names.add("Luis");
            names.add("Cristian");
            names.add("Ignacio");

            int random = (int) (Math.random() * names.size());
            String name = names.get(random);
            return name;
        }




}
