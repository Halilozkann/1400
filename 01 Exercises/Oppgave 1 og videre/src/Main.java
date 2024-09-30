import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        String fornavn = JOptionPane.showInputDialog("Skriv inn fornavnet");
        String etternavn = JOptionPane.showInputDialog("Skriv inn etternavnet");

        String fultnavn = fornavn +" "+ etternavn;
        JOptionPane.showMessageDialog(null, "Dette er ditt fultnavn: " + fultnavn);

    }
}