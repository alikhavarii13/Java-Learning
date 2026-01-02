import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        List<Integer> a = List.of(4, 2, 1, 6);
        List<Integer> b = List.of(3, 6, 9, 2, 10);
        System.out.println(exclusiveItems(a, b));

    }

    public static List<Integer> exclusiveItems(List<Integer> a, List<Integer> b) {
        Set<Integer> setA = new HashSet<>(a);
        Set<Integer> setB = new HashSet<>(b);
        List<Integer> result = new ArrayList<>();

        for (int elements : a) {
            if (!setB.contains(elements)) {
                result.add(elements);
            }
        }

        for (int elements : b) {
            if (!setA.contains(elements)) {
                result.add(elements);
            }
        }

        return result;
    }
}
