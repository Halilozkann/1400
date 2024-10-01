import java.util.Scanner;

public class _38_Dizi_Asal {
    public static void main(String[] args) {

        System.out.println("ASAL SAYI BULMA");
        System.out.println("---------------------------------");

        int asalToplam = 0;
        int asalOlmayanToplam = 0;

        String asalSayilar = "";
        String asalOlmayanSayilar = "";

        boolean asalMi = false;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin eleman sayisini giriniz: ");
        int diziUzunluk = scanner.nextInt();
        scanner.nextLine();

        int[] sayilar = new int [diziUzunluk];

        for ( int i = 0; i<sayilar.length ; i++){
            System.out.print("Dizinin " + i + ". index degerini giriniz: ");
            sayilar[i]=scanner.nextInt();
            scanner.nextLine();
        }
        for(int sayi : sayilar){
            for(int j = 2; j<sayi ; j++){
                if(sayi % j ==0){
                    asalOlmayanToplam += 1;
                    asalOlmayanSayilar += String.valueOf(sayi) + " ";
                    break;
                } else{
                    asalMi = true;
                }
            }
            if (asalMi){
                asalToplam += 1;
                asalSayilar += String.valueOf(sayi) + " ";
                asalMi = false;
            }
        }
        System.out.println("ASAL BILGILERI ");
        System.out.println("Asal Toplam = " + asalToplam +
                "Asal Sayilar = " + asalSayilar);
        System.out.println("***********************************");

        System.out.println("Asal olmayan Bilgileri ");
        System.out.println("Asal olmayan toplam=  " + asalOlmayanToplam + "" +
                "Asal olmayan sayilar =  " + asalOlmayanSayilar);




    }
}
