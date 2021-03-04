import java.util.Scanner;
public class application{
    public static String[] NomProducte = {"Chips Casolanes","Xocolata amb Ametlles","Coca-Cola","Aigua 50ml","ColaCao ml","Galetes Veganes","Sanwitch de Pavo","Filipinos","Magdalena","Palmera"};
    public static double[] PreuProducte = {1.50,1,2,0.75,1.85,1.55,2.50,1,1.10,1.25};
    public static int[] StockProducte = {20,12,20,7,18,15,5,1,11,12};

    public static void retornarNomProducte(String[] NomProducte){
        System.out.println(NomProducte[1]);
    }
    
    public static void impressio(String[] NomProducte, double[] PreuProducte, int[] StockProducte){
        for(int i=0;i<10;i++){
            System.out.println("Codi: "+ i +" | Producte: " + NomProducte[i] + " | Preu: " + PreuProducte[i] + "€ | Quantitat disponible: " + StockProducte[i]);
            System.out.println("--------------------------------------------------------------------------------------");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean infinit = true;
        int codi = 0;
        
        impressio(NomProducte, PreuProducte, StockProducte);

        do{
            System.out.print("Sisplau introdueix el codi del producte: ");
            codi=sc.nextInt();

            while((codi<0 && codi>9) && codi!=99 ){//Si s'introdueix un codi erroni //ERROR SEMPRE ENTRA
                System.out.println("*********************ERROR*********************");
                System.out.println("El codi introduït és incorrecte.");
                System.out.print("Sisplau introdueix el codi del producte: ");
                codi=sc.nextInt();
            }

            if(codi==99){ //Per accedir a manteniment
                System.out.print("Introdueix la contrasenya: ");
                int contrasenya = sc.nextInt();
                if(contrasenya==9876){
                    Manteniment.manteniment();
                }else{
                    System.out.print("Contrasenya incorrecta.");
                    System.exit(0);
                }
            }else{
                if(Stock.nomProducteStock(codi, NomProducte, PreuProducte, StockProducte)!="?"){//Comprovació de Stock, en cas d'haver Stock es seguirà amb el programa
                    if(Diners.diners(codi)>=0){//Comprovació de diners a introduir, en cas d'haver canvi i una introducció d'aquests correcte es retorna el producte
                        System.out.println("Aqui tens el teu producte" + NomProducte[codi]);
                    }else{
                        System.out.println("*********************ERROR*********************");
                        System.out.println("Ho sentim però no tenim canvi. Sisplau torna o canvia de producte.");
                        codi = 10;
                    }
                }else{
                    System.out.println("*********************ERROR*********************");
                    System.out.println("El producte solicitat no te Stock, sisplau introdueix un nou altre producte.");
                    codi = 10;
                }
            }
        }while(infinit);
    }
}


/**
 * @author 
 */