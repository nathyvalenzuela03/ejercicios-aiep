import java.util.ArrayList;
import java.util.Scanner;

public class Mascota {
    public static void main(String[] args) {

        ArrayList<String> bolsa = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        int opcionAdoptar;

        System.out.println("-----------Adopción de Mascotas--------");
        System.out.println("1. Adoptar Mascota");
        System.out.println("2. Salir");
        System.out.println("------------------------");
        System.out.println("Desea adoptar una Mascota");
        opcionAdoptar = teclado.nextInt();


        switch (opcionAdoptar){

            case 1:
                do{
                    System.out.println("-------------------");
                    System.out.println("1. Adoptar Mascota");
                    System.out.println("2. Salir");
                    System.out.println("------------------------");
                    System.out.println("Decea adoptar una mascota");
                    opcionAdoptar = teclado.nextInt();

                    switch (opcionAdoptar){

                        case 1:
                            System.out.println("Agregue tipo de mascota");
                            String tipoMascota = teclado.next();
                            bolsa.add(tipoMascota);

                            System.out.println("Nombre a la mascota");
                            String nombreMascota = teclado.next();
                            bolsa.add(nombreMascota);

                            System.out.println("Trucos de mascota");
                            String trucosMascota = teclado.next();
                            bolsa.add(trucosMascota);

                            System.out.println("Datos de la mascota");
                            String datosMascota = teclado.next();
                            bolsa.add(datosMascota);



                            break;
                        case 2:
                            System.out.print("Su nombre de Mascota es: ");
                            for (String Mascota : bolsa){
                                System.out.println(Mascota);
                            }
                            System.out.println("Vuelva pronto");
                    }
                }while(opcionAdoptar != 2);

                break;
            case 2:
                System.out.println("Hasta pronto");







        }

    }
}
