import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(mostFrequentChar("AAlii"));

    }
    private static HashMap<Character, Integer> charCount(String s) {
        HashMap<Character, Integer> count = new HashMap<>();
        System.out.println(s.toCharArray());
        for (char c : s.toCharArray()) {
            if (count.get(c) == null) {
                count.put(c, 0);
            }
            count.put(c, count.get(c) + 1);
        }
        return count;
    }
    public static char mostFrequentChar(String s) {
        HashMap<Character, Integer> count = charCount(s);
        char mostFrequent = '\0';
        for (char c : s.toCharArray()) {
            if (mostFrequent == '\0' || count.get(c) > count.get(mostFrequent)) {
                mostFrequent = c;
            }
        }
        return mostFrequent;
    }
}