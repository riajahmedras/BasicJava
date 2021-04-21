/**
 * 1^2 + 2^2 + 3^2 +...........n^2
 */
package basicjava;

import java.util.Scanner;


public class Series05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sum = 0;
    
        System.out.print("Enter a number:  ");
        n = input.nextInt();
        
        for (int i = 1; i <= n; i++) {
            
            sum = sum + i*i;
            System.out.print(i+"x"+i+", ");
        }
        System.out.println("\n\nSum of "+ (int)n+"th  number:  "+sum+"\n");
    
    }
    
    
}
