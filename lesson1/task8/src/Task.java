import java.util.*;
import java.util.stream.Collectors;

public class Task {

    public void rearrange(Queue<Integer> queue) {
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < queue.size() + deque.size(); i++) {
            int element = queue.poll();
            if (element % 2 == 0) {
                queue.add(element);
            } else {
                deque.add(element);
            }
        }
        queue.addAll(deque);
    }
}