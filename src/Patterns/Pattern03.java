package Patterns;
import java.util.Scanner;
public class Pattern03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a number : ");
        int n = input.nextInt();
        
        for (int row = n; row >=1; row--) {
            for (int col = row; col >= 1; col--) {
                System.out.print(" "+col);
               
            }
            System.out.println();
        }
    }
    
}
