import java.util.Scanner;
public class Manteniment{
    public static void manteniment(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Opcio 1: Accedir a repostar l'estoc");
        System.out.println("Opcio 2: Accedir al monader");
        System.out.println("Opcio 10: Sortir de la aplicació");
        System.out.println();
        System.out.print("Seleccioni una opció de les tres opcions: ");
        int opcio = 0;

        do{
            opcio = sc.nextInt();
            switch(opcio){
                case 1: repostarStock();
                case 2: repostarMoneder();
                case 10: System.exit(0);
            }
        }while(opcio!=1 && opcio!=2 && opcio!=10);


    }
    public static void repostarStock(){
        System.out.println("REPSOTAR STOCK");
    }
    public static void repostarMoneder(){

    }
}
