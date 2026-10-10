import java.util.Scanner;

public class Main {

    public static Angolo creaAngolo(Scanner in) {
        System.out.print("Gradi: ");
        int g = in.nextInt();

        System.out.print("Minuti: ");
        int m = in.nextInt();

        System.out.print("Secondi: ");
        int s = in.nextInt();

        return new Angolo(g, m, s);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci il primo angolo:");
        Angolo a1 = creaAngolo(in);

        System.out.println("Inserisci il secondo angolo:");
        Angolo a2 = creaAngolo(in);

        System.out.print("\nPrimo angolo inserito: ");
        a1.stampa();
        System.out.print("Secondo angolo inserito: ");
        a2.stampa();

        Angolo somma = a1.sommaAngolo(a2);
        System.out.print("\nRisultato Somma: ");
        somma.stampa();

        Angolo differenza = a1.sottraiAngolo(a2);
        System.out.print("Risultato Sottrazione: ");
        differenza.stampa();

        in.close();
    }
}
