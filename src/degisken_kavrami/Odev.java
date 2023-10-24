package degisken_kavrami;

import java.sql.SQLOutput;

public class Odev {

    public static void main(String[] args) {

        //SORU 1

        String stringDegiskeni = "150";

        int integerDegiskeni = Integer.parseInt(stringDegiskeni);
        int integerDegiskeni2 = Integer.valueOf(stringDegiskeni);

        System.out.println("Integer Degiskeni 1 :"+integerDegiskeni);
        System.out.println("Integer Degiskeni 2 :"+integerDegiskeni2);

        stringDegiskeni=String.valueOf(integerDegiskeni);
        System.out.println("String degiskeninin son degeri :"+stringDegiskeni);


//*************************************************************************************************************



        //SORU 2
        int sayi1 = 5/3;
        System.out.println("sayi1 sonucu :"+sayi1);

        float sayi2 = 5f/3f;                            //float virgülden sonra 7 karakter saklamis.
        System.out.println("sayi2 sonucu :"+sayi2);

        double sayi3 = 5d/3d;
        System.out.println("sayi3 sonucu :"+sayi3);


//*************************************************************************************************************
//*************************************************************************************************************
        //SORU 3

        System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);

        System.out.println(1.0 - 0.9);


//*************************************************************************************************************
        //SORU 4

        int number1 = 1;
        int number2 = 2;
        double average =(number1+number2)/2;                //typecasting yapabiliriz burda dogru sonuc icin.

        System.out.println("average: "+average);

        double average2 =(number1+number2)/2.0;
        System.out.println("average: "+average2);

    }
}
