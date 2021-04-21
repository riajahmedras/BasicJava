
package basicjava;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        int num;
        System.out.print("Enter a number = ");
        
        num = input.nextInt();
        if(num>0){
            System.out.println("You entered a positive number!");
        }
        else if(num<0){
            System.out.println("Sorry, You entered a negetive number");
        }
        else{
            System.out.println("Hey, you write 0  !!");
        }
        
    }
}
