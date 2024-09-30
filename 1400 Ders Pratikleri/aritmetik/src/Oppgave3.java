import java.util.Scanner;

import static javax.swing.JOptionPane.showInputDialog;

public class Oppgave3 {
    public static void main(String[] args) {
//        "Lag et program som regner ut arealet av et rektangel. " +
//        "Programmet skal lese inn lengden og bredden på rektangelet.  " +
//        "Regn så ut  arealet og skriver ut svaret på følgende måte: " +
//       "”Et rektangel med bredde 20.0 cm og lengde 40.0 cm har et areal på 800.0 cm^2”."

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Skriv inn rektangels lengden i cm: ");
//        double lengde = scanner.nextDouble();
//
//        System.out.println("Skriv inn rektangels bredden i cm: ");
//        double bredde = scanner.nextDouble();
//
//        double areal = bredde * lengde;
//
//        System.out.println("Et rektangel med " + bredde + " cm bredde og " + lengde + " cm lengde har et areal på " + areal + "cm^2");

String innLengde = showInputDialog("Skriv inn lengden: ");
String innBredde = showInputDialog("Skriv inn bredden");
double lengde = Double.parseDouble(innLengde);
double bredde = Double.parseDouble(innBredde);
double areal = lengde*bredde;
        System.out.println("Et rektangel med " + bredde + " cm bredde og " + lengde + " cm lengde har et areal på " + areal + "cm^2");

   }
}
