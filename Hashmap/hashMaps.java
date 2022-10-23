package Hashmap;

import java.util.HashMap;

public class hashMaps {
    public static void main(String[] args) {
        HashMap<String,String>hp=new HashMap<>();
        hp.put("India","delhi");
        hp.put("Us","DC");
        hp.put("UK","London");
        hp.put("India","kolkata");
        hp.put("hello",null);
        hp.put(null,"heloo");
        System.out.println(hp.get(null));
    }
}
