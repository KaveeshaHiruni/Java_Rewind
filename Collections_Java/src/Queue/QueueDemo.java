package Queue;
import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> p1 = new PriorityQueue<String>();
        p1.add("Orange");
        p1.add("Banana");
        p1.add("Cucumber");
        p1.add("Pineapple");

        System.out.println(p1);

        // the first element of the queue
        System.out.println(p1.peek());
        System.out.println(p1.element());

        //remove
        p1.remove();
        System.out.println(p1);
    }

}
