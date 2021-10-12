package MapPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MapOrnek1 {
    public static void main(String[] args) {



   // /maplerde bir key e karsilik birden fazla value kullanilabilir mi ?
    //key degeri 2000 ve vakue olarak bu yilda yayinlanmis bir suru kitap var nasil listeleriz

    /*         *meyveler
                 elma
                 armut
                  cilek
     *bitkiler
    kabak
    patlican
    marul ispanak


     */


        HashMap<String,List<String>>mutfagimiz=new HashMap<>();


        mutfagimiz.put("meyveler", Arrays.asList("elma","armut","cilek"));
mutfagimiz.put("sebzeler", Arrays.asList("kabak","patlican","marul","ispanak"));
mutfagimiz.put("vitaminler", Arrays.asList("a","b","c","d"));

        System.out.println(mutfagimiz.get("meyveler").get(1));








    }

    }
