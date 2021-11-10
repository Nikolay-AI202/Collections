import java.util.List;

public class Task {

    public void removeShorterStrings(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.size() > i + 1) {
                if (list.get(i).length() <= list.get(i + 1).length()) {
                    list.remove(i);
                } else if (list.get(i).length() > list.get(i + 1).length()) {
                    list.remove(i + 1);
                }
            }
        }
    }
}