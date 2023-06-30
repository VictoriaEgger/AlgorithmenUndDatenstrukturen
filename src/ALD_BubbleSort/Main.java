package ALD_BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {4, 3, 10, 49, 1, 3, 5, 9};

        BubbleSorter bs = new BubbleSorter();


        System.out.println(Arrays.toString(numbers));
        System.out.println("Nummern werden sotiert");
        bs.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
