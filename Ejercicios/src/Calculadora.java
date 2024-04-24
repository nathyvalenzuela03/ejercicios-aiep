import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calculadora {
    public static void main(String[] args) {

        // Scanner teclado = new Scanner(System.in);
        // System. out.printn("Ingrese su nombre");
        // String nombre = teclado.netx();

        //String[] nombres = {"pablo", "juan", "pedro"};
        //int[] numeros = {2,3,4,5,6,7,8,9,3};

        //for(numeros :nombres: nombres){
            //System.out.println();
        //}

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = teclado.next();
        System.out.println("Su nombre es: "+nombre);

        System.out.println("-----------Calculadora-----------");
        System.out.println("1- Sumar 2 numeros");
        System.out.println("2 -Restar 2 numeros");
        System.out.println("3- Multiplicar 2 numeros");
        System.out.println("4- Dividir 2 numeros");
        System.out.println("5- Salir");
        System.out.println("--------------------------------");

        String opcion = teclado.next();

        switch (opcion){
            case "1":
                System.out.println("Usted selecciono SUMA");
                System.out.println("Ingrese el primer numero");
                int suma1 = Integer.parseInt(teclado.next());
                System.out.println("Ingrese el 2do numero:");
                int suma2 = teclado.nextInt();
                int suma= suma1+suma2;
                System.out.println("El resultado es: "+suma);
                break;
            case "2":
                System.out.println("Usted selecciono RESTA");
                System.out.println("Ingrese el primer numero");
                int resta1 = Integer.parseInt(teclado.next());
                System.out.println("Ingrese el 2do numero:");
                int resta2 = teclado.nextInt();
                int resta= resta1-resta2;
                System.out.println("El resultado es: "+resta);
                break;
            case "3":
                System.out.println("Usted selecciono MULTIMPLICACION");
                System.out.println("Ingrese el primer numero");
                int multiplicacion1 = Integer.parseInt(teclado.next());
                System.out.println("Ingrese el 2do numero:");
                int multiplicacion2 = teclado.nextInt();
                int multiplicacion= multiplicacion1*multiplicacion2;
                System.out.println("El resultado es: "+multiplicacion);
                break;
            case "4":
                System.out.println("Usted selecciono DIVISION");
                System.out.println("Ingrese el primer numero");
                int division1 = Integer.parseInt(teclado.next());
                System.out.println("Ingrese el 2do numero:");
                int division2 = teclado.nextInt();
                int division= division1/division2;
                System.out.println("El resultado es: "+division);
                break;
            case "5":
                System.out.println("Hasta la proxima");
            default:
                System.out.println("Opción no permitida");




        }

    }
}