import java.util.Scanner;

import static java.lang.Math.pow;

public class Hesapla {
    int yaricap;
    double  cevre;
    double  alan;
    double merkezAci;
    Scanner input = new Scanner(System.in);

  public void degerAlma(){

      System.out.print("Yaricap degeri giriniz: ");
      yaricap = input.nextInt();

  }
  public void cevreHesapla(){
      cevre = Math.PI*yaricap*2;
      System.out.println("Çevre değeri: " + cevre);
  }
  public void alanHesapla(){
      System.out.print("Merkez Açı Ölçüsünü Giriniz: ");
      merkezAci =input.nextDouble();
      alan= ((Math.PI*(pow(yaricap,2))*merkezAci)/360);
      System.out.println("Merkez Açı Ölçüsü "+merkezAci+" olan daire diliminin alanı: " + alan);
  }
}
