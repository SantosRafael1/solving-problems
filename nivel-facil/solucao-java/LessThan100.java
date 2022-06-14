
//Criar um método que retorna true se a soma de dois números é menor que 100

public class LessThan100 {
    public static void main(String[] args) {
        System.out.println(sumNumbers(83, 34));
    }

    public static boolean sumNumbers(int n1, int n2) {
        int sum = n1 + n2;
        return sum < 100;
    }
}