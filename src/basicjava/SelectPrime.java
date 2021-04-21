/*
 * Select Prime form multiple numbers.
 */
package basicjava;

import java.util.Scanner;

public class SelectPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int s, e, count=0, totalPrime=0;
        System.out.print("Enter starting Numbers ");
        s = input.nextInt();
        
        System.out.print("Enter starting Numbers ");
        e = input.nextInt();
        
        for (int i = s; i < e; i++) {
            for (int j = 2; j < i; j++) {
                if (i%j==0) {
                    count++;
                    break;
                }
            }
            if (count==0) {
                System.out.println(i);
                totalPrime++;
            }
            count=0;
        }
        System.out.println("Total Prime Number "+totalPrime);
    }
}
