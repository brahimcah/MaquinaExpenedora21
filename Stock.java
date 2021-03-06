public class Stock {
    
     public static String comprovacioStock(int codi){
        
        if(Application.llistaStockProducte[codi] > 0 ){
             return Application.llistaNomProducte[codi];
        } else {
            return "?";
        }
    }
    
    public static void assignacioNomProductes(){
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
    public static void assignacioStockMonedes(){
        /**
         * Posició 0: Monedes de 2,00€
         * Posició 1: Monedes de 1,00€
         * Posició 2: Monedes de 0,50€
         * Posició 3: Monedes de 0,20€
         * Posició 4: Monedes de 0,10€
         * Posició 5: Monedes de 0,05€
         * */
        Application.llistaStockMonedes[0] = 18;
        Application.llistaStockMonedes[1] = 23;
        Application.llistaStockMonedes[2] = 20;
        Application.llistaStockMonedes[3] = 15;
        Application.llistaStockMonedes[4] = 18;
        Application.llistaStockMonedes[5] = 15;
    }
    //Assignació d'estoc del array de monedes provisional
    public static void assignacioStockMonedesProvisionals(){
        /**
         * Posició 0: Monedes de 2,00€
         * Posició 1: Monedes de 1,00€
         * Posició 2: Monedes de 0,50€
         * Posició 3: Monedes de 0,20€
         * Posició 4: Monedes de 0,10€
         * Posició 5: Monedes de 0,05€
         * */
        Moneder.llistaStockMonedesProvisional[0] = Application.llistaStockMonedes[0];
        Moneder.llistaStockMonedesProvisional[1] = Application.llistaStockMonedes[1];
        Moneder.llistaStockMonedesProvisional[2] = Application.llistaStockMonedes[2];
        Moneder.llistaStockMonedesProvisional[3] = Application.llistaStockMonedes[3];
        Moneder.llistaStockMonedesProvisional[4] = Application.llistaStockMonedes[4];
        Moneder.llistaStockMonedesProvisional[5] = Application.llistaStockMonedes[5];
    }
    //Funció que assigna la resta de les monedes al array de estoc monedes
    public static void actualitzarStockMonedes(){
        /**
         * Posició 0: Monedes de 2,00€
         * Posició 1: Monedes de 1,00€
         * Posició 2: Monedes de 0,50€
         * Posició 3: Monedes de 0,20€
         * Posició 4: Monedes de 0,10€
         * Posició 5: Monedes de 0,05€
         * */
        Application.llistaStockMonedes[0] = Moneder.llistaStockMonedesProvisional[0];
        Application.llistaStockMonedes[1] = Moneder.llistaStockMonedesProvisional[1];
        Application.llistaStockMonedes[2] = Moneder.llistaStockMonedesProvisional[2];
        Application.llistaStockMonedes[3] = Moneder.llistaStockMonedesProvisional[3];
        Application.llistaStockMonedes[4] = Moneder.llistaStockMonedesProvisional[4];
        Application.llistaStockMonedes[5] = Moneder.llistaStockMonedesProvisional[5];
    }
}