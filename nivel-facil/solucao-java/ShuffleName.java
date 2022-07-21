//Create a method that accepts a string (of a person's first and last name) 
//and returns a string with the first and last name swapped.
public class ShuffleName {
    public static void main(String[] args) {
        System.out.println(shuffle("Mickey", "Mouse"));
        System.out.println(shuffle("Rafael", "Santos"));
    }

    public static String shuffle(String firstName, String lastName) {
        return lastName + " " + firstName;
    }
}