//Create a function that takes two numbers as arguments (num, length)
// and returns an array of multiples of num until the array length reaches length.

import java.util.Arrays;

public class ArrayOfMultiples {
    public static void main(String[] args) {
        System.out.println((Arrays.toString(arrayOfMultiple(7, 5))));
        System.out.println((Arrays.toString(arrayOfMultiple(12, 10))));
        System.out.println((Arrays.toString(arrayOfMultiple(17, 6))));
    }

    public static int[] arrayOfMultiple(int number, int len) {
        int[] arr = new int[len];

        for(int i = 1; i < arr.length; i++) {
            arr[i] = (number * i); //O array começa o calculo no 2° index, não entendi porquê.
        }

        return arr;
    }
}