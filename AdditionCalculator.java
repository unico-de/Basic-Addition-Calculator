import java.util.Scanner;

public class AdditionCalculator {

	public static void main(String[] args) {
		Scanner DigitsInput = new Scanner(System.in); // Create Scanner Collects Text Input
		double firstDigit;
		double secondDigit;
		double answer;
		
		// asking for numbers to add

				
		System.out.println("Enter first number: ");
		firstDigit = DigitsInput.nextDouble();
		System.out.println("Enter second number: ");
		secondDigit = DigitsInput.nextDouble();
		
		
		answer = firstDigit + secondDigit; // add both numbers
		System.out.println(answer); // output answer
		

	}

}
