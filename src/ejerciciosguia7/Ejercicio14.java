/*
 Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
 */
package ejerciciosguia7;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros que quiere convertir");
        int euros = leer.nextInt();
        System.out.println("Ingrese una opcion \n D. Si quiere convertir a dolares \n Y. Si quiere convertir a yenes \n L. si quiere convertir a libras");
        String moneda = leer.next();
        moneda = moneda.toUpperCase();
        convertirMoneda(moneda, euros);

    }

    public static void convertirMoneda(String moneda, int euros) {
        
        switch (moneda) {
            case "D":
                System.out.println(euros + " € convertidos a dolares es " + (1.28611 * euros) + " USD");
                break;
            case "Y":
                System.out.println(euros + " € convertidos a yenes es " + (129.852 * euros) + " ¥");
                break;
            case "L":
                System.out.println(euros + " € convertidos a libras es " + (0.86 * euros) + " £");
                break;
        }

    }

}

