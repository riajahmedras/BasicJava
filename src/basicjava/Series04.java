/**
 * 1.5+2.5+3.5+............n
 */
package basicjava;

import java.util.Scanner;


public class Series04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n, sum = 0;
    
        System.out.print("Enter a number:  ");
        n = input.nextDouble();
        
        for (double i = 1.5; i <= n; i++) {
            
            sum = sum + i;
            System.out.print(i+", ");
        }
        System.out.println("\nSum of "+ (int)n+"th  number:  "+sum);
    
    }
    
    
}
