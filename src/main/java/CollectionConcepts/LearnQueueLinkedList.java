package CollectionConcepts;
import java.util.LinkedList;
import java.util.Queue;

public class LearnQueueLinkedList {
    public  void QueueOpration()
    {
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        System.out.println("Queue: " + queue);
        System.out.println("Queue: " + queue.poll());
        System.out.println("Queue: " + queue);

    }
}
