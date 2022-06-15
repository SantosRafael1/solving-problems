
public class DivisibleByFive {
    public static void main(String[] args) {
        System.out.println(isDivibleByFive(37));
    }

    public static boolean isDivibleByFive(int number) {
        boolean result = number % 5 == 0;
        return result;
    }
}