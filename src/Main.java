import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int choise;
    static String name;
    static int documento;
    static long numeroContacto;
    static String fecha;
    static String hora;

    public static void main(String[] args) {
        menu();
        respuesta();
    }

    public static void menu(){
        System.out.println("Este es el menu:");
        System.out.println("1. Reserva Medica");
        System.out.println("2. Reserva Hotelero");
        System.out.println("3. Reserva Restaurante");
        System.out.print("Escoge la respuesta ");
    }

    public static void respuesta(){
        choise = sc.nextInt();
        switch (choise){
            case 1:
                System.out.print("Ingresa su nombre: ");
                name = sc.next();
                System.out.print("Documento: ");
                documento = sc.nextInt();
                System.out.print("Numero de Contacto ");
                numeroContacto = sc.nextLong();
                System.out.print("Fecha de Reserva: ");
                fecha = sc.next();
                System.out.print("Hora de Reserva: ");
                hora = sc.next();
                Medico medicina = new Medico(name,documento,numeroContacto,fecha,hora);
                medicina.reserva();
            break;
            case 2:
                System.out.print("Ingresa su nombre: ");
                name = sc.next();
                System.out.print("Documento: ");
                documento = sc.nextInt();
                System.out.print("Numero de Contacto ");
                numeroContacto = sc.nextLong();
                System.out.print("Fecha de Reserva: ");
                fecha = sc.next();
                System.out.print("Hora de reserva: ");
                hora = sc.next();
                Hotel habitacion = new Hotel(name,documento,numeroContacto,fecha,hora);
                habitacion.reserva();

            break;
            case 3:
                System.out.print("Ingresa su nombre: ");
                name = sc.next();
                System.out.print("Documento: ");
                documento = sc.nextInt();
                System.out.print("Numero de Contacto: ");
                numeroContacto = sc.nextLong();
                System.out.println("Fecha de reserva: ");
                fecha = sc.next();
                System.out.println("Hora de reserva: ");
                hora = sc.next();
                Restaurante mesa = new Restaurante(name,documento,numeroContacto,fecha,hora);
                mesa.reserva();

            break;
            default:
                System.out.println("Opcion no valida, intentelo de nuevo");
            break;
        }
    }
}