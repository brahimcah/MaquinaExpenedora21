import java.util.Scanner;

public class Diners{


    public static double diners(int codi){
        
        /**
         * 
         * @method Aquesta funcio te la finalitat de poder coneixer si hem de retornar canvi al nostra client o no
         */

        Scanner lector = new Scanner(System.in);


        int diners = 0;

        double EurosAmbCent = 0;

        System.out.println("El preu del producte es " + Application.llistaPreuProducte[codi]); //Impressio de el preu del producte seleccionat
  
        System.out.println("--------------------------------------------------------------------------------------");

        


        System.out.println("Nomes acceptem les monedes següents"); //Imprimim les uniques monedes que acceptem per que es pugui seleccionar un dels nostres productes
        System.out.println("Posició 0: Moneda de 2,00€");
        System.out.println("Posició 1: Moneda de 1,00€");
        System.out.println("Posició 2: Moneda de 0,50€");
        System.out.println("Posició 3: Moneda de 0,20€");
        System.out.println("Posició 4: Moneda de 0,10€");
        System.out.println("Posició 5: Moneda de 0,05€");

        System.out.println("--------------------------------------------------------------------------------------");

        System.out.print("Quantes monedes vol introduïr? ");
        diners = lector.nextInt(); //Preguntem al usuari per quantes monedes vol gastar, aixi obtindrem el limit de monedes que introduïra el nostre usuari

        lector.nextLine(); //Salt de linea per evitar que les dades surtin fora del array


        double[] IndexMonedes = new double[6]; //Assignem les dades del array manualment per despres identificar el tipus de moneda

            IndexMonedes[0] = 2.00;
            IndexMonedes[1] = 1.00;
            IndexMonedes[2] = 0.50;
            IndexMonedes[3] = 0.20;
            IndexMonedes[4] = 0.10;
            IndexMonedes[5] = 0.05;


            int[] MonedesEntrades = new int[diners]; //Array per guardar les monedes amb valor del usuari

        //Creem un for per poder recollir la informacio de les monedes que introdueix el nostre usuari
        for(int i = 0; i < MonedesEntrades.length; i++){

            
                System.out.println("Selecciona les monedes que desitjes entrar a la maquina(0-5): ");
            

                 MonedesEntrades[i] = lector.nextInt(); //Amb aquest lector oferim al nostre client poder seleccionar un numero de el 0-5 i guardem els numeros entrats en el array MonedesEntrades
                 


                switch (MonedesEntrades[i]) { //Creacio de un switch per poder diferenciar les diferentes opcions entrades del usuari amb el index de Monedes i despres assiganr 

                    case 0: //En el cas de que el usuari entres el numero 0 faria referencia que esta entrant una moneda de 2€

                         EurosAmbCent += IndexMonedes[0]; 

                        break;

                    case 1: //En el cas de que el usuari entres el numero 0 faria referencia que esta entrant una moneda de 1€

                         EurosAmbCent += IndexMonedes[1];

                        break;

                    case 2: //En el cas de que el usuari entres el numero 0 faria referencia que esta entrant una moneda de 0,50€

                         EurosAmbCent += IndexMonedes[2];

                        break;

                    case 3: //En el cas de que el usuari entres el numero 0 faria referencia que esta entrant una moneda de 0,20€

                         EurosAmbCent += IndexMonedes[3];

                        break;

                    case 4: //En el cas de que el usuari entres el numero 0 faria referencia que esta entrant una moneda de 0,10;

                         EurosAmbCent += IndexMonedes[4];

                        break;

                    case 5: //En el cas de que el usuari entres el numero 0 faria referencia que esta entrant una moneda de 0,05€

                         EurosAmbCent += IndexMonedes[5];

                         break;
                    default:

                        System.out.print("ERROR!");

                        break;
                }
            
        }

            

            double canvi = 0;

           //Creem un condicional per poder determinar si hi ha canvi o no  


            if(Moneder.comMonedesStock(canvi)) //En el cas de canvi fara un return de la funcio canvi
            {

                return canvi(EurosAmbCent, codi);

            }else //En el cas de que no h hagi canvi fara un return de -1
            {

                return -1;

            } 

        }

    public static double canvi(double EurosAmbCent, int codi){

        /**
         * @method Amb aquesta funcio podem fer la operacio per poder coneixer la resta de els diners entrats EurosAmbCent(variable double) - Stock.ComprovacioPreuProducte(int codi)
         * 
         */

        double restant = 0;

        restant = EurosAmbCent - Application.llistaPreuProducte[codi];

        return restant;

    }
}
