
import java.util.Scanner;


/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3
que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al
menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la
columna de la matriz M en la cual empieza el primer elemento de la submatriz P.
 */


public class Ejericicio21 {
     public static void main(String[] args) {
         int m =10;
         int p=3;
       int [][] matrizM = new int [m][m];
       int [][] matrizP = new int [p][p];
         llenarMatrizM(matrizM,m);
         System.out.println("La matriz M es:");
         mostrarMatriz(matrizM,m);
         llenarMatrizP(matrizP,p);
         System.out.println("La matriz P es:");
         mostrarMatriz(matrizP,p);
         MatizContenida(matrizM, matrizP,m,p);
    }
     public static void llenarMatrizM(int [][] matriz, int x){
         for (int i = 0; i < x; i++) {
             for (int j = 0; j < x; j++) {
                 matriz[i][j]=(int)(Math.random()*100);
             }
         }
     }
      public static void llenarMatrizP(int [][] matriz, int x){
          Scanner leer = new Scanner(System.in);
          System.out.println("Ingrese los valor de la matriz P");
         for (int i = 0; i < x; i++) {
             for (int j = 0; j < x; j++) {
                 System.out.println("Ingrese el valor ["+i+","+j+"] de la matriz P");
                 matriz[i][j]=leer.nextInt();       
             }
         }
     }
      public static void mostrarMatriz(int[][] matriz, int x){
          System.out.println("");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print((matriz[i][j])+ " ");
            }
            System.out.println("");
        }
    }
      public static void MatizContenida(int[][]matrizM, int[][]matrizP, int m, int p){
          
          for (int i = 0; i < m; i++) {
              for (int j = 0; j < m; j++) {
                  if (matrizM[i][j]==matrizP[0][0]) {
                     int fila =i;
                      int columna = j;
                      if (MatrizIgual(matrizM,matrizP,fila, columna)) {
                          System.out.println("La matriz se encuentra contenida a partir del elemento ["+fila+","+columna+"]");
                          break;
                      }
                  }
              }
          }
      }
      public static boolean MatrizIgual(int[][] matrizM, int [][] matrizP, int fila, int columna){
          int cont = 0;
          for (int i = 0; i < 3; i++) {
              for (int j = 0; j < 3; j++) {
                  if (matrizP[i][j]==matrizM[fila+i][columna+j]) {
                      cont=cont+1;
                  }else{
                      return false;
                  }
              }
          }
          if (cont==9) {
              return true;
          }else {
               return false;
          }
      }
}
