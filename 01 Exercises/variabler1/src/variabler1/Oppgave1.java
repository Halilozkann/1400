package variabler1;
import static javax.swing.JOptionPane.*;

public class Oppgave1 {
    public static void main(String[] args){

        String fornavn = showInputDialog("Skriv inn fornavn:");
        String etternavn = showInputDialog("Skriv inn etternavn:");
        String navn = fornavn + " " + etternavn;
        showMessageDialog(null,navn);



    }
}
