/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosJava;

/**
 *
 * @author Badal
 */
import java.util.Scanner;

public class Raizcuadrada {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic heres

    //Ecuación de 2do grado: ax^2 + bx + c = 0
    //Declarar las variables
    double a = 0;
    double b = 0;
    double c = 0;

    //Preguntar los datos
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduce los datos de la ecuación de 2do grado: ax^2+ bx + c = 0");
    System.out.println("Valor de a?");
    a = teclado.nextDouble();
    System.out.println("Valor de b?");
    b = teclado.nextDouble();
    System.out.println("Valor de c?");
    c = teclado.nextDouble();

    //Distintos casos en los que el valor es 0
    // Si solamente a es igual a 0
    if ((a == 0) && (b != 0)) {
      System.out.println(b + "x" + " + " + c + " = 0");
      System.out.println(b + "x" + " = " + -c);
      System.out.println("x" + " = " + (-c / b));
    } // Si a y b son iguales a 0
    else if ((a == 0) && (b == 0)) {
      System.out.println("No tiene solución");
    } // Si solamente b es igual a 0 
    else if ((a != 0) && (b == 0)) {
      if (c > 0) {
        System.out.println(a + "x^2" + " + " + c + " = " + "0");
        System.out.println(a + "x^2" + " = " + -c);
        System.out.println("x^2" + " = " + (-c / a));
        System.out.println("Tiene soluciones imaginarias");
        System.out.println("Solución1: x" + " = " + "Raiz cuadrada de " + (-c / a) + "i");
        System.out.println("Solución2: x" + " = " + "Raiz cuadrada de " + (c / a) + "i");
      } else if (c < 0) {
        System.out.println(a + "x^2" + " + " + c + " = " + "0");
        System.out.println(a + "x^2" + " = " + -c);
        System.out.println("x^2" + " = " + (-c / a));
        System.out.println("Solución1: x" + " = " + Math.sqrt(-c / a));
        System.out.println("Solución1: x" + " = " + -Math.sqrt(-c / a));
      } else if (c == 0) {
        System.out.println("Solución 1 y 2: x = 0");
      }
    } // Si a y b son distintos de 0
    else if ((a != 0) && (b != 0)) {
      double raizcuadrada = (Math.pow(b, 2)) - (4 * a * c);
      System.out.println(raizcuadrada);
      if (raizcuadrada < 0) {
        System.out.println("Tiene soluciones imaginarias");
        System.out.println("Solucion1: x = " + -b + " + Raiz cuadrada de " + raizcuadrada + "i" 
                + " divido entre " + (2 * a));
        System.out.println("Solucion1: x = " + -b + " + Raiz cuadrada de " 
                + raizcuadrada + "i" + " divido entre " + (2 * a));
      } else if (raizcuadrada >= 0) {
        System.out.println("Solucion1: x = " + ((-b + (Math.sqrt(raizcuadrada)))/(2 * a)));
        System.out.println("Solucion1: x = " + ((-b - (Math.sqrt(raizcuadrada)))/(2 * a)));
      }

    }

  }
}
