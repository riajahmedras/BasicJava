/**
 * 1+2+2+.............+n
 */
package basicjava;

import java.util.Scanner;


public class Series01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sum = 0;
    
        System.out.print("Enter a number: ");
        n = input.nextInt();
        
        for (int i = 1; i <= n; i++) {
            
            sum = sum + i;
            System.out.print(i+", ");
        }
        System.out.println("\nSum of n-th number: "+sum);
    
    }
    
    
}
