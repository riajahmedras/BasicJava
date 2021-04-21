/**
 * Check Palindrome Number or Not
 * 121 => 121 
 * Same number though reverse
 */
package basicjava;

import java.util.Scanner;

public class IsPalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer ");
        int num, r, temp, result = 0;
        num = input.nextInt();
        
        temp = num;
        
        while(temp != 0){
            r = temp%10;
            result = result *10 + r;
            temp =temp/10;
        }
        if (result==num) {
            System.out.println("Palindrome Number");
        }else{
            System.out.println("Oh! Not Palindrome");
        }
        //System.out.println("\nReverse of "+num+" is "+result+"\n");
    }
}



