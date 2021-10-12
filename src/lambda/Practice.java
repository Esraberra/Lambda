package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {


    public static void main(String[] args) {



        List<String> list =new ArrayList<>(Arrays.asList("Ali", "Bartu", "Cem", "Tevfik"));
        System.out.println(list);
        System.out.println();
// bas harfi b-t arasi olan kelimeleri yazdir
list.stream().filter(t->t.charAt(0)>'b'&& t.charAt(0)<'t').forEach(System.out::println);
     }
}
