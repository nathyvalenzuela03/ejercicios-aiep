import java.util.Scanner;

        /*Desarrollar una calculadora de índice de masa corporal (IMC) que utilice la sentencia switch para mostrar un
        menú interactivo y la estructura do-while para permitir al usuario realizar múltiples cálculos.

        Descripción:

        El programa debe solicitar al usuario su peso en kilogramos y su altura en metros.
        Luego, utilizando la fórmula del IMC (IMC = peso / altura^2), calcular el índice de masa corporal del usuario.
        Mostrar el IMC del usuario junto con una interpretación de su valor según la clasificación de la OMS.
        Presentar un menú interactivo con las siguientes opciones:
        1. Calcular IMC: Permite al usuario realizar un nuevo cálculo de IMC.
        2. Salir: Finaliza la ejecución del programa.
        El programa debe repetir el menú hasta que el usuario seleccione la opción "Salir".*/


public class CalculadoraImc { //nombre de clase//
    public static void main(String[] args) { //inicio de ejecuccion del programa


        float altura; //datos, aca el profe pidio calculr imc segun el peso y la estatura
        // float es para ingresar en numero decimal, ya que la altura se mide en metros//
        float peso;
        float imc;
        int opcion;  // guarda la opcion ingresado por teclado//
        Scanner teclado = new Scanner(System.in); // lo que ejecuta para que salga en pantalla//

        do { //aqui emppieza a ingresar el menu manualmmente/
        
            System.out.println("------------------BIENVENIDO----------------");
            System.out.println("------SELECCIONE UNA OPCION PARA COMENZAR---");
            System.out.println("1.- CALCULAR IMC");
            System.out.println("2.- SALIR");
            opcion =  teclado.nextInt(); //valida y hace que se ejecute//

            switch (opcion){
                case 1:
                    System.out.println("Ingrese su Peso:");
                    peso = teclado.nextFloat();
                    System.out.println("Ingrese su Altura:");
                    altura = teclado.nextFloat();
                    imc = (peso / (altura * altura));

                    if (imc < 18.49){ // si es//
                        System.out.println("Su IMC es de: "+ imc + ", usted esta en BAJO PESO");
                    }else if (imc >= 18.50 && imc <= 24.99) { //sino//
                        System.out.println("Su IMC es de: "+ imc + ", usted esta en PESO NORMAL");
                    }else if (imc >= 25 && imc <= 29.99){
                        System.out.println("Su IMC es de: "+ imc + ", usted esta en SOBREPESO");
                    }else if (imc >= 30 && imc <= 34.99){
                        System.out.println("Su IMC es de: "+ imc + ", usted esta en OBESIDAD LEVE");
                    }else if (imc >= 35 && imc <= 39.99){
                        System.out.println("Su IMC es de: "+ imc + ", usted esta  en OBESIDAD MEDIA");
                    }else if (imc >= 40){
                        System.out.println("Su IMC es de: "+ imc + ", usted esta en OBESIDAD MORBIDA");
                    }
                    System.out.println("----------------------------------------------------------");
                    break;

                    case 2:
                        System.out.println("Se cerrara el programa");
                        break;

                    default:
                        System.out.println("Opción invalida, seleccione opción 1 o 2");

            }
        }while(opcion !=2);

        teclado.close();
    }
}
