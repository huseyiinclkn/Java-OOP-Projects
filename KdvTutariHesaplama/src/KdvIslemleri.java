import java.util.Scanner;

public class KdvIslemleri {
    double tutar= 0.0;
    int kdvOrani = 18;
    double kdvTutari;
    double kdvliFyat;

    public void IslemleriTutar(){
        Scanner input = new Scanner(System.in);
        System.out.print("Tutarı Giriniz : ");
        tutar=input.nextDouble();
        System.out.println("Kdv Oranı: %" + kdvOrani);
        kdvTutari= (tutar * kdvOrani) /100;
        System.out.println("Kdv Tutarı: " +kdvTutari);
        kdvliFyat=tutar+kdvTutari;
        System.out.println("Kdvli Fiyatı: " + kdvliFyat);


    }
}
