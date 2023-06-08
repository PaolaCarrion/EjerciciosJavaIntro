
import java.util.Scanner;

/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de grados centígrados que quiere convertir a Fahrenheit");
        double gradosC = leer.nextInt();
        double gradosF= 32+ (9*gradosC /5);
        System.out.println("El valor " +gradosC+ " de grados centígrados es equivalente a "+ gradosF+ " Fahrenheit");

    }
}
