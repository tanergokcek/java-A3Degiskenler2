
package degisken_kavrami;
public class IlkelVeriTipleri {
    public static void main(String[] args) {
        int integerDegiskeminDegeri = 10;
        double doubleDegiskeniminDegeri = 10.50;
        short shortVeriTipi = 32767;

        // Aşağıdaki ifadeler tamsayi veri türlerinin özelliklerini yazdırır
        System.out.println("BYTE EN KUCUK DEGERI :  " + Byte.MIN_VALUE + " EN BUYUK DEGERI : " + Byte.MAX_VALUE + " KACBIT : " + Byte.SIZE);
        System.out.println("SHORT EN KUCUK DEGERI : " + Short.MIN_VALUE + " EN BUYUK DEGERI : " + Short.MAX_VALUE + " KAC BIT : " + Short.SIZE);
        System.out.println("INT EN KUCUK DEGERI : " + Integer.MIN_VALUE + " EN BUYUK DEGERI : " + Integer.MAX_VALUE + " KAC BIT : " + Integer.SIZE);
        System.out.println("LONG EN KUCUK DEGERI : " + Long.MIN_VALUE + " EN BUYUK DEGERI : " + Long.MAX_VALUE + " KAC BIT : " + Long.SIZE);

        // Aşağıdaki ifadeler ondalikli veri türlerinin özelliklerini yazdırır

        System.out.println("FLOAT EN KUCUK DEGERI : " + Float.MIN_VALUE + " EN BUYUK DEGERI : " + Float.MAX_VALUE + " KAC BIT : " + Float.SIZE);
        System.out.println("DOUBLE EN KUCUK DEGERI : " + Double.MIN_VALUE + " EN BUYUK DEGERI : " + Double.MAX_VALUE + " KAC BIT : " + Double.SIZE);



       //-----------------------------------------------------------------------------------------------------------------------------------------------


        // char
        char harf = 'c';
        System.out.println("Harf : " + harf);
        int integerDeger = 'B' ;                                                                        //B nin sayisal degerini atar
        System.out.println("Integer deger : "+ integerDeger);
        // boolean
        boolean sonuc = true;
        System.out.println("Boolean sonuc degiskenin degeri : "+ sonuc);
        sonuc = false;
        System.out.println("Boolean sonuc degiskenin degeri : "+ sonuc);
        boolean sonuc2 = false;
        System.out.println("Boolean sonuc2 degiskenin degeri : "+ sonuc2);

    }
}