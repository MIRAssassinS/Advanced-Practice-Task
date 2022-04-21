package proje_Example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayit {

     List<Kullanici> kisiler = new ArrayList<>();


    public  List<Kullanici> kayitAl() {
     Scanner scan = new Scanner(System.in);
        System.out.print("adinizi giriniz :");
        String isim=scan.next();
        Kullanici k1=new Kullanici(isim, LocalDateTime.now());
        kisiler.add(k1);
        return kisiler;
    }

    public void sansliKullanici(List<Kullanici> kll){
        for (Kullanici k:kll) {
            if (k.kayitZamani.getSecond()<10){
                System.out.println("sansli kisiniz "+k.name +"5 kilo bal kazandiniz  :");
            }else System.out.println("malesef "+k.name+ "  degilsiniz");
        }

    }
    public void listle(List<Kullanici>kullanicilar){
        for (Kullanici k:kullanicilar) {
            System.out.println("adi :"+k.name+"  kayit zamani : "+k.kayitZamani);

        }
    }


}
