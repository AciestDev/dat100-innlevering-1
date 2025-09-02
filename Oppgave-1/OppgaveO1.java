// Informasjon funnet: www.skatteetaten.no/satser/trinnskatt/?year=2025#rateShowYear
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class OppgaveO1 {

//Boolean verdi som velger koden fra gjennomgått stoff + simplifisert eller improvisert kode på bunn    
    private static final boolean ORIGINAL_QUESTION1 = true;
    public static void main(String[] args) {
        if (ORIGINAL_QUESTION1) {
            mainOriginal(args);
        } else {
            mainImproved(args);
        }
    }

// "Simplifisert" kode med else if statments istedenfor     
    public static void mainOriginal(String[] args) {

// Alle varablene som er nødvendig for denne koden
        int switchChooser = 0;
        // Istedenfor å skrive 5 variabler A, B, C, osv legger jeg de inn i en array for å holde bedre kontroll på de
        double [] prosent = {1.7, 4.0, 13.7, 16.7, 17.7};
        double [] intekt = {217401, 306051, 697151, 942401, 1410751};
        double Skatt = 0;
        double trinn1FaktorProsent = prosent[0] / 100;
        double trinn2FaktorProsent = prosent[1] / 100;
        double trinn3FaktorProsent = prosent[2] / 100;
        double trinn4FaktorProsent = prosent[3] / 100;
        double trinn5FaktorProsent = prosent[4] / 100;
        double [] faktorProsent = {trinn1FaktorProsent, trinn2FaktorProsent, trinn3FaktorProsent, trinn4FaktorProsent, trinn5FaktorProsent};
// Input code
        Scanner in = new Scanner(System.in);
        System.out.print("Hva er bruttolønnen: ");
        double bruttoLonn = in.nextDouble();

// Calculating the tax
        if  (bruttoLonn < intekt[0] && bruttoLonn > 0) {
            switchChooser = 1;

        } else if (bruttoLonn >= intekt[0] && bruttoLonn < intekt[1]) {
            Skatt = bruttoLonn * faktorProsent[0];
            Skatt = Math.round(Skatt);
            switchChooser = 2;

        } else if (bruttoLonn >= intekt[1] && bruttoLonn < intekt[2]) {
            Skatt = bruttoLonn * faktorProsent[1];
            Skatt = Math.round(Skatt);
            switchChooser = 3;
        } else if (bruttoLonn >= intekt[2] && bruttoLonn < intekt[3]) {
            Skatt = bruttoLonn * faktorProsent[2];
            Skatt = Math.round(Skatt);
            switchChooser = 4;
        } else if(bruttoLonn >= intekt[3] && bruttoLonn < intekt[4]) {
            Skatt = bruttoLonn * faktorProsent[3];
            Skatt = Math.round(Skatt);
            switchChooser = 5;
        } else if (bruttoLonn >= intekt[4]) {
            Skatt = bruttoLonn * faktorProsent[4];
            Skatt = Math.round(Skatt);
            switchChooser = 6;
        } else {
            System.out.println("Det er ikke valid svar");
        }

// Printing how much
        switch(switchChooser) {
            case 1:
                System.out.println("Du betaler ingen trinnskatt! ");
                break;
            case 2:
                System.out.println("Du betaler " + prosent[0] + "% trinnskatt som utgjør: " + Skatt +"kr");
                break;
            case 3:
                System.out.println("Du betaler " + prosent[1] + "% trinnskatt som utgjør: " + Skatt + "kr");
                break;
            case 4:
                System.out.println("Du betaler " + prosent[2] + "% trinnskatt som utgjør: " + Skatt + "kr");
                break;
            case 5:
                System.out.println("Du betaler " + prosent[3] + "% trinnskatt som utgjør: " + Skatt + "kr");
                break;
            case 6:
                System.out.println("Du betaler " + prosent[4] + "% trinnskatt som utgjør: " + Skatt + "kr");
                break;   
        }
        in.close();
    } 
    
// Improved code, this will be in english as is standard practice for future jobs    
    public static void mainImproved(String[] args) {
// Every variable required for this code
        double[] percent = {1.7, 4.0, 13.7, 16.7, 17.7};
        ArrayList<Double> bracketThresholdsL = new ArrayList<Double>();
        Double[] bracketThresholds = new Double[] {217401.0, 306051.0, 697151.0, 942401.0, 1410751.0};
        bracketThresholdsL.addAll(Arrays.asList(bracketThresholds));
        double tax = 0.0;

// Input code
        Scanner in = new Scanner(System.in);
        System.out.print("What is the gross income: ");
        double grossIncome = in.nextDouble();

// Calculates tax and prints        
        for (int i = 0; i < bracketThresholdsL.size(); i++) {
            if (grossIncome < bracketThresholdsL.get(0)) {
                System.out.println("You don't have to pay tax! ");
                i = bracketThresholdsL.size();
            } else if(grossIncome >= bracketThresholdsL.get(4)) {
                grossIncome = grossIncome - bracketThresholdsL.get(4);
                tax = (percent[4] / 100) * grossIncome;
                tax = Math.round(tax);
                System.out.println("Your tax is: " + tax);
                i = bracketThresholdsL.size();
            } else if (grossIncome >= bracketThresholdsL.get(i) && grossIncome < bracketThresholdsL.get(i+1) && grossIncome > bracketThresholdsL.get(0) && grossIncome < bracketThresholdsL.get(4)) {
                grossIncome = grossIncome - bracketThresholdsL.get(i);
                tax = (percent[i] / 100) * grossIncome;
                tax = Math.round(tax);
                System.out.println("Your tax is: " + tax);
                i = bracketThresholdsL.size();

            } 
        }    
        in.close();
    }
}