
package basicjava;

import java.util.Scanner;

public class ArithmaticOperator {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double x, y, result;
        System.out.print("X = ");
        x = input.nextInt();
        //x = 5;
        //y = 3;
        
        
        System.out.print("Y = ");
        y = input.nextInt();
        
        
        
        result = x +y;
        System.out.println("x +y = "+result);
        
        result = x - y;
        System.out.println("x - y = "+result);
        
        result = x * y;
        System.out.println("x * y = "+result);
        
        result = x / y;
        System.out.println("x/y = "+result);
        
        result = x % y;
        System.out.println("x%y = "+result);
    }
}
