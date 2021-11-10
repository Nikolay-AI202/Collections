import java.util.List;

public class Task {

    public void removeDuplicates(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.size() > i + 1) {
                if (list.get(i).compareTo(list.get(i + 1)) == 0) {
                    list.remove(i);
                    i--;
                }
            }
        }
    }
}