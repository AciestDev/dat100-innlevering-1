//Oppgave 2A
import java.util.Scanner;
public class OppgaveO2B {

//Boolean verdi som velger koden fra gjennomgått stoff + simplifisert eller improvisert kode på bunn     
    private static final boolean ORIGINAL_QUESTION2B = true;
    public static void main(String[] args) {
        if (ORIGINAL_QUESTION2B) {
            mainOriginal(args);
        } else {
            mainImproved(args);
        }
    }
    
// "Simplifisert" kode med else if statments istedenfor    
    public static void mainOriginal(String[] args) {
        int poengsum = 0;
// Istedenfor å skrive 6 variabler A, B, C, osv legger jeg de inn i en array        
        char karakterer [] = {'A', 'B', 'C', 'D', 'E', 'F'};

// Input koden og for løkke for å gi 10 studenter karakterer
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 10;i++) {
            System.out.print("Hva er poengsummen til studenten? ");
            poengsum = in.nextInt();

            if ((poengsum <= 100) && (poengsum >= 90)) {
                System.out.println("Karakteren studenten får er: " + karakterer[0]);
            } else if ((poengsum <= 89) && (poengsum >= 80)) {
                System.out.println("Karakteren studenten får er: " + karakterer[1]);
            } else if ((poengsum <= 79) && (poengsum >= 60)) {
                System.out.println("Karakteren studenten får er: " + karakterer[2]);
            } else if ((poengsum <= 59) && (poengsum >= 50)) {
                System.out.println("Karakteren studenten får er: " + karakterer[3]);
            } else if ((poengsum <= 49) && (poengsum >= 40)) {
                System.out.println("Karakteren studenten får er: " + karakterer[4]);
            } else if ((poengsum <= 39) && (poengsum >= 0)) {
                System.out.println("Karakteren studenten får er: " + karakterer[5]);
            } else {
                System.out.println("Det er ikke gyldig tall");
            }
        }
        in.close();
    }
    
// Improved code, this will be in english as is standard practice for future jobs    
    public static void mainImproved(String [] args) {

        for(int k = 0; k < 10; k++) {
// All variables that are required for this code to function
            char grade [] = {'A', 'B', 'C', 'D', 'E', 'F'};
            int gradeThreshold [] = {100, 90, 80, 60, 50, 40, 0};

// To make sure the user does not type in anything but an integer we use try-catch to tell them what is allowed
            try {
// Input code
            Scanner in = new Scanner(System.in);
            System.out.print("Hva er poengsummen til studenten? ");
            int pointSum = in.nextInt();        

// As there is 6 possible grades. 
// This for loop checks 6 times to see if pointSum matches with "i" gradeThreshold 
            for (int i = 0; i <= 6; i++) {
                if ((pointSum < gradeThreshold[i]) && pointSum >= gradeThreshold[i+1]) {
                    System.out.println("The grade you have recieved is: " + grade[i]);
                } else if (pointSum == 100) {
                    System.out.println("The grade you have recieved is: " + grade[i]);
                    i = 7;
                } else if (pointSum > 100) {
                    System.out.print("That is not a valid number. ");
                    i = 7;
                }
            }

// In the case the user does not type a valid 0-100 this code will play        
            }   catch (Exception e) {
                System.out.print("That is not a valid number. ");
                System.out.print("Try using only positive whole numbers from and with 0 to and with 100");
            }
        }
    }
}
