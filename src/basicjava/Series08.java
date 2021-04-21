/**
 * 1.5+2.5+3.5+............n
 */
package basicjava;

import java.util.Scanner;


public class Series08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n, result = 1;
    
        System.out.print("Enter a number:  ");
        n = input.nextDouble();
        
        for (double i = 1.5; i <= n; i++) {
            
            result = result * i;
            System.out.print(i+", ");
        }
        System.out.println("\n Result of "+ (int)n+"th  number:  "+result);
    
    }
    
    
}
