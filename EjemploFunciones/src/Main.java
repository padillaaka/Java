public class Main {
    public static void main(String[]Args ){
        String nombre = "Manu";
        int edad = 25;
        int resultadoSuma = suma(4,5);
        mostrarMensaje();
        mostrarUsuario(nombre, edad);
        System.out.println("El numero es " +devuelveNumero());
        System.out.println("La suma es " +resultadoSuma);
    }

    //Metodo sin parametros
    public static void mostrarMensaje (){
        System.out.println("Bienvenido");
    }

    public static void mostrarUsuario (String nombreDeUsuario, int edad){
        System.out.println("El usuario es " +nombreDeUsuario +" y tiene " +edad +" años") ;
    }

    public static int devuelveNumero (){
        int numero = 5;
        return numero;
    }

    public static int suma (int num1, int num2){
        return (num1 + num2);
    }
}
