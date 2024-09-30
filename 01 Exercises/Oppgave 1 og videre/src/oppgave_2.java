import javax.swing.*;

public class oppgave_2 {
    public static void main(String[] args) {


        String fornavn = JOptionPane.showInputDialog("Skriv inn fornavnet");
        String etternavn = JOptionPane.showInputDialog("Skriv inn etternavnet");

        String fultnavn = fornavn +" "+ etternavn;
        JOptionPane.showMessageDialog(null, "Dette er ditt fultnavn: " + fultnavn);

        String alder = JOptionPane.showInputDialog("Hvor gammel er du?");
        JOptionPane.showMessageDialog(null,"Alderen til " + fultnavn + " er " + alder + "år.");




    }
}