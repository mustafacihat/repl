package variables;

import java.util.Scanner;

public class VariablesAddNumbers {
	public static void main(String[] args) {
		 //WRITE YOUR CODE HERE:
	    
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter 3 numbers:");
	    int sum = in.nextInt();
	    sum += in.nextInt();
	    sum += in.nextInt();

	    System.out.println("Sum of numbers: " + sum);
	}

}
