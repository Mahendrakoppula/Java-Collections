package Hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Itertaion {
    public static void main(String[] args) {
        HashMap<String,String> hp=new HashMap<>();
        hp.put("India","delhi");
        hp.put("Us","DC");
        hp.put("UK","London");
        hp.put("India","kolkata");
        hp.put("hello",null);
        hp.put(null,"heloo");

        //iterator over keys
        System.out.println("**using Itertaor**");
       Iterator<String> it=hp.keySet().iterator();
        while (it.hasNext()){
            String Key=it.next();
            String value=hp.get(Key);
          System.out.println(Key+" : "+ value);
        }
        System.out.println("----------");

        //iterator over set(pair) by uing entry set
        System.out.println("**using entry set**");
         Iterator<Map.Entry<String,String>> it1= hp.entrySet().iterator();
        while (it1.hasNext()){
            Map.Entry<String,String> et= it1.next();
            System.out.println(et.getKey()+" : "+et.getValue());
        }
        System.out.println("----------");

        //iterate hashmap using Java 8 -> for each and Lambda
        System.out.println("**Java 8**");
        hp.forEach((k,v)-> System.out.println(k+" :"+v));
    }
}
