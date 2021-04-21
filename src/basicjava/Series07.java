/**
 * 1x3x5x.............x n
 */
package basicjava;

import java.util.Scanner;


public class Series07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, result = 1;
    
        System.out.print("Enter a number: ");
        n = input.nextInt();
        
        for (int i = 1; i <= n; i=i+2) {
            
            result = result * i;
            System.out.print(i+", ");
        }
        System.out.println("\n Result of n-th number: "+result);
    
    }
    
    
}
