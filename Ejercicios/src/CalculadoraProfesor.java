
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CalculadoraProfesor {
    public static void main(String[] args) {


        // Scanner teclado = new Scanner(System.in);
        //  System.out.println("Ingrese su nombre");
        // String nombre = teclado.next();
        //  int[] nombres = {2,3,4,5,6,7,8,9,3};
        //  for (int numeros : nombres) {
        //    System.out.println(numeros);
        // }
        // for( int i = 0 ; i <= nombres.length ; i++){
        //    System.out.println(nombres[i]);
        // }

        Scanner teclado = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        int opcion;


        do {
            System.out.println("--------------Calculadora--------------");
            System.out.println("1.- Sumar 2 numeros");
            System.out.println("2.- Restar 2 numeros");
            System.out.println("3.- Dividir 2 numeros");
            System.out.println("4.- Multiplicar 2 numeros");
            System.out.println("5.- Salir");
            System.out.println("-------------------------------");
            System.out.println("Ingrese una opción: ");

            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese el 1er numero: ");
                    numero1 = Integer.parseInt(teclado.next());
                    System.out.println("Ingrese el 2do numero: ");
                    numero2 = teclado.nextInt();
                    System.out.println("El resultado es: ");
                    System.out.println( numero1 + numero2);
                    break;
                case 2:
                    System.out.println("Ingrese el 1er numero: ");
                    numero1 = Integer.parseInt(teclado.next());
                    System.out.println("Ingrese el 2do numero: ");
                    numero2 = teclado.nextInt();
                    System.out.println("El resultado de la resta es: ");
                    System.out.println( numero1 - numero2);
                    break;
                case 5:
                    System.out.println("Hasta la proxima");
                default:
                    System.out.println("Opción no permitida");
            }
        } while (opcion != 5);
        // 5 != 5 => false


    }
}