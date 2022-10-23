package List.ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class dupicate {
    public static void main(String[] args) {
        ArrayList<Integer> in= new ArrayList<>(Arrays.asList(10,10,30,40,50,60,70,809,90,1,1,1,3,3,4,5));
        var dis=in.stream().distinct().collect(Collectors.toList());
        System.out.println(dis);
    }
}
