/**
 * 1x2x2x.............x n
 */
package basicjava;
import java.util.Scanner;
public class Series06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, result = 1;
    
        System.out.print("Enter a number: ");
        n = input.nextInt();
        
        for (int i = 1; i <= n; i++) {
            
            result = result * i;
            System.out.print(i+", ");
        }
        System.out.println("\nSum of n-th number: "+result);
    } 
}
