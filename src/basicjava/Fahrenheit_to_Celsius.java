
package basicjava;

import java.util.Scanner;

public class Fahrenheit_to_Celsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit, celsius;
        System.out.print("Enter Fahrenheit = ");
        fahrenheit = input.nextDouble();
        
        celsius = (fahrenheit-32)/1.800;
        System.out.println(celsius);
    }
}
