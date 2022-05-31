public class ConvertMinutesIntoSeconds {
    public static void main(String[] args) {
        System.out.println(convertMinutesToSeconds(7));
    }

    public static int convertMinutesToSeconds(int minutes) {
        return minutes * 60;
    }
}