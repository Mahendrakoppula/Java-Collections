package List.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Spliterator;

/*PriorityQueue -- The PriorityQueue is based on the priority heap.
The elements of the priority queue are ordered according to the natural ordering,

 important points on Priority Queue:
 1.PriorityQueue doesn’t permit null.
 2.We can’t create a PriorityQueue of Objects that are non-comparable.
 3.PriorityQueue are unbound queues.
 4.The head of this queue is the least element with respect to the specified ordering.
  If multiple elements are tied for the least value,the head is one of those elements
  ties are broken arbitrarily.
  5.It provides O(log(n)) time for add and poll methods.

 Constructors:

1. PriorityQueue(): Creates a PriorityQueue with the default initial capacity (11) that orders its elements according to their natural ordering.

PriorityQueue<E> pq = new PriorityQueue<E>();

2. PriorityQueue(Collection<E> c): Creates a PriorityQueue containing the elements in the specified collection.

PriorityQueue<E> pq = new PriorityQueue<E>(Collection<E> c);

3. PriorityQueue(int initialCapacity): Creates a PriorityQueue with the specified initial capacity that orders its elements according to their natural ordering.

PriorityQueue<E> pq = new PriorityQueue<E>(int initialCapacity);

4. PriorityQueue(int initialCapacity, Comparator<E> comparator): Creates a PriorityQueue with the specified initial capacity that orders its elements according to the specified comparator.

PriorityQueue<E> pq = new PriorityQueue(int initialCapacity, Comparator<E> comparator);

5. PriorityQueue(PriorityQueue<E> c): Creates a PriorityQueue containing the elements in the specified priority queue.

PriorityQueue<E> pq = new PriorityQueue(PriorityQueue<E> c);

6. PriorityQueue(SortedSet<E> c): Creates a PriorityQueue containing the elements in the specified sorted set.

PriorityQueue<E> pq = new PriorityQueue<E>(SortedSet<E> c);
 */
public class priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.offer(10);
        pq.offer(1);
        pq.offer(1);
        pq.offer(13);
        pq.offer(14);
        pq.offer(15);
        System.out.println(pq); //[1, 10, 13, 14, 15]

        pq.offer(1);
        System.out.println(pq); //[1, 10, 1, 13, 14, 15] Point number:4

        pq.add(90);
        System.out.println(pq);
        pq.remove(1);
        System.out.println(pq);
        System.out.println("Peek"+pq.peek());

//        for (int i:pq) {
//            System.out.println(i);
//        }
        Iterator<Integer> it= pq.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println(pq.isEmpty());
    }
}
