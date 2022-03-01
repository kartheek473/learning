package calculator;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		int num1, num2;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		num1 = in.nextInt();
		
		System.out.println("Enter 2st number: ");
		num2 = in.nextInt();
		
		System.out.println("Sum = "+(num1+num2));
		System.out.println("Subtraction = "+(num1-num2));
		System.out.println("multiplication = "+(num1*num2));
		System.out.println("division = "+(num1/num2));
	}

}
