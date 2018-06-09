public class Main {
    public static void main(String [] Args){
        ejemploWhile();
    }

    public static void ejemploFor(){
        for (int i = 0; i <= 10; i++){
            System.out.println("Hola Juan " +i );
        }
    }

    public static void ejemploWhile(){
        int contador = 0;
        while (contador <= 10){
            System.out.println("Contador vale " +contador);
            //contador = contador + 1;
            contador++;
        }
    }
}
