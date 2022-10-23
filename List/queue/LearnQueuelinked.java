package List.queue;

import java.util.LinkedList;
import java.util.Queue;

//FIFO (First-In-First-Out)
//public interface Queue extends Collection
public class LearnQueuelinked {
    public static void main(String[] args) {

        Queue<Integer>qu= new LinkedList<>();
        qu.offer(10);
        qu.offer(1);
        qu.offer(13);
        qu.offer(14);
        qu.offer(15);
        System.out.println(qu); //[10, 1, 13, 14, 15]
       /* Iterator<Integer> it= qu.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        */
        System.out.println(qu.poll());
        System.out.println(qu.element());

    }
}
