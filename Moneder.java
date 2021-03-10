public class Moneder {
    /**
     * Posició 0: Monedes de 2,00€
     * Posició 1: Monedes de 1,00€
     * Posició 2: Monedes de 0,50€
     * Posició 3: Monedes de 0,20€
     * Posició 4: Monedes de 0,10€
     * Posició 5: Monedes de 0,05€
     * */

//GUARDAR EN UNA VARIABLE LES MONEDES PER POSTERIORMENT MOSTRARLES AL MAIN
    public static String comMonedesStock(double canvi, int StockMonedes[]){
        int tornar = (int) (canvi * 100);

        System.out.println("El cambi és "  + canvi + " monedes a tornar");

        //Comprobador de 2 euros
        if (tornar >= 200) {
            StockMonedes[0] = StockMonedes[0] - (tornar / 200);
            System.out.println("Monedes de 2 euros: " + tornar/ 200);
            tornar%= 200;            
        }
        //Comprobador de 1 euro
         if (tornar >= 100) {
             StockMonedes[1] = StockMonedes[1] - (tornar / 200);
            System.out.println("Monedes de 1 euro:" + tornar/ 100);
            tornar %= 100;
        }
        //Comprobador de 50 centims
        if (tornar>= 50) {
            StockMonedes[2] = StockMonedes[2] - (tornar / 200);
            System.out.println("Monedes de 50 centims:" + tornar/ 50);
            tornar%= 50;
        }
        //Comprobador de 20 centims
        if (tornar>= 20) {
            StockMonedes[3] = StockMonedes[3] - (tornar / 200);
            System.out.println("Monedes de 20 centims" + tornar/ 20);
            tornar%= 20;
        }
        //Comprobador de 10 centims
        if (tornar>= 10) {
            StockMonedes[4] = StockMonedes[4] - (tornar / 200);
            System.out.println("Monedes de 10 centims:" + tornar/ 10);
            tornar%= 10;
        }
        //Comprobador de 5 centims
        if (tornar>= 5) {
            StockMonedes[5] = StockMonedes[5] - (tornar/ 200);
            System.out.println("Monedes de 5 centims:" + tornar/ 5);
            tornar%= 5;
        }
    }}

