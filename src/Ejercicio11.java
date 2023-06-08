
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números enteros positivos");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        //En el siguiente bucle valido aue los número ingresados sean positivos
        while (num1 < 0 || num2 < 0) {
            if (num1 < 0) {
                System.out.println("El primero número ingresado no es positivo, ingreselo nuevamente");
                num1 = leer.nextInt();
            } else {
                System.out.println("El segundo número ingresado no es positivo, ingreselo nuevamente");
                num2 = leer.nextInt();
            }
        }
        int opcion;
        String valido = "N";
        
        do {
            System.out.println("MENU \n 1.Sumar \n 2.Restar \n 3.Multiplicar \n 4.Divir \n 5.Salir \n Elija opción:");
             opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Eligio la opcion Sumar \n La suma de " + num1 + " y " + num2 + " es " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Eligio la opcion Restar \n La resta de " + num1 + " y " + num2 + " es " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Eligio la opcion Multiplicar \n La multiplicacion de " + num1 + " y " + num2 + " es " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("Eligio la opcion Dividir \n La division de " + num1 + " y " + num2 + " es " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    valido = leer.next();
                    valido = (valido.toUpperCase());
                    if ("S".equals(valido)) {
                        System.out.println("Salio del Menu");
                    }
                    break;

            }
        } while ("N".equals(valido));//repito el bucle mientras no selecione la validacion S en la opcion salir

    }
}
