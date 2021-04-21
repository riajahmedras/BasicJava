
package basicjava;

import java.util.Scanner;


public class InputDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //int number;
        
        //System.out.print("Write your age = ");
        
        //number = input.nextInt();
        
        //System.out.println("Your age is "+number);
        /*
        String name;
        System.out.print("Enter your name =");
        name = input.nextLine();
        System.out.println("Welcome, "+name);
        */
        double num;
        System.out.print("Enter a double Number = ");
        num = input.nextDouble();
        System.out.println("You Entered "+num);
        
    }
}
