
public class PerimeterOfRetangle {
    public static void main(String[] args) {
        System.out.println(findPerimeterOfRetangle(6, 7));
    }

    public static int findPerimeterOfRetangle(int length, int width) {
        return length + length + width + width;
    }
}