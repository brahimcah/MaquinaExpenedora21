import java.util.Scanner;

public class Diners{


    public static int diners(int codi){
        
        /**
         * 
         * @method Impressio de pantalla del preu del producte i solicita el preu que vol introduir el client
         */

        Scanner lector = new Scanner(System.in);


        int diners = 0;

        System.out.print("El preu del producte es" + Stock.ComprovacioPreuProducte(int codi)); //Impressio de el preu del producte seleccionat

        System.out.print("Nomes acceptem les monedes següents"); //Imprimim les uniques monedes que acceptem per que es pugui seleccionar un dels nostres productes
        System.out.println("Posició 0: Monedes de 2,00€");
        System.out.println("Posició 1: Monedes de 1,00€");
        System.out.println("Posició 2: Monedes de 0,50€");
        System.out.println("Posició 3: Monedes de 0,20€");
        System.out.println("Posició 4: Monedes de 0,10€");
        System.out.println("Posició 5: Monedes de 0,05€");

        System.out.print("Introdueix el numero de monedes que vol gastar?");
        diners = lector.nextInt(); //Preguntem al usuari per quantes monedes vol gastar

        


        return diners;
    }

    public static int canvi(int preu, int diners){

        /**
         * @method Comprovacio de si hem de tornar canvi al nostre client
         * 
         */


        int restant = 0; 
                
         restant = diners - Stock.ComprovacioPreuProducte(int codi); //  Assignem a la variable creada  la operacio per poder determinar si hem de tornar canvi o no

        return restant;

    }

    public static int moneder(int preu){

        Scanner lector = new Scanner(System.in);

    int dinsMoneder = 0;  //Variable per poder detectar els dieners que hi han dins del moneder 
    int introduirMonedes = 0;  // Variable per si es dones el cas de que ha de introduir diners per poder acabar de pagar el producte
        
    dinsMoneder = canvi(int preu, int diners);

        if(dins < 0)
        {
            System.out.println("Falta pagar" + dinsMoneder(int preu, int diners));

            System.out.println("Introdueix els diners que creguis convenients");
                introduirMonedes = lector.nextInt(); //Solicitem al usuari quantes monedes vol introduir
        }else
        {

        }


        /**
         * @method 
         * 
         */

    




    }

}
