package proje_OkulYonetimi;

public class Ogrenci extends Kisi{

   private String ogrenciNo;
   private String sinif;

   public Ogrenci() {
   }


    public Ogrenci(String adSoyad, String kimlikNo, int yas, String ogrenciNo, String ogreciSinif) {
        super(adSoyad, kimlikNo, yas);
        this.ogrenciNo = ogrenciNo;
        this.sinif = ogreciSinif;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public String getOgreciSinif() {
        return sinif;
    }

    public void setOgreciSinif(String ogreciSinif) {
        this.sinif = ogreciSinif;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ogrenciNo='" + ogrenciNo + '\'' +
                ", ogreciSinif='" + sinif + '\'' +
                '}';
    }
}
