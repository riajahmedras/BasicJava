/*
 * Fibonacci Numbers
 */
package basicjava;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number ");
        int n = input.nextInt();
        
        int first = 0, second = 1, fibo;
        
        System.out.print(first+" "+second); // First & second Number Print 0 1 
        for (int i = 3; i <= n; i++) {
            fibo = first + second; 
            System.out.print(" "+fibo); // Thirdly prind 1  (That is form 0+1)
            first = second;
            second = fibo;
        }
        System.out.println();
        
    }
}
