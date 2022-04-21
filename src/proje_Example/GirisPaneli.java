package proje_Example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GirisPaneli {
    public static void panel(){
        Scanner scan = new Scanner(System.in);

        int islem;

        Kayit yeniKayit = new Kayit();
        List<Kullanici> kisi = new ArrayList<>();

        boolean cikilsinMi = false;
        while (!cikilsinMi) {
            System.out.println("lutfen \n1: kayit al \n2:sansli kisi bul \n3:kisileri lisletele \n4:cikis ");
            System.out.print("Isleminizi seciniz :");
            islem=scan.nextInt();
            switch (islem) {
                case 1:
                    kisi = yeniKayit.kayitAl();
                    break;
                case 2:
                    yeniKayit.sansliKullanici(kisi);
                    break;
                case 3:
                    yeniKayit.listle(kisi);
                    break;
                case 4:
                    cikilsinMi = true;
                    break;
                default:
                    System.out.println("hatali veri girdiniz");
                    break;
            }
        }


    }
    }


