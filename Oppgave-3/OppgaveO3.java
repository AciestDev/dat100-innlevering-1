import java.util.Scanner;

public class OppgaveO3 {
    public static void main(String[] args) {

        int n = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Skriv et heltall som er større enn 0: ");
        n = in.nextInt();
        int nFak = n;

        while (n > 1) {
            n--;
            nFak = nFak * n;
        }
        System.out.println("n! Er lik: " + nFak);

        in.close();
    }
}
