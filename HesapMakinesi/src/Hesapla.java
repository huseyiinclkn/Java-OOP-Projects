import java.util.Scanner;

public class Hesapla {
    int sayi1;
    int  sayi2;
    String sorgu;

    Scanner input = new Scanner(System.in);

    public void Islem() {
        while (true) {
            System.out.print("1. Sayıyı giriniz: ");
            sayi1 = input.nextInt();
            System.out.print("2. Sayıyı giriniz: ");
            sayi2 = input.nextInt();
            System.out.println("Hangi işlemi yapmak istiyorsunuz?");
            System.out.print("Toplama - Çıkarma - Çarpma - Bölme: ");
            sorgu = input.next();

            if (sorgu.equalsIgnoreCase("toplama")) {
                System.out.println("Toplama sonucu :"+(sayi1 + sayi2));
            } else if (sorgu.equalsIgnoreCase("çıkarma")) {
                System.out.println("Çıkarma sonucu :"+(sayi1 - sayi2));
            } else if (sorgu.equalsIgnoreCase("çarpma")) {
                System.out.println( "Çarpma sonucu :"+(sayi1 * sayi2));
            } else if (sorgu.equalsIgnoreCase("bölme")) {
                if (sayi2 != 0) {
                    System.out.println("Bölme sonucu :"+(double)sayi1 / sayi2);
                } else {
                    System.out.println("Bölen sıfır olamaz.");
                }
            } else {
                System.out.println("Eksik veya hatalı giriş yaptınız. Lütfen tekrar deneyin.");
                continue;
            }

            System.out.print("Başka bir işlem yapmak istiyor musunuz? (Evet/Hayır): ");
            String devam = input.next();
            if (devam.equalsIgnoreCase("Hayır")) {
                break;
            }
        }
    }
}
