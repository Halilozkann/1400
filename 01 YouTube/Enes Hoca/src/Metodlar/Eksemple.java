package Metodlar;

import java.util.Scanner;

public class Eksemple {
    public static void main(String[] args){

        System.out.println("Tek Cift Bulma");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin Eleman Sayisini Giriniz: ");
        int diziUzunluk = scanner.nextInt();

        int[] sayilar = new int[diziUzunluk];

        for(int i=0 ; i < diziUzunluk ; i++){
            System.out.println("Dizinin " + i + ". index degerini giriniz: ");
            sayilar[i] = scanner.nextInt();
            scanner.nextLine();
        }
        for (int i = 0; i < sayilar.length; i++) {
            tekMiCiftMi(sayilar[i]);
        }
    }
    public static void tekMiCiftMi(int sayi)
    {
        if(sayi%2==0)
        {
            System.out.println("sayi: " + sayi + " Cifttir.");
        }
        else{
            System.out.println("sayi: " + sayi + " Tektir.");
        }
    }
}
