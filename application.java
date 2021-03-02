import java.util.Scanner;
public class application{
    public void impressio(){

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Sisplau introdueix el codi del producte: ");
        int codi = 0;

        do{
            codi=sc.nextInt();

            if(codi==99){ //manteniment
                //manteniment.manteniment;
                System.out.println("Manteniment");
            }else{//
                if(Stock.nomProducte(codi)){
                    Diners.diners(codi);
                }else{
                    System.out.println("*********************ERROR*********************");
                    System.out.println("El producte solicitat no te Stock, sisplau introdueix un nou altre producte.");
                    codi = 10;
                }
            }
        }while(codi!=99 || (codi<0 && codi>9));
    }
}


/**
 * @author 
 */