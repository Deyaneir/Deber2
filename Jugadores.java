import java.util.Scanner;

public class Jugadores {
    String nombre;
    String posicion;
    int edad;
    int numero;

    public Jugadores(String nombre1, String posicion2, int edad3, int numero4) {

        this.nombre=nombre1;
        this.posicion=posicion2;
        this.edad=edad3;
        this.numero=numero4;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jugadores Jugador1=new Jugadores("Leonel Messi","delantero",36,10);
        Jugadores Jugador2= new Jugadores("Rodrigo Hernandez","Centrocampista",28,16);
        Jugadores Jugador3=new Jugadores("Thibaut Courtois","Portero",32,1);
        Jugador1.salida();
        Jugador2.salida();
        Jugador3.salida();
        sc.close();

    }

    public void salida(){
    System.out.println("Nombre del jugador es: "+nombre+" su posicion es: "+posicion+" Su edad es: "+ edad+" el numero de camiseta es: "+numero);
    }

}

