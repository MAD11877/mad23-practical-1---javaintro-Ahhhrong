import java.util.Scanner;

class Question4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println();
        double num = in.nextDouble();

        for(double i = num;i > 0; i--)
        {
           for(int j = 0; j < i; j++)
           {
               System.out.print("*");
           }
           System.out.println();
        }
    }
}