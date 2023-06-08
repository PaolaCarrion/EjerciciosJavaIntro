
import java.util.Scanner;


public class Ejercicio12 {
      public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        int contC = 0;
        int contI = 0;
          do {
              System.out.println("Ingrese su frases");
              frase = leer.nextLine();
              frase = (frase.toUpperCase());
              if (frase.length()==5 && frase.substring(0,1).equals("X") && frase.substring(4,5).equals("O") || frase.equals("&&&&&") ){
                  contC= contC +1;
              }else{
                  contI=contI +1;
              }
              
          } while (!frase.equals("&&&&&"));
          
          System.out.println("Usted ingreso " +contC+ " frases corectas y "+contI+ " incorrectas"); 
        
    }
}
