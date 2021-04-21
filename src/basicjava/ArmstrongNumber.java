/**
 * Armstrong Number.
 * 153 => 1*1*1 + 5*5*5 + 3*3*3 = 153
 */
package basicjava;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r, num, temp, result=0;
        System.out.print("Enter a number = ");
        num = input.nextInt();
        
        temp = num;
        
        while(temp !=0){
            r = temp%10;
            result = result + r*r*r;
            temp = temp/10;
        }
        if (result == num) {
            System.out.println(num+" is an Armstrong Number");
        }
        else{
            System.out.println(num+" is Not an Armstrong Number");
        }
    }
}
