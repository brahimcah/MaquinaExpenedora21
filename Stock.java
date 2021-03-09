public class Stock {
    
     public static String comprovacioStock(int codi){
        
        if(Application.llistaStockProducte[codi] > 0 ){
             return Application.llistaNomProducte[codi];
        } else {
            return "?";
        }
    }
    
    public static void assignacioNomProduces(){
        Application.llistaNomProducte[0] = "Chips Casolanes";
        Application.llistaNomProducte[1] = "Xocolata amb Ametlles";
        Application.llistaNomProducte[2] = "Coca-Cola";
        Application.llistaNomProducte[3] = "Aigua 50ml";
        Application.llistaNomProducte[4] = "ColaCao ml";
        Application.llistaNomProducte[5] = "Galetes Veganes";
        Application.llistaNomProducte[6] = "Sanwitch de Pavo";
        Application.llistaNomProducte[7] = "Filipinos";
        Application.llistaNomProducte[8] = "Magdalena";
        Application.llistaNomProducte[9] = "Palmera";
    }
    public static void assignacioPreuProductes(){
        Application.llistaPreuProducte[0] = 1.50;
        Application.llistaPreuProducte[1] = 1;
        Application.llistaPreuProducte[2] = 2;
        Application.llistaPreuProducte[3] = 0.75;
        Application.llistaPreuProducte[4] = 1.85;
        Application.llistaPreuProducte[5] = 1.55;
        Application.llistaPreuProducte[6] = 2.50;
        Application.llistaPreuProducte[7] = 1;
        Application.llistaPreuProducte[8] = 1.10;
        Application.llistaPreuProducte[9] = 1.25;
    }
    public static void assignacioStockProductes(){
        Application.llistaStockProducte[0] = 20;
        Application.llistaStockProducte[1] = 12;
        Application.llistaStockProducte[2] = 20;
        Application.llistaStockProducte[3] = 07;
        Application.llistaStockProducte[4] = 18;
        Application.llistaStockProducte[5] = 15;
        Application.llistaStockProducte[6] = 5;
        Application.llistaStockProducte[7] = 1;
        Application.llistaStockProducte[8] = 11;
        Application.llistaStockProducte[9] = 12;
    }
}