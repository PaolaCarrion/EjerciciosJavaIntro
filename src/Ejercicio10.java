
import java.util.Scanner;

/*
 Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.
 */


public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor limite de la suma");
        int valorLimite = leer.nextInt();
        //verificamos que el valor ingresado sea positivo
        while (valorLimite<1){
            System.out.println("Debe ingresar un valor positivo");
            valorLimite= leer.nextInt();
        }
        int suma = 0;
        //usamos el bucle para sumar y validar que no supere el limite
        do {
            System.out.println("Ingrese el número que desea sumar");
            int num = leer.nextInt();
            suma = suma + num;
            System.out.println("El valor de la suma hasta ahora es de "+ suma);
        } while (suma<valorLimite);
        System.out.println("El valor de la suma supero el limite");
    }
}
