import java.util.Scanner;

import static java.lang.Math.pow;

public class Hesapla {
        double kilo;
        float boy;
        double kitleIndeksi=0.0;
        public void KitleHesapla(){
        Scanner input = new Scanner(System.in);
        System.out.print("Kilo: ");
        kilo= input.nextDouble();
        System.out.print("Boy: ");
        boy=input.nextFloat();
        kitleIndeksi=(kilo/(pow(boy,2)));
        System.out.println("Vicut Kitle İndeksi: "+kitleIndeksi);

    }
    public void KitleDurumu(){
        if(kitleIndeksi>=0 && kitleIndeksi<=18.5){
            System.out.println("Zayıf");
        } else if (kitleIndeksi>=18.5 && kitleIndeksi<=24.9) {
            System.out.println("Normal");
            
        } else if (kitleIndeksi>=25 && kitleIndeksi<=29.9) {
            System.out.println("Fazla Kilolu");
            
        }
        else {
            System.out.println("Obezite");
        }
    }
}
