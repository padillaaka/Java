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
        switch (numeroLeido){
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Suspenso");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("Aprobado");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("Sobresaliente");
                break;
        }
    }
}
