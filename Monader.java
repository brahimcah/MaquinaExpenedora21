public class monader {
    /**
     * Posició 0: Monedes de 2,00€
     * Posició 1: Monedes de 1,00€
     * Posició 2: Monedes de 0,50€
     * Posició 3: Monedes de 0,20€
     * Posició 4: Monedes de 0,10€
     * Posició 5: Monedes de 0,05€
     * */
    public static int[] StockMonedes = {18,23,20,15,18,15};

    public static String comMonedesStock(int codi, int StockMonedes[]){
        double cambio = 1.65;
        int devolver = (int) (cambio * 100);

        System.out.println("El cambi és "  + cambio + " monedes a tornar");
        // para cada moneda
        if (devolver >= 200) {
            StockMonedes[0] = StockMonedes[0] - (devolver / 200);
            System.out.println("Monedes de 2 euros: " + devolver / 200);
            devolver %= 200;            
        }
         if (devolver >= 100) {
             StockMonedes[1] = StockMonedes[1] - (devolver / 200);
            System.out.println("Monedes de 1 euro:" + devolver / 100);
            devolver %= 100;
        }
        if (devolver >= 50) {
            StockMonedes[2] = StockMonedes[2] - (devolver / 200);
            System.out.println("Monedes de 50 centims:" + devolver / 50);
            devolver %= 50;
        }
        if (devolver >= 20) {
            StockMonedes[3] = StockMonedes[3] - (devolver / 200);
            System.out.println("Monedes de 20 centims" + devolver / 20);
            devolver %= 20;
        }
        if (devolver >= 10) {
            StockMonedes[4] = StockMonedes[4] - (devolver / 200);
            System.out.println("Monedes de 10 centims:" + devolver / 10);
            devolver %= 10;
        }
        if (devolver >= 5) {
            StockMonedes[5] = StockMonedes[5] - (devolver / 200);
            System.out.println("Monedes de 5 centims:" + devolver / 5);
            devolver %= 5;
        }
    }}