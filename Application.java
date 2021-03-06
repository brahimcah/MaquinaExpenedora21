import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Application{
    //Declaració array públic amb el nom dels productes.
    public static String[] llistaNomProducte = new String[Constants.MAX_NUM_ARTICLES];
    
    //Declaració array públic amb el preu dels productes.
    public static double[] llistaPreuProducte = new double[Constants.MAX_NUM_ARTICLES];

    //Declaració array públic amb la quantitat d'estoc.
    public static int[] llistaStockProducte = new int[Constants.MAX_NUM_ARTICLES];

    //Declaració array públic amb la quantitat de monedes de cada tipus.
    public static int[] llistaStockMonedes = new int[Constants.NUM_MONEDES_ACCEPTADES];

    //Funció que imprimeix el contingut de la màquina.
    public static void impressio(String[] NomProducte, double[] PreuProducte, int[] StockProducte){
        for(int i=0;i<10;i++){
            System.out.println("Codi: "+ i +" || Producte: " + NomProducte[i] + " || Preu: " + PreuProducte[i] + "€ || Quantitat disponible: " + StockProducte[i]);
            System.out.println("--------------------------------------------------------------------------------------");
        }
    }

    //Funcio que fa un delay donats uns segons.
    public static void delaySegons(int segons){
        segons *= 1000;
        try {
            Thread.sleep(segons);
            } 
        catch(InterruptedException ex){
            Thread.currentThread().interrupt();
            }
    }
    //Funció que imprimeix l'estoc de les monedes.
    public static void impressioMonedes(int [] llistaStockMonedes){
        System.out.println("Codi monedes de 2€: 0  ||  Quantitat actual: " + llistaStockMonedes[0]);
        System.out.println("Codi monedes de 1€: 1  ||  Quantitat actual: " + llistaStockMonedes[1]);
        System.out.println("Codi monedes de 0,50€: 2  ||  Quantitat actual: " + llistaStockMonedes[2]);
        System.out.println("Codi monedes de 0,20€: 3  ||  Quantitat actual: " + llistaStockMonedes[3]);
        System.out.println("Codi monedes de 0,10€: 4  ||  Quantitat actual: " + llistaStockMonedes[4]);
        System.out.println("Codi monedes de 0,05€: 5  ||  Quantitat actual: " + llistaStockMonedes[5]);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean infinit = true; //Variable per fer un bucle infinit en el 'while'.
        int codi = 0; //Inicialització de la variable codi.
        
        //Assignacions dels valors dels Arrays
        Stock.assignacioNomProductes();
        Stock.assignacioPreuProductes();
        Stock.assignacioStockProductes();
        Stock.assignacioStockMonedes();

        do{
            impressio(llistaNomProducte, llistaPreuProducte, llistaStockProducte);//Impressió dels productes.
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
                    delaySegons(1);
                }
            }else{
                if(Stock.comprovacioStock(codi)!="?"){//Comprovació de Stock, en cas d'haver Stock es seguirà amb el programa
                    
                    //Comprovació de diners a introduir, en cas d'haver canvi i una introducció d'aquests correcte es retorna el producte
                    if(Diners.diners(codi)>=0){
                        System.out.println("--------------------------------------------------------------------------------------");
                        System.out.println("Aquí tens el teu producte: " + llistaNomProducte[codi]);
                        System.out.println();
                        delaySegons(1);
                        llistaStockProducte[codi]--;
                    }else{//En cas de no tenir canvi del producte solicitat.
                        System.out.println("*********************ERROR*********************");
                        System.out.println("Ho sentim però no tenim canvi. Sisplau torna o canvia de producte.");
                        delaySegons(1);
                    }
                }else{//En cas de no tenir estoc del producte solicitat.
                    System.out.println("*********************ERROR*********************");
                    System.out.println("El producte sol·licitat no te estoc, siusplau introdueix un nou altre producte.");
                    delaySegons(1);
                }
            }
        }while(infinit);
    }
}


/**
 * @author 
 */
