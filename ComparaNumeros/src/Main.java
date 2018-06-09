import java.util.Scanner;

public class Main {
    public static void main(String []Args){
        //Para leer por teclado
        Scanner teclado = new Scanner(System.in);

        int opcionMenu;
        String nombreDeUsuario = null;
        int edad;
        String usuarioBorrado = null;
        //mostramos menu
        mostrarMenu();

        //pedimos opcion a realizar
        System.out.print("Que desea hacer: ");
        opcionMenu = teclado.nextInt();

        switch (opcionMenu){
            case 1:
                System.out.print("Introduzca el nombre de usuario: ");
                teclado.nextLine();
                nombreDeUsuario = teclado.nextLine();
                System.out.print("Introduzca su edad: 2");
                edad = teclado.nextInt();

                System.out.println("Se a creado el usuario "+nombreDeUsuario +" con edad "+edad);
                break;
            case 2:
                System.out.println("Introduzca el nombre del usuario que desea borrar");
                teclado.nextLine();
                usuarioBorrado = teclado.nextLine();
                if (usuarioBorrado.equals("pepe"))
                {
                    System.out.println("Usuario borrado");
                }
                else{
                    System.out.println("Usuario no encontrado");
                }
                break;
        }
    }

    public static void mostrarMenu(){
        System.out.println("1. Crear Usuario");
        System.out.println("2. Borrar usuario");
        System.out.println("3. Buscar usuario");
        System.out.println("4. Salir");
    }
}
