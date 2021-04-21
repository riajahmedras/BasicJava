/*
 * Namta
 */
package basicjava;

import java.util.Scanner;

public class Namta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s, e, n;
        
        System.out.print("Enter a number = ");
        s = input.nextInt();
        
        System.out.print("Enter a number = ");
        e = input.nextInt();
        
        //System.out.println("Enter a number = ");
        //n = input.nextInt();
        
            for (int i = s; i <= e; i++) {

                for (int j = 1; j <=10; j++) {
                System.out.println(i+" x "+j+" = "+i*j);

            }
            System.out.println("\n");
        }
    }
}
