package List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraylistMethods {

    public static void main(String[] args) {
        ArrayList<Integer>num= new ArrayList<>();
        num.add(100);
        num.add(18);
        num.add(67);
        num.add(99);

        ArrayList<Integer> st = new ArrayList<>();
        st.add(10);
        st.add(30);
        st.add(40);
        System.out.println(num);
        System.out.println(st);
        System.out.println("-----");
        System.out.println("addall");
        num.addAll(st);
        System.out.println(num);
        System.out.println("-----");
        System.out.println("addall from indices");
        num.addAll(3,st);
        System.out.println(num);
        System.out.println("-----");
//        System.out.println("clear");
//        num.clear();
//        System.out.println(num);
        ArrayList<Integer>cl = (ArrayList<Integer>) num.clone();
        System.out.println(cl);

        System.out.println("-----");
        System.out.println("indexof");
        System.out.println(num.indexOf(100));
        System.out.println("-----");
        System.out.println("RemoveIf");
        num.removeIf(i->i%3==0);
        System.out.println(num);
        System.out.println("-----");
        System.out.println("retainAll");
        ArrayList<String> str= new ArrayList<>(Arrays.asList("hello","dello","vall","doll","hello"));
        str.retainAll(Collections.singleton("hello"));
        System.out.println(str);
    }
}
