import java.util.Scanner;

import static javax.swing.JOptionPane.showInputDialog;

public class Oppgave4 {
    public static void main(String[] args) {

        // Lag et program som regner ut omkretsen til en sirkel Les først inn radiusen.
        // Regn så ut  omkretsen av sirkelen (2*3.14*radius) og skriver ut svaret på følgende måte:
        // ”Omkretsen av en sirkel med 20.0 cm som radius blir 125.60 cm.”
//        Scanner scanner = new Scanner(System.in);
////
////        System.out.println("Skriv inn radiusen: ");
////        double radius = scanner.nextDouble();
////
////        double omkretsen = 2 * radius * 2.14 ;
////
////        System.out.println("Omkretsen av en sirkel med " + radius + " som radius blir " + omkretsen + " cm.");

String innRadius = showInputDialog("Skriv inn radiusen");
double radius = Double.parseDouble(innRadius);
double omkrets = 2 * 3.14 * radius;
        String omkretsenMedToDesimaler = String.format("%.2f",omkrets);
System.out.println("Omkretsen av en sirkel med " + radius + " som radius blir " + omkretsenMedToDesimaler + " cm.");
 }
}
