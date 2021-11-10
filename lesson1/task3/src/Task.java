import java.util.Collections;
import java.util.List;

public class Task {

    public void switchPairs(List<String> list) {
        for (int i = 0; i < list.size() - 1 ; i = i + 2) {
            Collections.swap(list, i, i + 1);
        }
    }
}