import java.util.Scanner;
public class Manteniment{

    public static Scanner sc = new Scanner(System.in);

    public static void manteniment(){
        System.out.println("Opcio 1: Accedir a repostar l'estoc");
        System.out.println("Opcio 2: Accedir al monader");
        System.out.println("Opcio 10: Sortir de la aplicació");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.print("Seleccioni una opció de les tres opcions: ");
        int opcio = 0;

        do{ //Bucle en cas d'introduir un codi incorrecte.
            opcio = sc.nextInt();
            switch(opcio){ //Switch de tria d'opcions.
                case 1: repostarStock();
                        break;
                case 2: repostarMoneder();
                        break;
                case 10:break;

                default: System.out.println("*********************ERROR*********************");
                         System.out.println("Opció incorrecte.");
                         System.out.print("Torna a introdior el codi: ");
            }
        }while(opcio!=1 && opcio!=2 && opcio!=10);


    }
    public static void repostarStock(){
        System.out.println("Tria producte a repostar: ");
        System.out.println();

        Application.impressio(Application.llistaNomProducte, Application.llistaPreuProducte, Application.llistaStockProducte);
        System.out.println("Per sortir introduïr codi 99.");
        System.out.print("Codi producte: ");
        int codiRepostarStock = sc.nextInt();//Variable que guarda el codi a repostar.

        while(codiRepostarStock!=99){//Bucle per anar demanant stock a respotar, en cas d'introduir el codi 99 sortirà del manteniment.

            while(codiRepostarStock<0 && codiRepostarStock>9){//En cas d'introduir un codi incorrecte.
                System.out.println("*********************ERROR*********************");
                System.out.println("El codi introduït és incorrecte.");
                System.out.print("Sisplau introdueix el codi del producte: ");
                codiRepostarStock=sc.nextInt();
            }

            System.out.print("Introdueix quantitat a repostar: ");
            int quantitatRepostar = sc.nextInt(); //Variable que guarda la quantitat de producte que es repsotarà.
            System.out.println();
    
            Application.llistaStockProducte[codiRepostarStock] += quantitatRepostar; //Suma de la quantitat que es vol afegir a la ja existent.
            System.out.println("**********************CANVI REALITZAT**********************");
            System.out.println();

            Application.impressio(Application.llistaNomProducte, Application.llistaPreuProducte, Application.llistaStockProducte);//Impressió.
            System.out.println("Per sortir introduïr codi 99.");
            System.out.print("Codi producte: "); //Tornar a demanar el codi d'un producte en cas de voler repostar un altre.
            codiRepostarStock = sc.nextInt();
        }
    }
    public static void repostarMoneder(){
        System.out.println("Tria monedes a repsotar:");
        System.out.println("");

        Application.impressioMonedes(Application.llistaStockMonedes);
        System.out.println("Per sortir introduïr codi 99.");
        System.out.print("Codi producte: ");
        int codiRepostarMonedes = sc.nextInt();//Variable que guarda el codi a repostar.

        while(codiRepostarMonedes!=99){//Bucle per anar demanant stock a respotar, en cas d'introduir el codi 99 sortirà del manteniment.
            while(codiRepostarMonedes<0 && codiRepostarMonedes>6){//En cas d'introduir un codi incorrecte.
            System.out.println("*********************ERROR*********************");
            System.out.println("El codi introduït és incorrecte.");
            System.out.print("Sisplau introdueix el codi del producte: ");
            codiRepostarMonedes=sc.nextInt();
            }

            System.out.print("Introdueix quantitat a repostar: ");
            int quantitatRepostar = sc.nextInt(); //Variable que guarda la quantitat de producte que es repsotarà.
            System.out.println();

            Application.llistaStockMonedes[codiRepostarMonedes] += quantitatRepostar; //Suma de la quantitat que es vol afegir a la ja existent.
            System.out.println("**********************CANVI REALITZAT**********************");
            System.out.println();

            Application.impressioMonedes(Application.llistaStockMonedes);
            System.out.println("Per sortir introduïr codi 99.");
            System.out.print("Codi producte: "); //Tornar a demanar el codi d'un producte en cas de voler repostar un altre.
            codiRepostarMonedes = sc.nextInt();
            System.out.println("--------------------------------------------------------------------------------------");
        }
    }
}
