/*
 * Sum of Array.
 */
package Array;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] num = new int[6];
        int sum = 0;
        System.out.print("Enter Five Numbers = ");
        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        System.out.println("Sum of the array = "+sum);
    }
}
