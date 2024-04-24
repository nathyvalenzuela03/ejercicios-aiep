// Que es una clase ? es la representación de un objeto que tiene caracteristicas y realiza acciones
public class Borracho {
    // edad , cufifo, trago preferido, vejigallena, nivel de vejiga, tragos bebidos

    //Atributos = son las caracteristicas de nuestra clase y
    // que se definen como una variable
    int edad;
    boolean cufifo; // estado que define si esta borracho o no.
    String tragoPreferido;
    boolean vejigaLLena;
    int nivelVejiga;
    int tragosBebidos;

    // El constructor define los parametros iniciales
    // Que tendra la clase cuando se instancie,
    // La caracteristica del constructor, que es un metodo y que lleva el mismo
    // nombre de la clase
    Borracho(int edad,boolean cufifo,String tragoPreferido,
             boolean vejigaLLena,int nivelVejiga,int tragosBebidos){
        this.edad = edad;
        this.cufifo = cufifo;
        this.tragoPreferido = tragoPreferido;
        this.vejigaLLena = vejigaLLena;
        this.nivelVejiga = nivelVejiga;
        this.tragosBebidos = tragosBebidos;
    }

    // se define publico, es decir, puede ser accedido desde cualquier parte
    // tipo de dato que va a tener que retornar nuestro metodo
    // Nombre del metodo
    public String PedirTrago(){
        return "Haz pedido el trago:" + tragoPreferido;
    }

    public boolean ValidarSiEstaBorracho(){
        if(tragosBebidos >= 3){
            return true;
        }
        return false;
    }

    // El 'void' indica que el metodo no retorna nada
    public void MostrarEstado(){
        if(ValidarSiEstaBorracho()){
            System.out.println("El comprade esta listo! no le den mas!!!!!");
        }
        else{
            System.out.println("El comprade aun no llega a su limite!!!");
        }
    }

    public int CambiarEdad(int nuevaEdad){
        this.edad = nuevaEdad;
        return this.edad;
    }

    public void MostrarEdad(){
        System.out.println("La edad de borracho es: " + this.edad);
    }






}
