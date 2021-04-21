// Print sum of all numbers from  s to e
package basicjava;

import java.util.Scanner;


public class Programms02 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        
        int s, e;
        
        System.out.print("Enter Start Number ");
        s = input.nextInt();
        System.out.print("Enter End Number ");
        e = input.nextInt();
        
        for (int i = s; i <= e; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        
    }
}
