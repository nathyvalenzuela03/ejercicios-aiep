import java.util.Scanner;

    public class Cajero {
        public static void main(String[] args) {

            int opcion;
            int saldo = 250000;
            int deposito = 0;
            int retiro = 0;
            Scanner teclado = new Scanner(System.in);

            do {

                System.out.println("------------------BIENVENIDO----------------");
                System.out.println("------SELECCIONE UNA OPCION PARA COMENZAR---");
                System.out.println("1.- CONSULTAR SALDO");
                System.out.println("2.- DEPOSITAR DINERO");
                System.out.println("3.- RETIRAR DINERO");
                System.out.println("4.- SALIR");

                opcion = teclado.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Su saldo es: " + saldo);
                        System.out.println("-----------------------------------------");
                        break;

                    case 2:
                        System.out.println("Ingrese monto a depositar");
                        deposito = teclado.nextInt();
                        saldo = saldo + deposito;
                        System.out.println("Su nuevo saldo es: " + saldo);
                        break;

                    case 3:
                        System.out.println("Ingrese monto a retirar");
                        retiro = teclado.nextInt();

                        if (saldo >= retiro) {
                            saldo = saldo - retiro;
                            System.out.println("Su nuevo saldo es: " + saldo);
                        } else {
                            System.out.println("Saldo insuficiente");
                        }
                        break;

                    case 4:
                        System.out.println("Opción invalida");
                        break;

                }
            } while (opcion != 4);

            teclado.close();
        }
    }

}
