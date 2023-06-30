import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(); /**Ask user for input */

        int integer = in.nextInt();
        int total = integer * integer;
        System.out.println(total); /**Print total */
    }
}