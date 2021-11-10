import java.util.*;
import java.util.stream.Collectors;

public class Task {
    public void reorder(Queue<Integer> queue) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        while (queue.size() > 0) {
            if (queue.peek() < 0){
                deque.addFirst(queue.poll());
            }
            else {
                deque.addLast(queue.poll());
            }
        }
        queue.addAll(deque);
    }
}