
public class MaxEdgeOfTriangle{
    public static void main(String[] args) {
        System.out.println(nextEdge(8, 10));
    }

    public static int nextEdge(int side1, int side2) {
        return (side1 + side2) - 1;
    }
}