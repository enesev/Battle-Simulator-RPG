import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class CSVHandler {
    private static File archivoParty = new File("party.csv");
    public static void exportPartyToCSV(ArrayList<Character> party, String pathName) {
        try (FileWriter fw = new FileWriter(archivoParty,false)) {
            for (Character miembro : party) {
                fw.write(miembro.getClass().toString() + "," + miembro.getName()+"," +miembro.getId() +
                        "," + miembro.getHp() + "\n" );

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Character> importCSVParty() {
        ArrayList<Character> importedParty = new ArrayList<>();

        try (Scanner scanFile = new Scanner(new File("party.csv"))) {
            System.out.println("Importados los siguientes carácteres:");
            while (scanFile.hasNextLine()) {
                String linea = scanFile.nextLine();
                String[] lineas = linea.split(",");
                Warrior war1 = new Warrior();
                Wizard wiz1 = new Wizard();
                if (lineas[0].equals("class Warrior")) {
                    war1 = new Warrior(1337, lineas[1], Integer.valueOf(lineas[3]), Integer.valueOf(lineas[2]), 5);
                }
                if (lineas[0].equals("class Wizard")) {
                    wiz1 = new Wizard (42, lineas[1], Integer.valueOf(lineas[3]),Integer.valueOf(lineas[2]),10);
                }
                if (war1.getStrength()> 4) System.out.println(war1.toString());
                if (wiz1.getIntelligence() > 9) System.out.println(wiz1.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return importedParty;
    }

}