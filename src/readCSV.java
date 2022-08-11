import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class readCSV {
    public static Party readCSV(File csv) {
        try {
            Scanner scanCSV = new Scanner(csv);
            ArrayList<java.lang.Character> party = new ArrayList<>();
            scanCSV.nextLine();

            while(scanCSV.hasNextLine()) {
                String[] info = scanCSV.nextLine().split(", ");

                if(info[5] == "0"){   //sera un wizard porque no tiene stamina
                    Wizard wizard = new Wizard((info[1]), Integer(info[2]), Integer(info[3]), Integer(info[4]);
                } else {    //sera un warrior porque tiene stamina
                    Warrior warrior = new Warrior(info[1]), Integer(info[2]), Integer(info[3]), Integer(info[4]);
                }
                scanCSV.close();
                return new Party;
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException("The file was not found");
        }
    }
}
