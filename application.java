import java.util.Scanner;
public class application{
    public static void impressio(){
        for(int i=0;i<10;i++){
            // System.out.println("Producte: "+comprovacioNomProducte(i)+"  Codi: "+i)
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        impressio();
        boolean infinit = true;
        int codi = 0;
        
        String[] NomProducte= new String[10];
        NomProducte[0] = "Chips Casolanes";
        NomProducte[1] = "Xocolata amb Ametlles";
        NomProducte[2] = "Coca-Cola";
        NomProducte[3] = "Aigua 50ml";
        NomProducte[4] = "ColaCao ml";
        NomProducte[5] = "Galetes Veganes";
        NomProducte[6] = "Sanwitch de Pavo";
        NomProducte[7] = "Filipinos";
        NomProducte[8] = "Magdalena";
        NomProducte[9] = "Palmera";

        double[] PreuProducte = new double [10];
        PreuProducte[0] = 1.50;
        PreuProducte[1] = 1;
        PreuProducte[2] = 2;
        PreuProducte[3] = 0.75;
        PreuProducte[4] = 1.85;
        PreuProducte[5] = 1.55;
        PreuProducte[6] = 2.50;
        PreuProducte[7] = 1;
        PreuProducte[8] = 1.10;
        PreuProducte[9] = 1.25;

        int[] StockProducte = new int [10];
        StockProducte[0] = 20;
        StockProducte[1] = 12;
        StockProducte[2] = 20;
        StockProducte[3] = 07;
        StockProducte[4] = 18;
        StockProducte[5] = 15;
        StockProducte[6] = 5;
        StockProducte[7] = 1;
        StockProducte[8] = 11;
        StockProducte[9] = 12;

        do{
            System.out.print("Sisplau introdueix el codi del producte: ");
            codi=sc.nextInt();

            while((codi<0 && codi>9) || codi!=99 ){//Si s'introdueix un codi erroni //ERROR SEMPRE ENTRA
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
                if(Stock.nomProdcuteStock(codi, NomProducte, PreuProducte, StockProducte)!="?"){//Comprovació de Stock, en cas d'haver Stock es seguirà amb el programa
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