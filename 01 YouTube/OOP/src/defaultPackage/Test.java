package defaultPackage;

import com.halilozkan.Ogrenci;

public class Test {
    public static void main(String[] args) {

        Ogrenci ogrenci1 = new Ogrenci(7 , "Ali" , "Su");

//        ogrenci1.id = 5;
//        ogrenci1.isim = "Ali";
//        ogrenci1.soyisim = "Su";

        System.out.println("Ogrenci Bilgileri");
        System.out.println("ID " + ogrenci1.id + " Isim " + ogrenci1.isim +
                " Soyisim " + ogrenci1.soyisim);
    }
}
