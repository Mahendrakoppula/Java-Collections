package Set.Linkedhashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Linkedhashset {
    public static void main(String[] args) {
        Set<Integer> Lset=new LinkedHashSet<>();
        Lset.add(1);
        Lset.add(3);
        Lset.add(3);
        Lset.add(35);
        Lset.add(36);
        System.out.println(Lset);
    }
}
