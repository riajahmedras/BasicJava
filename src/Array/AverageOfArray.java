/*
 * Average of Array
 */

package Array;
import java.util.Scanner;
public class AverageOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] number = new int[5];
        // for receive numbers from users.
        System.out.print("Enter five numbers: ");
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextInt();
        }
        int sum =0;
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        System.out.println("Average of the Array: "+(double)sum/5);
        // Maximum Number
        double max = number[0];
        for (int i = 1; i < number.length; i++) {
            if (max<number[i]) {
                max = number[i];
            }
        }
        System.out.println("Maximum Number "+max);
        
        // Minimum Number
        double min = number[0];
        for (int i = 1; i < number.length; i++) {
            if (min>number[i]) {
                min = number[i];
            }
        }
        System.out.println("Minimum Number "+min);
    }
}
