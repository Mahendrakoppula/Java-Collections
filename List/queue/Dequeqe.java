package List.queue;

import java.util.ArrayDeque;
import java.util.Iterator;

/*The Deque is related to the double-ended queue
that supports the addition or removal of elements from
either end of the data structure.
 */
public class Dequeqe {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad= new ArrayDeque<>();
        ad.offer(10);
        ad.offerFirst(1);
        ad.offerLast(11);
        ad.offerLast(13);
        ad.offerFirst(3);
        System.out.println(ad);
        System.out.println("peek "+ad.peek());
        System.out.println("peek first "+ad.peekFirst());
        System.out.println("peek last "+ad.peekLast());

//        System.out.println("poll "+ad.poll());
        System.out.println("poll first "+ad.pollFirst());
        System.out.println("poll last "+ad.pollLast());

        System.out.println(ad);

//        System.out.println(ad.removeFirstOccurrence(10));
//        System.out.println(ad);
        System.out.println(ad.getFirst());
        System.out.println(ad.getLast());

        Iterator<Integer> it = ad.descendingIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
