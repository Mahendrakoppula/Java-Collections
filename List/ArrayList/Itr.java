package List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Itr {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i <=10; i++) {
            al.add(i);
        }
       System.out.println(al);
        Iterator<Integer> it= al.iterator();
        while (it.hasNext()) {
            Integer I= (Integer) it.next();
            if (I%2==0){
                it.remove();
            }
//            else {
//                it.remove();
//            }
        }
        System.out.println(al);
        }
    }
