import java.util.Scanner;

//Ruya’s teacher gave her the assignment to practice the spelling of “RAINBOW”.
//Ruya’s mother helped her in
//doing this by spelling each letter as Ruya wrote it in her notebook. 
//If Ruya writes wrong spelling her mother should say “The spelling is wrong”

public class SpellCheck {
    public static void main(String[] args) {
        spellCheck();
    }

    public static void spellCheck() {

        try (Scanner scanner = new Scanner(System.in);){

            int flag = 0;

            System.out.print("Enter first letter: ");
                {if(scanner.next().charAt(0) != 'R')
                flag++;

            System.out.print("Enter second letter: ");
                if(scanner.next().charAt(0) != 'A') flag++;

            System.out.print("Enter third letter: ");
                if(scanner.next().charAt(0) != 'I') flag++;

            System.out.print("Enter fourth letter: ");
                if(scanner.next().charAt(0) != 'N') flag++;

            System.out.print("Enter fifth letter: ");
                if(scanner.next().charAt(0) != 'B') flag++;

            System.out.print("Enter sixth letter: ");
                if(scanner.next().charAt(0) != 'O') flag++;

            System.out.print("Enter seventh letter: ");
                if(scanner.next().charAt(0) != 'W') flag++;
            }        
            
            if(flag == 0) {
                System.out.println("RAINBOW");
            } else {
                System.out.println("The spelling is wrong!");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        

    }
}