
import java.util.Scanner;

/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */

/**
 *
 * @author paola
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[][] matriz2 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el valor ["+i+"," +j+"] de la matriz");
                matriz[i][j]= leer.nextInt();
            }
        }
        mostrarMatriz(matriz);
        llenarTranspuesta(matriz, matriz2);
        mostrarMatriz(matriz2);
        verificacionMatrizAS(matriz, matriz2);
    }

    public static void mostrarMatriz(int[][] matriz){
        System.out.println("La matriz es:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((matriz[i][j])+ " ");
            }
            System.out.println("");
        }
    }
    
    public static void llenarTranspuesta(int[][] matriz, int[][] matriz2){
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                matriz2[j][i]= matriz[i][j];
            }
        }
}
    public static void verificacionMatrizAS(int[][] matriz, int [][] matriz2){
        int cont = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz2[i][j]==(-(matriz[i][j]))) {
                    cont=cont+1;
                }
            }
        }
        if (cont==9) {
            System.out.println("La matriz es anti simétrica"); 
        }else{
            System.out.println("La matriz no es anti simétrica");
        }
    }
}
