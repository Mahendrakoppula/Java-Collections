package Hashmap.Treemap;

import com.sun.tools.javac.Main;

import java.util.Map;
import java.util.TreeMap;

public class Treemaps {
    public static void main(String[] args) {
        Map<String,Integer>tm=new TreeMap<>();
       tm.put("one",1);
       tm.put("Two",2);
       tm.put("Three",3);
       tm.put("Four",4);
       tm.put("Five",5);
       tm.put("Aa",5);
        System.out.println(tm);

    }
}
