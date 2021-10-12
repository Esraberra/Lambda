package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//  sorted(): list i natural order a göre sıralar.
//sorted(Comparator.reverseOrder()):büyükten küçüğe sıralamak istersek, Comparator class ından reverseOrder() metoduyla
//terse çevirip sorted() ile büyükten küçüğe sıralamış oluyoruz
// sorted(Comparator.comparing(t-> t.length())):elemanları kendi istediğimiz bir duruma göre sıralamak istediğimizde
//    örneğin burada elemanların length() ine göre sıralamışız
public class lambdaKonu {
    //2)List in elemanlarından ÇİFT olanları aralarında boşluk bırakarak yazdıran metod oluştur(Structured)

    //listteki tek sayilarin karelerini yazdiran metod

    //istedeki tekrarlı elemanları silip tek sayı olanların küplerini yazdıran metod oluştur
    //Listedeki tekrarlı elemanları silip çift sayı olanların karelerinin toplamını yazdıran metod oluştur
  //  List<Integer> yeni = new ArrayList<>();
//for (Integer w:l) {if (!yeni.contains(w)&&w%2==0)
   //     yeni.add(w);  //*************
 //   } int toplam = 0;
//for (Integer w:yeni) {
   //     toplam=toplam+w*w;
 //   }
//System.out.println("uzun yol"+toplam);
    //Listedeki tekrarlı elemanları silip çift sayı olanlarin küplerinin carpimini yazdiran metod
    ////7)Listedeki elemanları sıralayarak ve ters sıralayarak yazdır

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>(Arrays.asList(14, 9, 13, 4, 9, 2, 4, 4, 14, 15));
        yazdirJava(l);
        System.out.println();
yazdirLambda(l);
        System.out.println();
cifSayiJava(l);
        System.out.println();
ciftSayiLambda(l);
        System.out.println();
tekSayiKare(l);
        System.out.println();
        farkliTekKüp(l);
        System.out.println();
        ciftSayiKareToplam(l);
        System.out.println();
        ciftSayiKüplambda(l);
        System.out.println();
        listeTersSiralama(l);


    }

    public static void listeTersSiralama(List<Integer> l) {
        l.stream().sorted().forEach(t-> System.out.print(t+" "));
        System.out.println();
        l.stream().sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t+" "));
    }

    public static void ciftSayiKüplambda(List<Integer> l) {
        System.out.println(l.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(x,y)->x*y));
    }

    public static void ciftSayiKareToplam(List<Integer> l) {
        System.out.println(l.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t*t).reduce(0, (x, y) -> x+y));

    }

    public static void farkliTekKüp(List<Integer> l) {
       l.stream().distinct().filter(t->t%2==1).map(t->t*t*t).forEach(t-> System.out.print(t+" "));
    }

    public static void tekSayiKare(List<Integer> l) {
l.stream().filter(t->t%2==0).map(t->t*t).forEach(t-> System.out.print(t+ " "));


    }

    private static void ciftSayiLambda(List<Integer> l) {
    //lambda expression(->arrow function)
        l.stream().filter(t->t%2==0).forEach(t-> System.out.println(l));
    }

    private static void cifSayiJava(List<Integer> l) {
        for (Integer w : l ) {
            if (w%2==0) {
                System.out.println(w+" ");
            }
        }

    }
    //lambda(functional)

    private static void yazdirLambda(List<Integer> l) {
        l.stream().forEach(t-> System.out.print(t+" "));
    }



    public static void yazdirJava(List<Integer> l) {
        for (Integer w: l) {
            System.out.print(w+ " ");


        }








    }

}