import java.util.Scanner;
public class Manteniment{

    public static Scanner sc = new Scanner(System.in);

    public static void manteniment(){
        System.out.println("Opcio 1: Accedir a repostar l'estoc");
        System.out.println("Opcio 2: Accedir al monader");
        System.out.println("Opcio 10: Sortir de la aplicació");
        System.out.println();
        System.out.print("Seleccioni una opció de les tres opcions: ");
        System.out.println();
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
        System.out.println("Tria producte a repostar: ");
        System.out.println();

        Application.impressio(Application.llistaNomProducte, Application.llistaPreuProducte, Application.llistaStockProducte);
        System.out.print("Codi producte: ");
        int codiRepostarStock = sc.nextInt();
        System.out.print("Introdueix quantitat a repostar: ");
        int quantitatRepostar = sc.nextInt();
        System.out.println();

        Application.llistaStockProducte[codiRepostarStock] += quantitatRepostar;
        System.out.println("**********************CANVI REALITZAT**********************");
        System.out.println();
        Application.impressio(Application.llistaNomProducte, Application.llistaPreuProducte, Application.llistaStockProducte);
    }
    public static void repostarMoneder(){

    }
}
