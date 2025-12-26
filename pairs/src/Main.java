import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println(pairs(List.of("a", "b", "c")));

    }

    public static List<List<String>> pairs(List<String> elements) {

        ArrayList<List<String>> result = new ArrayList<>();

        for (int i = 0; i < elements.size(); i++) {


            for (int j = i + 1; j < elements.size(); j++) {

                List<String> pair = List.of(elements.get(i), elements.get(j));

                result.add(pair);

            }

        }

        return result;
    }

}