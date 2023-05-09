import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the number of integers you want to enter: ");
    int numIntegers = input.nextInt();

    // Take numIntegers integers as input
    int[] integers = new int[numIntegers];
    for (int i = 0; i < numIntegers; i++) {
        System.out.print("Enter integer #" + (i + 1) + ": ");
        integers[i] = input.nextInt();
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i : integers) {
            if (frequencyMap.containsKey(i)) {
                frequencyMap.put(i, frequencyMap.get(i) + 1);
            } else {
                frequencyMap.put(i, 1);
            }
        }

        int mode = 0;
        int maxFrequency = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int frequency = entry.getValue();
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mode = entry.getKey();
            }
        }

        // Print out the mode of the integers
        System.out.println("The mode of the integers is: " + mode);
    }
  }
}
