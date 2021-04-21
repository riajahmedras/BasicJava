
package basicjava;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter a number = ");
        num = input.nextInt();
        if(num%2 == 0){
            System.out.println("It is an Even Number");
        }
        else{
            System.out.println("It is an odd Number");
        }
    }
}
