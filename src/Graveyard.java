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

    // método temporal, no pertenece a la versión final, debería ser implementado en otra clase
    public void ifCharacterDied_addToGraveyard(Character character, Graveyard graveyard) {
        if (character.isAlive()) {
            graveyard.addDeadCharacter(getDeadCharacters(),character);
            graveyard.showGraveyard();
        } else {
            //no ha muerto, no hacer nada
        }
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
        System.out.println("Carácteres en el cementerio:");
        for (Character c:getDeadCharacters()) {
            System.out.println(c.getName());
        }
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

/*
He ejecutado esta serie de métodos en Main (sin guardarlos ni commitearlos) para comprobar el correcto funcionamiento
de esta clase. El resultado es el esperado: crea un wizard y una lista vacía de characters, con la que construye
el cementerio. Mato al wizard usando los setters de Character, el método auxiliar verifica su muerte
y lo añade al cementerio
Wizard wiz1 = new Wizard(1337, "deadWizard",1,0,10);
List<Character> deadChars = new ArrayList<Character>(){};
Graveyard graveyard = new Graveyard(deadChars);
wiz1.setHp(wiz1.getHp()-2);
graveyard.ifCharacterDied_addToGraveyard(wiz1, graveyard);
 */

