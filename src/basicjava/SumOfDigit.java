/**
 * Sum of Digits
 * Like 136 = 1+3+6 =10
 */
package basicjava;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, num, temp, r;
        System.out.print("Enter a Number: ");
        num = input.nextInt();
        
        temp = num;
        while(temp !=0){
            r = temp%10;
            sum = sum + r;
            temp = temp/10;
            
        }
        System.out.println("Sum of the digits "+sum);
        
    }
  
}
