public class Moneder {
    /**
     * Posició 0: Monedes de 2,00€
     * Posició 1: Monedes de 1,00€
     * Posició 2: Monedes de 0,50€
     * Posició 3: Monedes de 0,20€
     * Posició 4: Monedes de 0,10€
     * Posició 5: Monedes de 0,05€
     * */
    public static int[] StockMonedes = {18,23,20,15,18,15};


    public static String comMonedesStock(double cambi, int StockMonedes[]){
        int tornar = (int) (cambio * 100);

        System.out.println("El cambi és "  + cambio + " monedes a tornar");

        if (tornar >= 200) {
            StockMonedes[0] = StockMonedes[0] - (tornar / 200);
            System.out.println("Monedes de 2 euros: " + tornar/ 200);
            tornar%= 200;            
        }
         if (tornar >= 100) {
             StockMonedes[1] = StockMonedes[1] - (tornar / 200);
            System.out.println("Monedes de 1 euro:" + tornar/ 100);
            tornar %= 100;
        }
        if (tornar>= 50) {
            StockMonedes[2] = StockMonedes[2] - (tornar / 200);
            System.out.println("Monedes de 50 centims:" + tornar/ 50);
            tornar%= 50;
        }
        if (tornar>= 20) {
            StockMonedes[3] = StockMonedes[3] - (tornar / 200);
            System.out.println("Monedes de 20 centims" + tornar/ 20);
            tornar%= 20;
        }
        if (tornar>= 10) {
            StockMonedes[4] = StockMonedes[4] - (tornar / 200);
            System.out.println("Monedes de 10 centims:" + tornar/ 10);
            tornar%= 10;
        }
        if (tornar>= 5) {
            StockMonedes[5] = StockMonedes[5] - (tornar/ 200);
            System.out.println("Monedes de 5 centims:" + tornar/ 5);
            tornar%= 5;
        }
    }}

