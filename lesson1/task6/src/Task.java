import java.util.*;

public class Task {

    public boolean isPalindrome(Queue<Integer> queue) {
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < queue.size(); i++) {
            deque.push(queue.poll());
        }
        if ((queue.size() + deque.size()) % 2 == 1 ) {
            deque.pop();
        }
        while (!queue.isEmpty()) {
            if (deque.pop() != queue.poll()){
                return false;
            }
        }
        return true;
    }

}