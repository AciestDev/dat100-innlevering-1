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
// Istedenfor å skrive 5 variabler A, B, C, osv legger jeg de inn i en array for mer oversikt
        double [] prosent = {1.7, 4.0, 13.7, 16.7, 17.7};
        double [] intekt = {217401, 306051, 697151, 942401, 1410751};
        double skatt = 0;

// Primative kode med før beregnet intekt per trinn fra øverst til minst
        double [] intektPTrinn = {78214.45, 33599.25, 15644, 1507.05};
// Input code
        Scanner in = new Scanner(System.in);
        System.out.print("Hva er bruttolønnen: ");
        double bruttoLonn = in.nextDouble();

// Calculating the tax
        if  (bruttoLonn < intekt[0] && bruttoLonn > 0) {
            System.out.println("Du betaler ingen trinnskatt! ");

        } else if (bruttoLonn >= intekt[4]) {
            bruttoLonn = bruttoLonn - intekt[4];
            skatt = bruttoLonn * (prosent[4] / 100);
            skatt = skatt + intektPTrinn[0];
            skatt = skatt + intektPTrinn[1];
            skatt = skatt + intektPTrinn[2];
            skatt = skatt + intektPTrinn[3];
            skatt = Math.round(skatt);
            System.out.println("Du betaler: " + skatt +"kr i skatt");
        } else if (bruttoLonn >= intekt[3]) {
            bruttoLonn = bruttoLonn - intekt[3];
            skatt = bruttoLonn * (prosent[3] / 100);
            skatt = skatt + intektPTrinn[1];
            skatt = skatt + intektPTrinn[2];
            skatt = skatt + intektPTrinn[3];
            skatt = Math.round(skatt);
            System.out.println("Du betaler: " + skatt +"kr i skatt");
        } else if (bruttoLonn >= intekt[2]) {
            bruttoLonn = bruttoLonn - intekt[2];
            skatt = bruttoLonn * (prosent[2] / 100);
            skatt = skatt + intektPTrinn[2];
            skatt = skatt + intektPTrinn[3];
            skatt = Math.round(skatt);
            System.out.println("Du betaler: " + skatt +"kr i skatt");
        } else if (bruttoLonn >= intekt[1]) {
            bruttoLonn = bruttoLonn - intekt[1];
            skatt = bruttoLonn * (prosent[1] / 100);
            skatt = skatt + intektPTrinn[3];
            skatt = Math.round(skatt);
            System.out.println("Du betaler: " + skatt +"kr i skatt");
        } else if (bruttoLonn >= intekt[0]) {
            bruttoLonn = bruttoLonn - intekt[0];
            skatt = bruttoLonn * (prosent[0] / 100);
            skatt = Math.round(skatt);
            System.out.println("Du betaler: " + skatt +"kr i skatt");
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
