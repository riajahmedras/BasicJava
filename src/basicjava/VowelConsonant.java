
package basicjava;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Enter  a Character = ");
        ch = input.next().charAt(0);
        
        if(ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' 
                || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || 
                ch == 'u'){
            System.out.println("Your first charecter a Vowel !");
        }
        else if(ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9' ){
            System.out.println("First letter is a Number!");
        }
        else{
            System.out.println("Your first charecter a Consonant!");
        }
    }
}
