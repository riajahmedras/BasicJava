/*
 * Prime Number or Not!
 */
package basicjava;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, count = 0;
        System.out.print("Enter a number ");
        num = input.nextInt();
        
        for (int i = 2; i < num; i++) {
            if (num%i==0) {
               count++;
              // break;
            }
            
        } // After for loop
        if (count == 0) {
                System.out.println("Prime Number");
        }else{
            System.out.println("Not a Prime Number");
        }
        
        //System.out.println((num-(num%2))/2);
        
    }
}
