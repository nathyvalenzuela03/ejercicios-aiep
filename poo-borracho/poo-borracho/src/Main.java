//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Main es la clase principal, que se ejecuta cuando damos iniciar al proyecto
        // es una suerte de puerta de entrada

        Borracho Borrachin = new Borracho(23,false,"Mojito",false,50,5);

        Borracho Borrachote = new Borracho(50,false,"Chela",false,50,2);

        Borrachin.MostrarEdad();
        Borrachin.CambiarEdad(60);
        Borrachin.MostrarEdad();



    }
}