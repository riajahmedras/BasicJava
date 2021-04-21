/**
 * 1^2 * 2^2 * 3^2 *...........* n^2
 */
package basicjava;

import java.util.Scanner;


public class Series09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n, result = 1;
    
        System.out.print("Enter a number:  ");
        n = input.nextInt();
        
        for (long i = 1; i <= n; i++) {
            
            result = result * i*i;
            System.out.print(i+"x"+i+", ");
        }
        System.out.println("\n\n Result of "+ (int)n+"th  number:  "+result+"\n");
    
    }
}
