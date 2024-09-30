public class Adres {

   private String Cadde;
   private String blok;
   private String no;
   private String sehir;
   private String ulke;
    static String qq;

    public Adres() {
    }

    public Adres(String cadde, String blok, String no, String sehir, String ulke) {
        Cadde = cadde;
        this.blok = blok;
        this.no = no;
        this.sehir = sehir;
        this.ulke = ulke;
    }

    public String getCadde() {
        return Cadde;
    }

    public void setCadde(String cadde) {
        Cadde = cadde;
    }

    public String getBlok() {
        return blok;
    }

    public void setBlok(String blok) {
        this.blok = blok;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public String getUlke() {
        return ulke;
    }

    public void setUlke(String ulke) {
        this.ulke = ulke;
    }

    public static String getQq() {
        return qq;
    }

    public static void setQq(String qq) {
        Adres.qq = qq;
    }
}
