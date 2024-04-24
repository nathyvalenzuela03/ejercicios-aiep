import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MascotaProfesor {
    public static void main(String[] args) {

        ArrayList<String> ListaMascotas = new ArrayList<>();
        boolean realizandoTruco = false;
        Scanner teclado = new Scanner(System.in);
        int opcion;
        String nombreMascota;
        String tipoDeMascota;
        int opcionTruco;


        do{
            System.out.println("------------------Bienvenido----------------");
            System.out.println("¿Deseas adoptar una mascota?");
            System.out.println("1.- Por supuesto, vamos!");
            System.out.println("2.- Deseas listar las mascotas que llevas adoptadas?");
            System.out.println("3.- No, muchas gracias!");
            System.out.println("Ingrese su opción: ");
            opcion =  teclado.nextInt();


            //EVALUA LA OPCION INGRESADA DE ARRIBA
            switch (opcion){
                case 1:
                    System.out.println("------------------Ingrese los datos de su mascota----------------");
                    System.out.println("Ingresa nombre de tu nueva mascota: ");
                    nombreMascota = teclado.next();
                    System.out.println("Ingresa tipo de mascota: ");
                    tipoDeMascota = teclado.next();
                    System.out.println("Deseas que tu mascota: " + nombreMascota + " haga un truco?");
                    System.out.println("Ingresa 1 para si; ingresa 2 para no");
                    opcionTruco = teclado.nextInt();

                    //EVALUA SI INGRESAS 1 PARA HACER TRUCO SI NO, AVANZA A LISTA LA INFO DE LA MASCOTA
                    if (opcionTruco == 1){
                        System.out.println("Tu mascota se ha puesto a saltar!!!");
                        realizandoTruco = true;
                        do{
                            System.out.println("Tu mascota sigue saltando!!");
                            System.out.println("¿Deseas que pare? ingresa 1 para si; ingresa 2 para que no pare.");
                            opcionTruco = teclado.nextInt();
                            if (opcionTruco == 1){
                                realizandoTruco = false;
                            }

                        //SE REPITE EL CICLO HASTA QUE SELECCIONAS 1 PARA QUE PARE, SI SELECCIONAS 1 LA VARIABLE REALIZANDO TRUCO CAMBIA A FALSE Y SALE
                        }while(realizandoTruco);
                        System.out.println("Tu mascota termino de saltar !!");
                    }

                    System.out.println("Te gustaria listar los datos de tu nueva mascota?");
                    System.out.println("ingresa 1 para si; ingresa 2 para no.");
                    opcion = teclado.nextInt();

                    if(opcion == 1){
                        System.out.println("El nombre es:" + nombreMascota+" el tipo de mascota es: " + tipoDeMascota);
                    }else {
                        System.out.println("Nos vemos!");
                    }
                    ListaMascotas.add("El nombre es: " + nombreMascota+" el tipo de mascota es: " + tipoDeMascota);
                    System.out.println("------------------Fin ingreso datos----------------");

                    break;
                case 2:
                    System.out.println("------------------Lista de mascotas----------------");
                    System.out.println("Bienvenido, veamos si tienes mascotas adoptadas:");
                    if(ListaMascotas.size() > 0){
                        System.out.println("Perfecto! estos son los amigos que llevas a tu hogar!");
                        System.out.println("---------------------------------");
                        for (String nuevosAmigos : ListaMascotas){
                            System.out.println(nuevosAmigos);
                        }
                        System.out.println("----------------------------------");

                        System.out.println("Hasta pronto! sigue adoptando ;)");
                    }else{
                        System.out.println("Ouch :( , aún no adoptas un amigo u.u ve a adoptar ahora :D");

                    }
                    System.out.println("------------------Fin lista de mascotas---------------");
                    break;
                case 3:
                    System.out.println("Gracias, nos vemos!");
                    break;
            }

        }while (opcion != 3);




    }
}