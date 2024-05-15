public class NotHesaplama {
    int  fizikNotu;
    int matematikNotu;
    int turkceNotu;
    int kimyaNotu;
    int muzikNotu;
    int tarihNotu;
    int sonuc;

    public int OrtalamaHesapla(){
        sonuc= (fizikNotu+matematikNotu+turkceNotu+kimyaNotu+muzikNotu+tarihNotu / 6);
        return sonuc;

    }
    public void result(){
        sonuc= OrtalamaHesapla();
        String durum = sonuc>60 ? "Geçti" : "Kaldı";
        System.out.println(durum);
    }

}
