import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NotHesaplama n = new NotHesaplama();
        System.out.print("Fizik notu:");
        n.fizikNotu = sc.nextInt();
        System.out.print("Kimya notu:");
        n.kimyaNotu = sc.nextInt();
        System.out.print("Matematik notu:");
        n.matematikNotu = sc.nextInt();
        System.out.print("Müzik notu:");
        n.muzikNotu = sc.nextInt();
        System.out.print("Tarih notu:");
        n.tarihNotu = sc.nextInt();
        System.out.print("Türkçe notu:");
        n.turkceNotu = sc.nextInt();
        System.out.println("....................");
        System.out.print("Ortalama : ");
        System.out.println(n.OrtalamaHesapla());
        System.out.print("Geçtimi - kaldımı? :  ");
        n.result();
    }
}