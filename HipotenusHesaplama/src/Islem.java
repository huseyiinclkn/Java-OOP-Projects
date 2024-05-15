import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Islem {
    int kenar1;
    int kenar2;
    int  kenar3;

    public void  HipotenusHesaplama() {
        Scanner input = new Scanner(System.in);
        System.out.print("1.Kenar: ");
        kenar1=input.nextInt();


        System.out.print("2.kenar: ");
        kenar2=input.nextInt();
        System.out.print("Hipotenüs: ");
        kenar3= (int)sqrt(pow(kenar1,2) + pow(kenar2,2));
        System.out.println(kenar3);


    }
}
