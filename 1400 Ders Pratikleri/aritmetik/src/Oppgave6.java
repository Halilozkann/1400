import java.util.Scanner;

public class Oppgave6 {
    public static void main(String[] args) {
        //Lag et program som leser inn et beløp i amerikanske dollar (USD) og
        // regner om og skriver ut tilsvarende beløp
        // i norske kroner. Benytt dagens valutakurs fra nettet.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv inn Amerikanske dollar: ");
        double usd = scanner.nextDouble();

        double dagensValuta = 10.6;

        double valuta = Math.round(usd*dagensValuta);

        System.out.println(usd + " USD tilsvarer " + valuta + " Norske Kroner i dagens valuta.");
    }
}
