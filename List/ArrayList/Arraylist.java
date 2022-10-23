package List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Collectors;

public class Arraylist {
    public static void main(String[] args) {
    /*
        //default generics

        ArrayList<Object> ar= new ArrayList<>();
        ar.add(100);
        ar.add("hello");
        ar.add(78.99);
        ar.add(true);
        System.out.println(ar.subList(1,3));
        System.out.println(ar);
    */

   //Generics Arraylist
        ArrayList<Integer>ar= new ArrayList<>();
        ar.add(100);
        ar.add(9);
        ar.add(1);
        ar.add(5);
        ar.add(3);
        System.out.println(ar);
        ArrayList<String> st= new ArrayList<>();
        st.add("hello");
        st.add("dello");
        st.add("qello");
        st.add("eello");
        st.add("rello");
        System.out.println(st);
        System.out.println("----------");
        //using for loop
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }
        System.out.println("----------");
            //using for each
            for (int q:ar) {
                System.out.println(q);
            }
        System.out.println("----------");
         //using Lambda Expression

        st.stream().forEach(ele-> System.out.println(ele));

        System.out.println("----------");
        //iterator

       Iterator<Integer> it=ar.iterator();
       while (it.hasNext()){
           System.out.println(it.next());
       }

        //Arry to arralist
       int [] r= new int[]{10,30,4050,60,70,80};
       ArrayList<Integer>o = new ArrayList<>();
       o= (ArrayList<Integer>) Arrays.stream(r).boxed().collect(Collectors.toList());
       System.out.println(o);
    }
}
