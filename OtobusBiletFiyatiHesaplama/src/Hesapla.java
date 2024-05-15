import java.util.Scanner;

public class Hesapla {

    int mesafe;
    int yas;
    int yolculukTipi;
    double biletUcreti;
    double yasIndirimUcreti= 0;
    double yasIndirimOranı;


    Scanner input = new Scanner(System.in);

    public void Yazdır() {

        System.out.print("Mesafeyi Giriniz: ");
        mesafe = input.nextInt();
        System.out.print("Yaşınızı Giriniz: ");
        yas = input.nextInt();
        System.out.println("Yolculuk Tipiniz: 1=> Tek Yön , 2=> Gidiş-Dönüş");
        yolculukTipi = input.nextInt();

    }

    public void Kontrol() {
        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı veri girdiniz");

        }

        if (yas < 12) {
            yasIndirimOranı = 0.50;
        } else if (yas >= 12 && yas <= 24) {
            yasIndirimOranı = 0.10;
        } else if (yas > 65) {
            yasIndirimOranı = 0.30;
        }
        biletUcreti = mesafe * 0.10;
        yasIndirimUcreti= biletUcreti*yasIndirimOranı;
        biletUcreti-=yasIndirimUcreti;




        if (yolculukTipi == 2) {
        biletUcreti-=biletUcreti*0.20;
        biletUcreti*=2;
        }



        System.out.println("Toplam Tutar= " + biletUcreti);

    }

    }

