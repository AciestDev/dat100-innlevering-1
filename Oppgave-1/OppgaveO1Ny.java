// Informasjon funnet: www.skatteetaten.no/satser/trinnskatt/?year=2025#rateShowYear
import java.util.Scanner;
import java.util.Arrays;
public class OppgaveO1Ny {
    public static void main(String[] args) {
// Every variable required for this code
        double[] prosent = {1.7, 4.0, 13.7, 16.7, 17.7};
        double[] intekt = {217401, 306051, 697151, 942401, 1410751};
        double[] faktorProsent = new double[prosent.length];
        double[] Skatt = new double[intekt.length];

        for (int i = 0; i < prosent.length; i++) {
            faktorProsent[i] = prosent[i] / 100;
            System.out.println(faktorProsent[i]);
        }
// Input code
        Scanner in = new Scanner(System.in);
        System.out.print("Hva er bruttolønnen: ");
        double bruttoLonn = in.nextDouble();

        for(int k = 0; k < 1; k++){
            if (bruttoLonn < intekt[k]){
                Skatt[k] = bruttoLonn * faktorProsent[k];
                System.out.println(Skatt[k]);
            }

        }
    }
}
