/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */


public class Ejercicio15 {

    public static void main(String[] args) {
        int[] vector = new int[100];
        LlenarVector(vector);
        ImprimirVector(vector);
    }

    public static void LlenarVector(int[] vector) {
        for (int i = 0; i < 100; i++) {
            vector[i] = i;
        }
    }

    public static void ImprimirVector(int[] vector) {
        for (int i = 99; i >= 0; i--) {
            System.out.println(vector[i]);
        }
    }
}
