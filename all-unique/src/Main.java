import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println(allUnique(List.of("q", "r", "s", "a")));
    }

    public static boolean allUnique(List<String> items) {

        Set<String> uniqueItems = new HashSet<>(items);

        return uniqueItems.size() == items.size();
    }
}
