import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PideDatos {

    public static int pideEntero(String pregunta) {
        System.out.println(pregunta);
        int num = 0;
        boolean repite = true;
        while (repite) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String op = br.readLine();
                num = Integer.parseInt(op);
                repite = false;
            } catch (Exception a) {
                System.out.println("Numero incorrecto, try again");
            }
        }

        return num;
    }

    public static int pideValorMinMax(int valorMinimo, int valorMaximo) {
        return pideValorMinMax(valorMinimo,valorMaximo,"Introduce el valor entre "+valorMinimo+" y "+valorMaximo);
    }
    public static int pideValorMinMax(int valorMinimo, int valorMaximo, String pregunta) {
        int valor = 0;
        do {
            valor = pideEntero(pregunta);
            if ((valor < valorMinimo) || (valor > valorMaximo)) {
                System.out.println("El valor debe ser un valor entre "
                        + valorMinimo + " y " + valorMaximo);
            }
        } while ((valor < valorMinimo) || (valor > valorMaximo));
        return valor;
    }

    public static String pideString(String txt) {
        System.out.println(txt);
        boolean repeat;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            repeat = false;
            try {
                return br.readLine();
            } catch (IOException ex) {
                repeat = true;
            }
        } while (repeat);
        return null;
    }
}
