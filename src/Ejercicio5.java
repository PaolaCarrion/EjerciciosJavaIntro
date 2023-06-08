
import java.util.Scanner;

/*
 Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        int num = leer.nextInt();
        // usamos Math.sqrt para calcular la raiz cuadrada
        System.out.println("Para el valor "+num+"\nEl doble es "+(num*2)+"\nEl triple es "+(num*3)+"\nLa raiz cuadrada es "+ (Math.sqrt(num)));
    }
}
