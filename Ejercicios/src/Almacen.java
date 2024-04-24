import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Almacen {
    public static void main(String[] args) {
        // minimarker - crear un programa que nos d ela opción de comprar o salir de la tienda
        // si decidimis comprar, poder agregar las compras a una bolsa o salir, debe darnos
        // la opción por ejemento comprado

        ArrayList<String> bolsa = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        int opcionComprar;

        System.out.println("-----------Bienvenido al minimarket--------");
        System.out.println("1. Entrar a comprar");
        System.out.println("2. Salir");
        System.out.println("------------------------");
        System.out.println("Selecciones una opcion");
        opcionComprar = teclado.nextInt();

        switch (opcionComprar){

            case 1:
                do{
                    System.out.println("-------------------");
                    System.out.println("1. Comprar productos");
                    System.out.println("2. Salir");
                    System.out.println("-----1-------------------");
                    System.out.println("Selecciones una opcion");
                    opcionComprar = teclado.nextInt();

                    switch (opcionComprar){

                        case 1:
                            System.out.println("Agregue producto a la bolsa");
                            String producto = teclado.next();
                            bolsa.add(producto);
                            break;
                        case 2:
                            System.out.print("Su lista de productos es: ");
                            for (String elemento : bolsa){
                                System.out.println(elemento);
                            }
                            System.out.println("Vuelva pronto");
                    }
                }while(opcionComprar != 2);

                break;
            case 2:
                System.out.println("Hasta pronto");







        }


    }
}

