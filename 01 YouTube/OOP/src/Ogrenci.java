public class Ogrenci {
    private String adi;
    private String soyadi;
    private Adres oAdres;


    public Ogrenci() {
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public Adres getoAdres() {
        return oAdres;
    }

    public void setoAdres(Adres oAdres) {
        this.oAdres = oAdres;
    }
}
