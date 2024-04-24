public class Animal {
    String color;
    int altura;
    String raza;
    String nombre;


    Animal(String reciboColor,int reciboAltura, String recibeRaza, String reciboNombre){
        this.color = reciboColor;
        this.altura = reciboAltura;
        this.raza = recibeRaza;
        this.nombre = reciboNombre;
    }



    //Es un metodo que es publico, retorna un string que sera el nombre;
    public String getNombre(){
        // Cuerpo del metodo

        // return indica lo que devolvera la función, representa el fin de las instrucciones
        return "El nombre de tu mascota es: " + nombre;
    }
    public int getAltura(){
        // Return indica que se esta devolviendo un valor, el valor que esta devolviendo
        // debe ser del mismo tipo que se definio en el metodo
        return altura;
    }

    public void getMensajeAltura(){
        System.out.println("La altura de "+ nombre +" es:" + getAltura());
    }



}
