
import java.util.Scanner;

/*
 Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño que desea tenga su vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        LlenarVector(vector, n);
        System.out.println("Ingrese el número que desea buscar en el vector");
        int num = leer.nextInt();
        ImprimirVector(vector, n);
        BucarEnVector(vector, n, num);
    }

    public static void LlenarVector(int[] vector, int n) {
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
    }

    public static void ImprimirVector(int[] vector, int n) {
        System.out.println("Al vector lo componen los siguientes números");
        for (int i = 0; i < n; i++) {
            System.out.print( vector[i]+" ");
        }
        System.out.println("");
    }
    
    
    
    public static void BucarEnVector(int[] vector, int n, int num) {
        int cont = 0;
        for (int i = 0; i < n; i++) {
            if (vector[i] == num) {
                System.out.println("El número " + num + " se encuentra en la posicion " + i);
                cont = cont + 1;
            }
        }
        if (cont > 0) {
            System.out.println("El número ingresado se encuentra rapetido " + cont + " veces.");
        } else {
            System.out.println("El número ingresado no se encuentra en el vector");
        }
    }
}
