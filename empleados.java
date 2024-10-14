import java.util.Scanner;

public class empleados {

    String nombre;
    String cargo;
    int salario;
    double fecha;

    public empleados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese el cargo de la empleado: ");
        cargo = sc.nextLine();
        System.out.println("Ingrese el salario del empleado: ");
        salario = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el fecha de la empleado: ");
        fecha = sc.nextDouble();
        sc.nextLine();

    }
    public void presentar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: " + salario);
        System.out.println("Fecha: " + fecha);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        empleados empleados1 = new empleados();
        empleados empleados2 = new empleados();
        empleados empleados3 = new empleados();
        empleados1.presentar();
        empleados2.presentar();
        empleados3.presentar();
        sc.close();
    }
}
