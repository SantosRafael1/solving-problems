public class AreTheNumbersEqual {
    public static void main(String[] args) {
        System.out.println(areNumbersEqual(3, 4));
        System.out.println(areNumbersEqual(8, 8));
    }

    private static boolean areNumbersEqual(int number1, int number2) {
        boolean result = number1 == number2;
        return result;
    }
}