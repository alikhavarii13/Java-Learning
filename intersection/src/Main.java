import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> a = List.of(4, 2, 1, 6);
        List<Integer> b = List.of(3, 6, 9, 2, 10);
        System.out.println(intersection(a, b));
    }

    public static List<Integer> intersection(List<Integer> listA, List<Integer> listB) {

        HashSet<Integer> setA = new HashSet<>(listA);
        List<Integer> result = new ArrayList<>();

        for (int elements : listB) {

            if (setA.contains(elements)) {

                result.add(elements);

            }

        }

        return result;
    }
}



