package MapPractice;

import java.util.HashMap;
import java.util.Scanner;

public class MapMethods {

static Scanner scan=new Scanner(System.in);
        public static void main(String[] args) {

            HashMap<Integer,String> hm1=new HashMap<>();
            hm1.put(101, "Ali Han");// eleman eklemek için kullanılır.
            hm1.put(102, "veli Can");
            hm1.put(103, "Ayşe Tan");
            hm1.put(101, "Kemal Yıldız"); // aynı key kullanıldığında eski kaydın üzerine yazar.
            System.out.println(hm1);

            hm1.put(104, "veli Can"); //tekrarlı kye izin vermez ancak tekrarlı value ya izin verir.
            System.out.println(hm1);

            hm1.put(null, "merve aslan");

            System.out.println(hm1);


            hm1.put(null,"hakan inal");
            System.out.println(hm1);

            hm1.put(105,null);
            System.out.println(hm1);
            hm1.put(106,null);
            System.out.println(hm1);

            System.out.println(hm1.get(103));

            System.out.println(hm1.values());

            System.out.println(hm1.keySet());

            hm1.putIfAbsent(104, "kubilay tuncel");//belirtilen key e ait key ve value olduğu için eklemedi
            System.out.println(hm1);

            hm1.putIfAbsent(107, "hakan tetik");
            System.out.println(hm1);

            hm1.putIfAbsent(105, "faruk efehan");
            System.out.println(hm1);

            System.out.println("1. mapin eleman sayısı :"+hm1.size());

            HashMap<Integer,String>hm2=new HashMap<>();
            hm2.put(107, "elma");
            hm2.put(106, "Armut");
            hm2.put(200, "mandalina");

            System.out.println("2. mapin eleman sayısı :"+hm2.size());

            hm1.putAll(hm2);

            System.out.println(hm1);
            System.out.println("1. mapin eleman sayısı :"+hm1.size());
            //hm2.putAll(hm1);
            System.out.println(hm2);

            System.out.println(" numara giriniz ");

            int num= scan.nextInt();




        }

    }

