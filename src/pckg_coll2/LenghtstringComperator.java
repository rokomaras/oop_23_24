package pckg_coll2;

import java.util.Comparator;

public class LenghtstringComperator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        if(s1.length() > s2.length()){
            return 1;
        } else if (s1.length() < s2.length()){
            return -1;
        } else{
            return 0;
        }
    }
}
