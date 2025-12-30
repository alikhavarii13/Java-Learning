import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(pairSum(List.of(4, 7, 9, 2, 5, 1), 5));

    }

    public static List<Integer> pairSum(List<Integer> numbers, int target) {
        HashMap<Integer, Integer> previousNums = new HashMap<>();
        for (int i = 0; i < numbers.size(); i += 1) {
            int num = numbers.get(i);
            int complement = target - num;
            if (previousNums.containsKey(complement)) {
                return List.of(previousNums.get(complement), i);
            }
            previousNums.put(num, i);
        }
        return null;
    }

}