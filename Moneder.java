public class Moneder {
    /**
     * Posició 0: Monedes de 2,00€
     * Posició 1: Monedes de 1,00€
     * Posició 2: Monedes de 0,50€
     * Posició 3: Monedes de 0,20€
     * Posició 4: Monedes de 0,10€
     * Posició 5: Monedes de 0,05€
     * */
    public static int[] llistaStockMonedesProvisional =  Application.llistaStockMonedes;

    public static boolean comMonedesStock(double canvi){
        int tornar = (int) (canvi * 100);

        System.out.println("El canvi és "  + canvi + " monedes a tornar");

        //Comprobador de 2 euros
        if (tornar >= 200) {
            llistaStockMonedesProvisional[0] = llistaStockMonedesProvisional[0] - (tornar / 200);
            System.out.println("Monedes de 2 euros: " + tornar/ 200);
            tornar%= 200;            
        }
        //Comprobador de 1 euro
         if (tornar >= 100) {
            llistaStockMonedesProvisional[1] = llistaStockMonedesProvisional[1] - (tornar / 200);
            System.out.println("Monedes de 1 euro:" + tornar/ 100);
            tornar %= 100;
        }
        //Comprobador de 50 centims
        if (tornar>= 50) {
            llistaStockMonedesProvisional[2] = llistaStockMonedesProvisional[2] - (tornar / 200);
            System.out.println("Monedes de 50 centims:" + tornar/ 50);
            tornar%= 50;
        }
        //Comprobador de 20 centims
        if (tornar>= 20) {
            llistaStockMonedesProvisional[3] = llistaStockMonedesProvisional[3] - (tornar / 200);
            System.out.println("Monedes de 20 centims" + tornar/ 20);
            tornar%= 20;
        }
        //Comprobador de 10 centims
        if (tornar>= 10) {
            llistaStockMonedesProvisional[4] = llistaStockMonedesProvisional[4] - (tornar / 200);
            System.out.println("Monedes de 10 centims:" + tornar/ 10);
            tornar%= 10;
        }
        //Comprobador de 5 centims
        if (tornar>= 5) {
            llistaStockMonedesProvisional[5] = llistaStockMonedesProvisional[5] - (tornar/ 200);
            System.out.println("Monedes de 5 centims:" + tornar/ 5);
            tornar%= 5;
        }
        for(int i=0; i<Constants.NUM_MONEDES_ACCEPTADES;i++){
            System.out.println("Verdader:" + i);
            System.out.println(Application.llistaStockMonedes[i]);
        }
        return comptadorMonedes();
    }
    
    public static boolean comptadorMonedes(){
        for(int i=0;i<Constants.NUM_MONEDES_ACCEPTADES;i++){
            if(llistaStockMonedesProvisional[i]<0){//En cas de tenir monedes negatives vol dir que no tenim canvi a donar
                llistaStockMonedesProvisional[i]=Application.llistaStockMonedes[i]; //Per tant tornem als valors origianls i retornem FALSE
                return false;
            }
        }
        System.out.println("AAAAAAAAAAAA");
        Application.llistaStockMonedes=llistaStockMonedesProvisional;//Si tenim canvi doncs assignem el nou estoc de monedes i retornem TRUE
        return true;
    }
}

