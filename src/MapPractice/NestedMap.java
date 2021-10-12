package MapPractice;

import java.util.HashMap;
import java.util.Map;

public class NestedMap {
    public static void main(String[] args) {

        // birinci kisiye ait bir den fazla deger varsa ad_ kilo: boy
/* kimlikNo     ad: Esra            MAP KISMI DA ASLINDA KEY KSIMI VAR YINE MAP GIBI
      1234          soyAdi:Kücük
                sehir:Istanbul
               bolum: QA

 kimlikNO
 9856


 */


        HashMap<Integer, HashMap<String, String>> kisiListesi = new HashMap<>();
        HashMap<String, String> icMapKisiBilgileri = new HashMap<>();

        icMapKisiBilgileri.put("Isim", "Esra");
        icMapKisiBilgileri.put("soyad", "Kücük");
        icMapKisiBilgileri.put("Adres", "Istanbul");
        icMapKisiBilgileri.put("bolum", "QA");
        //  System.out.println(icMapKisiBilgileri);
        HashMap<String, String> icMapKisiBilgileri1 = new HashMap<>();

        icMapKisiBilgileri1.put("Isim", "Yasemin");
        icMapKisiBilgileri1.put("soyad", "Ssuam");
        icMapKisiBilgileri1.put("Adres", "Almanya");
        icMapKisiBilgileri1.put("bolum", "Dev");


        kisiListesi.put(1234, icMapKisiBilgileri);
        kisiListesi.put(9856, icMapKisiBilgileri1);
        System.out.println(kisiListesi);


        //maplerden data getirme

        System.out.println(kisiListesi.get(9856));//mapte get metodu ile value ya karsilik gelen mapi getirdi

        System.out.println(kisiListesi.get(9856).get("Isim"));

        for (Map.Entry<Integer, HashMap<String, String>> entry : kisiListesi.entrySet())
        {
            System.out.println(entry.getValue().get("ad")+" "+entry.getValue().get("soyad")+" "+
                    entry.getValue().get("bolum"));


        }


    }


}

