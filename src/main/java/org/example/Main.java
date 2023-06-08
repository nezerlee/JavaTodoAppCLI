package org.example;
import java.util.Arrays;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        int[] copyOfNumbers = Arrays.copyOf(numbers, 10);

        Arrays.fill(numbers, 1);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(copyOfNumbers));

    }
}