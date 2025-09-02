//Oppgave 2A
import java.util.Scanner;
public class OppgaveO2C {

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

            if (poengsum > 100) {
                System.out.println("Det er ikke gyldig tall");
                i--;
            } else if (poengsum >= 90) {
                System.out.println("Karakteren studenten får er: " + karakterer[0]);
            } else if (poengsum >= 80) {
                System.out.println("Karakteren studenten får er: " + karakterer[1]);
            } else if (poengsum >= 60) {
                System.out.println("Karakteren studenten får er: " + karakterer[2]);
            } else if (poengsum >= 50) {
                System.out.println("Karakteren studenten får er: " + karakterer[3]);
            } else if (poengsum >= 40) {
                System.out.println("Karakteren studenten får er: " + karakterer[4]);
            } else if (poengsum >= 0) {
                System.out.println("Karakteren studenten får er: " + karakterer[5]);
            }
        }
        in.close();
    }
    
// Improved code, this will be in english as is standard practice for future jobs    
    public static void mainImproved(String [] args) {

        Scanner in = new Scanner(System.in);
        int students = 10;
        while (students > 10) {
// All variables that are required for this code to function
            char grade [] = {'A', 'B', 'C', 'D', 'E', 'F'};
            int gradeThreshold [] = {100, 90, 80, 60, 50, 40, 0};

// Input code
            System.out.print("What is the point sum of the student? ");
            int pointSum = in.nextInt();        

// As there is 6 possible grades. 
// This for loop checks 6 times to see if pointSum matches with "i" gradeThreshold 
            for (int i = 0; i <= 6; i++) {
            if (pointSum >= gradeThreshold[i]) {
                System.out.print("The grade you have recieved is: " + grade[i]);
                i = 7;
                students ++;
            }
            }
        }

        in.close();
    }
}