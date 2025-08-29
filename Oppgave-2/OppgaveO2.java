import java.util.Scanner;
public class OppgaveO2 {
    private static final boolean ORIGINAL_QUESTION2 = true;

    public static void main(String [] args) {
        if (ORIGINAL_QUESTION2) {
            mainOriginal(args);
        } else {
            mainImproved(args);
        }
    }

    public static void mainOriginal(String [] args) {

        int poengsum = 0;
        char karakterer [] = {'A', 'B', 'C', 'D', 'E', 'F'};

        Scanner in = new Scanner(System.in);
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
        in.close();
    }

    public static void mainImproved(String [] args) {
        //improved code
        char grade [] = {'A', 'B', 'C', 'D', 'E', 'F'};
        int gradeThreshold [] = {100, 90, 80, 60, 50, 40, 0};

        Scanner in = new Scanner(System.in);
        System.out.print("Hva er poengsummen til studenten? ");
        int pointSum = in.nextInt();

        for (int i = 0; i <= 6; i++) {
            if ((pointSum < gradeThreshold[i]) && pointSum >= gradeThreshold[i+1]) {
                System.out.print("The grade you have recieved is: " + grade[i]);
            } else if (pointSum == 100) {
                System.out.print("The grade you have recieved is: " + grade[i]);
                i = 7;
            } else if (pointSum > 100 || pointSum < 0) {
                System.out.print("test1");
                i = 7;
            }
        }
        if (pointSum > 100 || pointSum < 0) {
            System.out.print("test2");
        }
    }
}
