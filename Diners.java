import java.util.Scanner;

public class Diners{


    public static int diners(int codi){
        
        /**
         * 
         * @method Impressio de pantalla del preu del producte i solicita el preu que vol introduir el client
         */

        Scanner lector = new Scanner(System.in);


        int diners = 0;

        double EurosAmbCent = 0;

        System.out.print("El preu del producte es" + Stock.ComprovacioPreuProducte(int codi)); //Impressio de el preu del producte seleccionat

        System.out.print("Nomes acceptem les monedes següents"); //Imprimim les uniques monedes que acceptem per que es pugui seleccionar un dels nostres productes
        System.out.println("Posició 0: Moneda de 2,00€");
        System.out.println("Posició 1: Moneda de 1,00€");
        System.out.println("Posició 2: Moneda de 0,50€");
        System.out.println("Posició 3: Moneda de 0,20€");
        System.out.println("Posició 4: Moneda de 0,10€");
        System.out.println("Posició 5: Moneda de 0,05€");

        System.out.print("Introdueix el numero de monedes que vol gastar?");
        diners = lector.nextInt(); //Preguntem al usuari per quantes monedes vol gastar, aixi obtindrem el limit de monedes que introduïra el nostre usuari

        double[] IndexMonedes = new double[6]; //Assignem les dades del array manualment per despres identificar el tipus de moneda

            IndexMonedes[0] = 2,00;
            IndexMonedes[1] = 1,00;
            IndexMonedes[2] = 0,50;
            IndexMonedes[3] = 0,20;
            IndexMonedes[4] = 0,10;
            IndexMonedes[5] = 0,05;


            int[] MonedesEntrades = new int[diners];

        //Creem un for per poder recollir la informacio de les monedes que introdueix el nostre usuari
        for(int i = 0; i < MonedesEntrades.length; i++){

                System.out.println("Selecciona les monedes que desitjes entrar a la maquina(0-5): ");
                 MonedesEntrades[i] = lector.nextDouble(); //

                switch (MonedesEntrades) { //Creacio de un switch per poder diferenciar les diferentes opcions entrades del usuari amb el index de Monedes i despres assiganr 

                    case 0:

                        EurosAmbCent + IndexMonedes[0]; 

                        break;

                    case 1:
                        EurosAmbCent + IndexMonedes[1];
                        break;

                    case 2:
                        EurosAmbCent + IndexMonedes[2];
                        break;

                    case 3:
                        EurosAmbCent + IndexMonedes[3];
                        break;

                    case 4:
                        EurosAmbCent + IndexMonedes[4];
                        break;

                    case 5:
                        EurosAmbCent + IndexMonedes[5];

                    default:

                        break;
                }


            }

        }


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
