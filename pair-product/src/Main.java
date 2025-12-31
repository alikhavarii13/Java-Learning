import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(pairProduct(List.of(3, 2, 5, 4, 1), 8));
    }

    public static List<Integer> pairProduct(List<Integer> numbers, int target) {


        HashMap<Integer, Integer> previousProduct = new HashMap<>();
        for (int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);
            int complement = target / num;

            if (previousProduct.containsKey(complement)) {
                return List.of(previousProduct.get(complement), i);

            }
            previousProduct.put(num, i);
        }
        return numbers;
    }
}