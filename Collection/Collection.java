package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;



public class Collection {
    public static void main(String[] args) {
        // ArrayList<String> list = new ArrayList<String>();
        // list.add("Anmol");
        // list.add("devansh");
        // list.add("rohit");
        // list.add("anmol");
        // list.add("Anmol");
        // System.out.println(list);
        // for(String s: list) {
        //       System.out.println(s);
        //       }

        // HashSet<String> set = new HashSet<String>();
        // set.add("Anmol");
        // set.add("devansh");
        // set.add("rohit");
        // set.add("anmol");
        // set.add("Anmol");
        // Iterator<String> itr= set.iterator();
        // while(itr.hasNext()){
        //     System.out.println(itr.next());
        // }

        HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"anmol");
        map.put(2,"devansh");
        map.put(3,"Rohit");
        map.put(4,"Aniket");

        for(Integer n: map.keySet()) {
            System.out.println(n + "--->" + map.get(n));
        }
    }
    
}
