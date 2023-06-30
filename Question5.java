import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Question5 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(); 
        Scanner in = new Scanner(System.in);
        System.out.println();
        int tries = in.nextInt(); /**number of times user enters number */
        
        while (tries > 0) {
            System.out.println();
            int num = in.nextInt();
            integerList.add(num);
            tries--;
        }/** number of times to print for user input and storing in list*/
        
        int max = 0;
        int mode = 0;
        for (int i = 0; i < integerList.size(); i++) {
            int count = 0;
                for (int j = 0; j < integerList.size(); j++) {
                    if (integerList.get(i) == integerList.get(j)){
                    count++;
                    }
                }
            if (count >= max){
                max = count;
                mode = integerList.get(i);
            }
        }
        System.out.println(mode);
    }
}