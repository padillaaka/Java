public class Main {
    public static void main(String [] Args){
        System.out.println("Se han mandado " +Args.length +" argumentos");

        for (int i = 0; i < Args.length; i++){
            System.out.println(Args[i]);
        }

        if (Args[0].equals("add")){
            if (Args[1].equals("1"))
            {
                System.out.println("se añaden 1 archivo");
            }
            else
                System.out.println("error despues de 'add' tiene que el numero de archivos que se añaden");
        }
    }
}
