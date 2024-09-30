import javax.swing.*;
import java.util.Scanner;

import static javax.swing.JOptionPane.showInputDialog;

public class Oppgave1 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Skriv inn navnet: ");
//        String navn = scanner.nextLine();
//
//        System.out.println("Skriv inn alder: ");
//        int alder = scanner.nextInt();
//
//        int dagensår = 2024;
//
//        int fødselsår = dagensår - alder;
//
//        int pensjonist = fødselsår + 67;
//
//        System.out.println(navn + " er i dag " + alder + " år gammel. Han/hun er født i "
//                + fødselsår + " I " + pensjonist + " er han/hun 67 år og da han/hun være pensjonist.");

        String navn = showInputDialog("Skriv inn navnet:");
        String innAlder = showInputDialog("Skriv inn alderen:");
        int alder = Integer.parseInt(innAlder);
        int fødselsår = 2024-alder;
        int pensjonsår = fødselsår + 67;
        System.out.println(navn + " er i dag " + alder + " år." +
                " Han er født i " + fødselsår + " I " + pensjonsår
        + " er han 67 år og da vil han være pensjonist.");



    }
}
