import java.util.List;

public class Task {

    public void stutter(List<String> list) {
        for (int i = 0; i < list.size(); i = i + 2) {
            list.add(i + 1, list.get(i));
        }
    }
}