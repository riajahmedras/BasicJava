/*
 * Factorial
 */
package basicjava;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fact = 1, num;
        
        System.out.print("Enter a Number: ");
        num = input.nextInt();
        
        for (int i = num; i >= 1; i--) {
            fact = fact * i;
            System.out.print(i+", ");
            
        }
        System.out.println("\n"+num+"! = "+fact);
    }
}
