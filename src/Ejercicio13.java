
import java.util.Scanner;

//Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”
public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos por lado que quiera tenga el cuadrado");
        int n = leer.nextInt();
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < n; j++) {
                    if (j==0 || j==n-1) {
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                }
                   
                }
            }
            System.out.println(" ");
        }
    }
}
