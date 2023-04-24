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
    System.out.println("What is your Weight?");

    Scanner in = new Scanner(System.in);
    double weight = in.nextDouble();
    System.out.println("What is your Height?");

    Scanner in = new Scanner(System.in);
    double height = in.nextDouble();
    System.out.println(weight/(height*height));

  }
}
