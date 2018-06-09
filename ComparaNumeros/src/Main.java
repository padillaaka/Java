import java.util.Scanner;

public class Main {
    public static void main(String []Args){
        //Para leer por teclado
        Scanner teclado = new Scanner(System.in);

        //Variable para guardar la entrada de teclado
        int numeroLeido;

        //Pedimos al usuario un numero
        System.out.print("Introduzca un numero: ");
        numeroLeido = teclado.nextInt();

        //Comparamos
        if (numeroLeido < 0){
            System.out.println("Su numero es negativo");
        }

        if (numeroLeido > 0 && numeroLeido <= 5){
            System.out.println("Suspenso");
        }

        if (numeroLeido > 5 && numeroLeido <= 8){
            System.out.println("Notable");
        }

        if (numeroLeido > 8 && numeroLeido <= 10){
            System.out.println("Sobresaliente");
        }

        System.out.println("Su numero: "+numeroLeido);




    }
}
