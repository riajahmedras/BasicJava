/*
 * Print All the even numbers from m to n
 */
package basicjava;

import java.util.Scanner;

public class Programm03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int s, e;
        System.out.print("Enter Starting Number ");
        s = input.nextInt();
        
        System.out.print("Enter Starting Number ");
        e = input.nextInt();
        
        int sum = 0;
        for (int i = s; i <= e; i++) {
            if (i%2==0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
