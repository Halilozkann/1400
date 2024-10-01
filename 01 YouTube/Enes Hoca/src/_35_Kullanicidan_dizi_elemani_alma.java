import java.util.Scanner;

public class _35_Kullanicidan_dizi_elemani_alma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dizi kac elemanli olsun: ");
        int diziUzunluk = scanner.nextInt();
        scanner.nextLine();

        String[] isimler = new String[diziUzunluk];

        for(int i =0 ; i<isimler.length ; i++){
            System.out.print("Dizinin " + (i) + ". index degerini giriniz: ");
            isimler[i] = scanner.nextLine();
        }
        System.out.println("''''''''''''''''''''''Dizinin Elemanlari'''''''''''''''''''''''");
        for(int i =0 ; i<isimler.length ; i++){
            System.out.println(isimler[i]);
        }






















    }
}
