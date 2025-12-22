import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String a = "have a nice day";

        List<String> list = List.of(a.split(" "));
        String max = " ";

        for (String item : list) {
            if (item.length() >= max.length()) {

                max = item;
            }
        }
        System.out.println(list);
        System.out.println(max);

    }
}