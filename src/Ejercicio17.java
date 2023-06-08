
import java.util.Scanner;

/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */

public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño que desea tenga su vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        LlenarVector(vector, n);
        ImprimirVector(vector,n);
        ContarDigitos(vector, n);
        
    }
    
    public static void LlenarVector(int[] vector, int n) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el valor "+(i)+" del vector");
            vector[i]= leer.nextInt();
        }
    }
     public static void ImprimirVector(int[] vector, int n) {
        System.out.println("Al vector lo componen los siguientes números");
        for (int i = 0; i < n; i++) {
            System.out.print( vector[i]+" ");
        }
        System.out.println("");
    }
    public static void ContarDigitos(int[] vector, int n) {
        int contD5 = 0;
        int contD4 = 0;
        int contD3 = 0;
        int contD2 = 0;
        int contD1 = 0;
        for (int i = 0; i < n; i++) {
            if (vector[i]/10>1000) {
                contD5 = contD5 + 1;
            } else if (vector[i] / 10 > 100) {
                contD4 = contD4 + 1;

            } else if (vector[i] / 10 > 10) {
                contD3 = contD3 + 1;

            } else if (vector[i] / 10 > 1) {
                contD2 = contD2 + 1;

            } else if (vector[i] / 10 < 1) {
                contD1 = contD1 + 1;

            }

        }
        System.out.println("El vector hay: \n"+contD1+" números de 1 digito \n"+contD2+" números de 2 digitos \n" +contD3+ 
                " números de 3 digitos \n"+contD4+" números de 4 digitos \n"+contD5+" número de 5 digitos");

    }
}
