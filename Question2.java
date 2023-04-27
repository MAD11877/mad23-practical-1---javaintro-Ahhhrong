import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
    Scanner in = new Scanner(System.in);

    System.out.println("What is your Weight?");

    double weight = in.nextDouble();
    System.out.println("What is your Height?");

    double height = in.nextDouble();
    double result =weight/(height*height);
    System.out.println(result);

  }
}
