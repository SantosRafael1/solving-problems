import java.util.Scanner;

//SRV college wants to recognize the department which has succeeded 
//in getting the maximum number of placements for this academic year. 
//The departments that have participated in the recruitment 
//drive are CSE,ECE, MECH. Help the college find the department getting maximum placements.
//Check for all the possible output given in the sample snapshot


public class HighestPlacement {

    static Scanner scanner;

    public static void main(String[] args) {
        
        scanner = new Scanner(System.in);
        
        System.out.print("Number of students placed in CSE: ");
        int cseStudents = Integer.parseInt(scanner.nextLine());

        System.out.print("Number of students placed in ECE: ");
        int eceStudents = Integer.parseInt(scanner.nextLine());

        System.out.print("Number of student in MECH: ");
        int mechStudents = Integer.parseInt(scanner.nextLine());

        if(cseStudents < 0 || eceStudents < 0 || mechStudents < 0) {
            System.out.println("Input is invalid!");
        } else if(cseStudents == eceStudents && cseStudents == mechStudents && eceStudents == mechStudents) {
            System.out.println("None of the department has got the highest placement!");
        }

        else if(cseStudents == eceStudents) {
            System.out.println("CSE");
            System.out.println("ECE");
        } else if(mechStudents == cseStudents) {
            System.out.println("MECH");
            System.out.println("CSE");
        } else if(eceStudents == mechStudents) {
            System.out.println("ECE");
            System.out.println("MECH");
        }
        
        else if(cseStudents > eceStudents && cseStudents > mechStudents) {
            System.out.println("Highest departament: CSE");
        } else if(eceStudents > cseStudents && eceStudents > mechStudents) {
            System.out.println("Highest department: ECE");
        } else if(mechStudents > cseStudents && mechStudents > eceStudents) {
            System.out.println("Highest department: MECH");
        }

    }
}