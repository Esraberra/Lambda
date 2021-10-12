package lambda;

import java.util.*;

public class Lambda04 {
    public static void main(String[] args) {

        List<String> l = new ArrayList<>(Arrays.asList("Ali","Ali","Aysima","Abdurrahman","Mehmet","Mustafa","Bedirhan","Yüksel","Süleyman"));
yazdirBuyuk(l);
        System.out.println();
uzunluklarinaSirala(l);
        System.out.println();
farkliElemanSonHarf(l);

        System.out.println();
elemanUzunluk(l);
        System.out.println();
aIleBaslayanListeYazdir(l);
        System.out.println();
kucukHarflerlAile(l);
        System.out.println();
ogeleriUzunluklarinaGoreSirala(l);
        System.out.println();
onceElemanSonraAli(l);
        System.out.println();
        herElemanKaresi(l);
        tumElemanUzunluklari(l);
        System.out.println();
        sondanIkiElemaniSirala(l);
        uzunluklarinagoreTerstenSirala(l);
    }




    //1) liste nin elemanlarini büyük harfle yazdir
    public static void yazdirBuyuk(List<String> l) {
        l.stream().map(t->t.toUpperCase()).forEach(metodLambda2::bosluklaYazdir);
        System.out.println();
        l.stream().map(String::toUpperCase).forEach(metodLambda2::bosluklaYazdir);



    }

    //2) elemanları uzunluklarına göre sırala ve yazdır
    public static void uzunluklarinaSirala(List<String> l) {
        l.stream().sorted(Comparator.comparing(String::length)).forEach(metodLambda2::bosluklaYazdir);
    }

//3) farklı elemanlarını son harflerine göre sıralayıp yazdır
public static void farkliElemanSonHarf(List<String> l) {
       l.stream().distinct().sorted(Comparator.comparing(t->t.substring(t.length()-1))).forEach(metodLambda2::bosluklaYazdir);

}
//4) Elemanları uzunluklarına ve ardından (aynı uzunlukta olanları) ilk karakterlerine göre sıralamak için bir yöntem oluşturun
public static void elemanUzunluk(List<String> l) {
l.add("ata");
        l.stream().sorted(Comparator.comparing(String::length).thenComparing(t->t.substring(0,1))).forEach(metodLambda2::bosluklaYazdir);
}
//6)Büyük harflerle, "A" ile başlayan liste öğelerini yazdırmak için bir yöntem oluşturun    */
private static void aIleBaslayanListeYazdir(List<String> l) {
   l.stream().filter(t->t.startsWith("A")).map(String::toUpperCase).forEach(metodLambda2::bosluklaYazdir);

}
//7)  Küçük harflerle, "A" ile başlayan veya "i" ile biten liste öğelerini yazdırmak için bir yöntem oluşturun
private static void kucukHarflerlAile(List<String> l) {
        l.stream().filter(t->t.startsWith("A") || t.endsWith("i")).map(String::toLowerCase).forEach(metodLambda2::bosluklaYazdir);
}

//7) Öğeleri uzunluklarına göre sıraladıktan sonra büyük harflerle yazdırmak için bir yöntem oluşturun

    public static void ogeleriUzunluklarinaGoreSirala(List<String> l) {
     l.stream().sorted(Comparator.comparing(String::length)).map(String::toUpperCase).forEach(metodLambda2::bosluklaYazdir);

    }
//8) Elemanları uzunluklarına göre sıralayın önce elemanı sonra uzunluğunu yazdırın
    //Ali:3,
private static void onceElemanSonraAli(List<String> l) {
 l.stream().sorted(Comparator.comparing(String::length)).map(t->t + ":"+t.length()).forEach(metodLambda2::bosluklaYazdir);
    }

    //9) Her elemanın uzunluğunun karesini alıp tekrarlıları sil, bunların 20'den büyük olanlarını ters sırada  yazdırın
    private static void herElemanKaresi(List<String> l) {

        l.stream().distinct().map(t->t.length()*t.length()).filter(t->t>20).sorted(Comparator.reverseOrder()).forEach(metodLambda2::bosluklaYazdir);
    }

//10) Tüm elemanların uzunluklarının 12'den az olup olmadığını kontrol etmek için bir metod oluşturun

    public static void tumElemanUzunluklari(List<String> l) {
   boolean result1=  l.stream().allMatch(t->t.length()<12);
        System.out.println("elemanlarin uzunluklari 12'den kücük mü?" +result1);
        System.out.println();
        boolean result2=  l.stream().noneMatch(t->t.startsWith("x")); // bütün elemanlarin x ile baslamadigini kontrol et
        System.out.println("elemanlardan  x ile baslayan yok mu ?" +result2);
        System.out.println();
        boolean result3=  l.stream().anyMatch(t->t.endsWith("R"));// en az bir tane "R" ile biten eleman
        System.out.println("elemanlardan  herhangi biri R ile bitiyor mu ?" +result3);

    }
    //elemanları sondan 2. elemanlarına göre sıralayıp ilk elemanı yazdır
    public static void sondanIkiElemaniSirala(List<String> l) {

        System.out.println( l.stream().sorted(Comparator.comparing(t->t.charAt(t.length()-2))).findFirst());
    }
//12)elemanlari uzunluklarina gore tersten siralayip ilk elemani yazdir
private static void uzunluklarinagoreTerstenSirala(List<String> l) {
    System.out.println(l.stream().sorted(Comparator.comparing(String::length).reversed()).findFirst());
    System.out.println();

}
}
