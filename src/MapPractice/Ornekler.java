package MapPractice;

import java.util.HashMap;
import java.util.Scanner;

public class Ornekler {

    public static void main(String[] args) {
     /*
        1- Kullanıcıdan bir kisinin kimlik numarsını(4 haneli), tam ismini, adresini , telefonunu alın.
        2- Kimlik numarasını key olarak, diğer bilgileri value olarak bir mape depolayın
        3- Kimlik numarasını girerek kullanıcını bilgilerini ekrana yazdırın
        4-tüm kullanicilarin isimlerini ekrana yazdiralim

        kimlikNumarasi=key
        value= isim, adres, teledon

      */

        HashMap< Integer, HashMap<String, String> > kayitBilgileri = new HashMap< >();
        HashMap<String, String> icMap=new HashMap<>();

        Scanner scan=new Scanner(System.in);

        //int kimlikNo= scan.nextInt();
        System.out.println("Lütfen isim giriniz");
        icMap.put("isim", scan.nextLine());

        //String isim=scan.nextLine();
        System.out.println("adres giriniz");

        icMap.put("Adres", scan.nextLine());
        //String adres=scan.nextLine();
        System.out.println("telefon giriniz");
       // String telefon=scan.nextLine();

        icMap.put("telefon", scan.nextLine());

        System.out.println("Lütfen 4 haneli kimlik numarasini giriniz");
        kayitBilgileri.put(scan.nextInt(), icMap );
        System.out.println(icMap);
        System.out.println(kayitBilgileri);







    }

}
