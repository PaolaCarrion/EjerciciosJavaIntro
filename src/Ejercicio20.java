
import java.util.Scanner;

/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
public class Ejercicio20 {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        llenarMatriz(matriz);
        comprobarCuboMagico(matriz);
    }

    public static void llenarMatriz(int[][] matriz) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el valor [" + i + "," + j + "] de la matriz");
                matriz[i][j] = leer.nextInt();
                while (matriz[i][j] > 10 || matriz[i][j] < 0) {
                    System.out.println("Debe ingresar un valor de 1 a 9");
                    matriz[i][j] = leer.nextInt();
                }
            }
        }
    }

    public static void comprobarCuboMagico(int[][] matriz) {
        int sumaFilas = 0;
        int sumaColumnas = 0;
        int cont = 0;
        int sumDiagonal1 = 0;
        int sumDiagonal2 = 0;
        for (int i = 0; i < 3; i++) {
            int suma = 0;
            for (int j = 0; j < 3; j++) {
                sumaFilas = sumaFilas + matriz[i][j];
                sumaColumnas = sumaColumnas + matriz[j][i];
            }
            if (sumaFilas == sumaColumnas) {
                cont = cont + 1;
            }
            sumDiagonal1 = sumDiagonal1 + matriz[i][i];
            sumDiagonal2 = sumDiagonal2 + matriz[i][2 - i];
        }
        if (cont == 3 && sumDiagonal1 == sumDiagonal2) {
            System.out.println("La matriz es un cuadrado magico");
        } else {
            System.out.println("La matriz no es un cuadrado magico");
        }

    }
}
