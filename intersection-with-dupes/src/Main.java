import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    private static HashMap<String, Integer> eleCount(List<String> elements) {
        HashMap<String, Integer> count = new HashMap<>();

        for (String ele : elements) {
            if (!count.containsKey(ele)) {
                count.put(ele, 0);
            }
            count.put(ele, count.get(ele) + 1);
        }
        return count;
    }

    public static List<String> intersectionWithDupes(List<String> listA, List<String> listB) {

        List<String> result = new ArrayList<>();
        HashMap<String, Integer> countA = eleCount(listA);
        HashMap<String, Integer> countB = eleCount(listB);
        for (String ele : countA.keySet()) {
            if (countB.containsKey(ele)) {
                for (int i = 0; i < Math.min(countA.get(ele), countB.get(ele)); i += 1) {
                    result.add(ele);
                }
            }
        }
        return result;
    }
}
