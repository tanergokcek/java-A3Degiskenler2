package degisken_kavrami;
public class TipDonusumuTypeCasting {

    public static void main(String[] args) {
        int sayi = 10;
        float noktaliSayi = 130.25F;


         /*
        noktalisayi = sayi;                                                                         //sagdaki soldakine atanir.Tam tersi atarsak olmaz.
        System.out.println("Noktalı sayının değeri : " + noktalisayi);
        */

        sayi = (int) noktaliSayi;
        System.out.println("Sayi degeri :" + sayi);

        byte byteSayi = 5;                                                                          //byte en fazla 127 degerini saklayabiliriz

        byteSayi = (byte) noktaliSayi;
        System.out.println("Byte sayinin degeri : " + byteSayi);                                    //sacma dogru olmayan bir deger yazacak.

    }
}