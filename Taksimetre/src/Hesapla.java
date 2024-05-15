import java.util.Scanner;

public class Hesapla {
    double yol;
    double kilometreBasiTutar=2.20;
    int kisaMesafeTutar=20;
    int acilisUcret =10;
    double ucret;

    Scanner input = new Scanner(System.in);


    public void Ucret(){
        System.out.println ("Merhaba Hoşgeldiniz İyi Yolculuklar :) ");
        System.out.println("0-10 km arası ücretimiz  20 Tl.");
        System.out.print("Kaç km gidiceğimizi söylermisiniz: ");
        yol =input.nextDouble();

        if(yol>=0 && yol<=10){
            System.out.print("Kısa Mesafe Gidiceğimiz için ücretiniz: ");
            System.out.print(kisaMesafeTutar +"TL");
        }
        else if(yol>10){

            ucret=(yol*kilometreBasiTutar)+acilisUcret;
            System.out.println("Ücretiniz: "+ucret+"TL");
            System.out.print("Tekrar Bekleriz Teşekkür Ederiz :)");
        }
        else{
            System.out.print("");
        }



    }
}
