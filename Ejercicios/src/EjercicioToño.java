import java.util.Scanner;

public class EjercicioToño {
    public static void main(String[] args) {

        String nombre;
        String apellido;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa nombre: ");
        nombre= teclado.next();
        System.out.println("Ingrese Apellido: ");
        apellido= teclado.next();
        System.out.println("Su Nombre y apellido es: "+nombre+" "+apellido);

    }
}
