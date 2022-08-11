import java.util.List;
public class Graveyard {
    // propiedades
    private List<Character> deadCharacters;

    // constructor vacío
    public Graveyard() {

    }
    public Graveyard(List<Character> deadCharacters) {
        setDeadCharacters(deadCharacters);
    }

    // metodos
    /**
    * Añade un carácter a la lista del cementerio. Cuando isAlive pase a false, se llama a este método:
     * instanciaGraveyard.addDeadCharacter(getDeadCharacters(), personajeFallecido);
     * Según cómo sean constridas las otras clases, deberé cambiar la manera de invocarlo.
     * @param deadCharacters    propiedad de Graveyard que contiene los muertos
     * @param deadChar          carácter a añadir al cementerio
    * */
    public void addDeadCharacter(List<Character> deadCharacters, Character deadChar) {
        if (deadChar.isAlive() == false) {
            deadCharacters.add(deadChar);
        }
        // System.out.println(Character.getName() + " ha fallecido! Su cuerpo ha sido añadido al cementerio");
    }

    public void showGraveyard () {
        getDeadCharacters().forEach(System.out::println);
    }

    // getter
    public List<Character> getDeadCharacters() {
        return deadCharacters;
    }
    // setter
    public void setDeadCharacters(List<Character> deadCharacters) {
        this.deadCharacters = deadCharacters;
    }
}
