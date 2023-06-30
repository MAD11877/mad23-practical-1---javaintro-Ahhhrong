import java.util.Scanner;

public class Question2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println(); /**Ask user for input */
        double height = in.nextDouble();

        System.out.println();
        double weight = in.nextDouble();

        double bmi = weight / (height * height);
        System.out.println(bmi);
    }
}