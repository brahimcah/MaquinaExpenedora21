import java.util.*;

public class Stock {
    
     public static String nomProdcuteStock(int codi, String NomProducte[], int StockProducte[]){
        
        if(StockProducte[codi] > 0 ){
             return NomProducte[codi];
        } else {
            return "?";
        }
    }

/*    public static void NomsProductes(String[] NomProducte){
        //Noms dels Productes
        NomProducte = new String[10];
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
        }

    public static void PreusProductes(double[] PreuProducte){
        //Preus dels Productes
        PreuProducte = new double [10];
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
    }

    public static void StocksProductes(int[] StockProducte){
        //Stock dels Productes
        StockProducte = new int [10];
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
    }*/
}