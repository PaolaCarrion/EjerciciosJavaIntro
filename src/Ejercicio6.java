
import java.util.Scanner;

//Crear un programa que dado un numero determine si es par o impar.


public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = leer.nextInt();
        if (num % 2 == 0) {
            System.out.println("El número ingresado es par");
        } else {
            System.out.println("El número ingresado es impar");
        }
    }
}
