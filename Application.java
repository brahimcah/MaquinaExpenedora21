import java.util.Scanner;
public class Application{
    //Declaració array públic amb el nom dels productes.
    public static String[] llistaNomProducte = new String[Constants.MAX_NUM_ARTICLES];
    
    //Declaració array públic amb el preu dels productes.
    public static double[] llistaPreuProducte = new double[Constants.MAX_NUM_ARTICLES];

    //Declaració array públic amb la quantitat d'estoc.
    public static int[] llistaStockProducte = new int[Constants.MAX_NUM_ARTICLES];

    // public static void retornarNomProducte(String[] NomProducte){
    //     System.out.println(NomProducte[1]);
    // }
    
    //Funció que imprimeix el contingut de la màquina.
    public static void impressio(String[] NomProducte, double[] PreuProducte, int[] StockProducte){
        for(int i=0;i<10;i++){
            System.out.println("Codi: "+ i +" | Producte: " + NomProducte[i] + " | Preu: " + PreuProducte[i] + "€ | Quantitat disponible: " + StockProducte[i]);
            System.out.println("--------------------------------------------------------------------------------------");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean infinit = true; //Variable per fer un bucle infinit en el 'while'.
        int codi = 0; //Inicialització de la variable codi.
        
        //Assignacions dels valors dels Arrays
        Stock.assignacioNomProduces();
        Stock.assignacioPreuProductes();
        Stock.assignacioStockProductes();

        impressio(llistaNomProducte, llistaPreuProducte, llistaStockProducte);//Impressió dels productes.

        do{
            System.out.print("Sisplau introdueix el codi del producte: ");
            codi=sc.nextInt();

            while((codi<0 || codi>9) && codi!=99 ){//Si s'introdueix un codi erroni es torna a demanar.
                System.out.println("*********************ERROR*********************");
                System.out.println("El codi introduït és incorrecte.");
                System.out.print("Sisplau introdueix el codi del producte: ");
                codi=sc.nextInt();
            }

            if(codi==99){ //Per accedir a manteniment.
                System.out.print("Introdueix la contrasenya: ");
                int contrasenya = sc.nextInt();
                if(contrasenya==Constants.PASSWORD){
                    Manteniment.manteniment();
                }else{ //En cas de possar malament la contrasenya és torna a demanar el producte.
                    System.out.println("*********************ERROR*********************");
                    System.out.println("Contrasenya incorrecta.");
                    System.out.println();
                }
            }else{
                if(Stock.comprovacioStock(codi)!="?"){//Comprovació de Stock, en cas d'haver Stock es seguirà amb el programa
                    
                    //Comprovació de diners a introduir, en cas d'haver canvi i una introducció d'aquests correcte es retorna el producte
                    if(Diners.diners(codi)>=0){
                        System.out.println("Aquí tens el teu producte" + llistaNomProducte[codi]);
                    }else{//En cas de no tenir canvi del producte solicitat.
                        System.out.println("*********************ERROR*********************");
                        System.out.println("Ho sentim però no tenim canvi. Sisplau torna o canvia de producte.");
                        codi = 10;
                    }
                }else{//En cas de no tenir estoc del producte solicitat.
                    System.out.println("*********************ERROR*********************");
                    System.out.println("El producte sol·licitat no te estoc, siusplau introdueix un nou altre producte.");
                    codi = 10;
                }
            }
        }while(infinit);
    }
}


/**
 * @author 
 */
