import java.util.ArrayList;
import java.util.List;

public class Graveyard {
    // propiedades
    private static ArrayList<Character> deadCharacters;

    // constructor vacío
    public Graveyard() {

    }
    public Graveyard(ArrayList<Character> deadCharacters) {
        setDeadCharacters(deadCharacters);
    }

    // metodos
    /**
    * Añade un carácter a la lista del cementerio. Cuando isAlive pase a false, se llama a este método:
     * instanciaGraveyard.addDeadCharacter(getDeadCharacters(), personajeFallecido);
     * Según cómo sean constridas las otras clases, deberé cambiar la manera de invocarlo.
     * @param deadChar          carácter a añadir al cementerio
    * */
    public static void addDeadCharacter(Character deadChar) {
        if (deadChar.isAlive() == false) {
            deadCharacters.add(deadChar);
        }
        // System.out.println(Character.getName() + " ha fallecido! Su cuerpo ha sido añadido al cementerio");
    }

    public void showGraveyard () {
        if (getDeadCharacters() == null) System.out.println("No hay muertos en el cementerio");
        System.out.println("Soldados en el cementerio:");
        for (Character c : getDeadCharacters()) {
            System.out.println(c.getName());
        }
    }

    // getter
    public static ArrayList<Character> getDeadCharacters() {
        return deadCharacters;
    }
    // setter
    public void setDeadCharacters(ArrayList<Character> deadCharacters) {
        this.deadCharacters = deadCharacters;
    }
}
