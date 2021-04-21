import java.util.Scanner;

// Java Program to Calculate Sum of Odd Numbers using for loop


public class Programm04 {
	public static void main(String[] args) 
	{
		int e, i, s, oddSum = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Please Enter Staring Number : ");
		s = input.nextInt();
                
		System.out.print(" Please Enter Ending Number : ");
		e = input.nextInt();	
		
		for(i = s; i <= e; i++)
		{
			if(i % 2 != 0)
			{
				oddSum = oddSum + i; 
                                // To show the odd numbers
                                System.out.print(i+"\t" );
			}
		}
                
		System.out.println("\n The Sum of Odd Numbers upto " + e + "  =  " + oddSum);
	}
}