package Set.hashset;

import java.util.HashSet;
import java.util.Set;

/*The set interface is present in java.util package and extends the Collection interface.
 It is an unordered collection of objects in which duplicate values cannot be stored.
It is an interface that implements the mathematical set.
 */
public class Hashset {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();

        for (int i = 1; i < 50; i++) {
            set.add(i);
        }
        set.add(1);
        set.add(0);
        set.add(3);
        set.add(3);
        set.add(35);
        set.add(36);
        System.out.println(set);
        set.remove(3);
        System.out.println(set);
        System.out.println(set.isEmpty());
        System.out.println(set.contains(35));
        set.clear();
        System.out.println(set);
    }
}
