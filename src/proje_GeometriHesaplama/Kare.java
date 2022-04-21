package proje_GeometriHesaplama;

public class Kare extends Sekil{

    public Kare(double uzunKenar,double kisaKenar) {
        super(uzunKenar,kisaKenar);

    }

    @Override
    public String toString() {
        return "Kenar = " + uzunKenar + ", \n kare cevre = " + cevreHesaplama()
                + ", \n kare alan = " + alanHesaplama();
    }

}
