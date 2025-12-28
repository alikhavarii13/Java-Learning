import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(anagrams("cats", "tocs"));

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

    public static boolean anagrams(String s1, String s2) {
        HashMap<Character, Integer> count1 = charCount(s1);
        HashMap<Character, Integer> count2 = charCount(s2);
        return count1.equals(count2);
    }
}

//Source.anagrams("restful", "fluster"); // -> true
//
//Source.anagrams("cats", "tocs"); // -> false
