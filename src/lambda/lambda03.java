package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lambda03 {
    public static void main(String[] args) {
List<Integer> l =new ArrayList<>(Arrays.asList(7,12,14,4,9,2,4,12,16));
ilkDortEleman(l);
kucuktenBuyugeSiralailkDortGec(l);

    }




    //kucukten büyüge sirala sonra ilk 4 elemani yazdir
    public static void ilkDortEleman(List<Integer> l) {
    l.stream().sorted().limit(4).forEach(metodLambda2::bosluklaYazdir);
    }

    //kucukten büyüge sirala ilk dört elemani atla
    public static void kucuktenBuyugeSiralailkDortGec(List<Integer> l) {
   l.stream().sorted().skip(4).forEach(metodLambda2::bosluklaYazdir);
    }
  //  List teki en büyük elemanı bul.(Use Method Reference)

//10) Tüm elemanların uzunluklarının 12'den az olup olmadığını kontrol etmek için bir metod oluşturun



}
