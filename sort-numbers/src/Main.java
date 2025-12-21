import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 1, 0};
        sortNumbers(numbers);
    }

    public static void sortNumbers(int[] numbers) {
        int temp = 0;
        boolean swapped;
        System.out.println(Arrays.toString(numbers));
        if (numbers.length == 0) {
            System.out.println("Add numbers and try again");
        }
        for (int i = 0; i < numbers.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    swapped = true;
                    System.out.println(Arrays.toString(numbers));
                }
            }
        }
    }
}