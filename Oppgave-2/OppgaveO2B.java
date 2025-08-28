import java.util.Scanner;

public class OppgaveO2B {
    public static void main(String[] args) {
        int poengsum = 0;
        char karakterer [] = {'A', 'B', 'C', 'D', 'E', 'F'};

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

    }
}
