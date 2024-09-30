import javax.swing.*;

public class oppgave_3 {
    public static void main(String[] args) {


        String fornavn = JOptionPane.showInputDialog("Skriv inn fornavnet");
        String etternavn = JOptionPane.showInputDialog("Skriv inn etternavnet");

        String fultnavn = fornavn +" "+ etternavn;
        JOptionPane.showMessageDialog(null, "Dette er ditt fultnavn: " + fultnavn);

        String alder = JOptionPane.showInputDialog("Hvor gammel er du?");
        JOptionPane.showMessageDialog(null,"Alderen til " + fultnavn + " er " + alder + "år.");

        String adresse = JOptionPane.showInputDialog("skriv inn adressen");
        String poststed = JOptionPane.showInputDialog("Skriv inn poststedet");
        String postnr = JOptionPane.showInputDialog("Skriv inn postnummeret");
        JOptionPane.showMessageDialog(null,fultnavn +
                " bor i " + adresse + " som har postnummer " + postnr + " i " + poststed +
                ". " + fornavn + "’s alder er " + alder + " år.");




    }
}