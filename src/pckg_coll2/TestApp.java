package pckg_coll2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestApp {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("automobil");
        list.add("karic");
        list.add("romobil");
        list.add("bicikla");
        list.add("avion");
        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);
        LenghtstringComperator lenghtstringComperator= new LenghtstringComperator();
        Collections.sort(list, lenghtstringComperator);
        System.out.println(list);
    }
}
