import javax.swing.*;

public class oppgave_5 {
    public static void main(String[] args) {

        String navn = JOptionPane.showInputDialog("Skriv inn ditt navn");
        String adresse = JOptionPane.showInputDialog("skriv inn adressen");
        String postnr = JOptionPane.showInputDialog("Skriv inn postnummeret");
        String poststed = JOptionPane.showInputDialog("Skriv inn poststedet");
        String alder = JOptionPane.showInputDialog("Hvor gammel er du?");

        System.out.println("Navn : " + navn +"\n" +
                "Adresse : " + adresse + "\n" +
                "Postnummer : " + postnr +"\n" +
                "Poststed : " + poststed +"\n" +
                "Alder : " + alder + " år.");

    }
}
