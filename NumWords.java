// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	// Replace this comment with your code
	int number = Integer.parseInt(args[0]);
	int hundreds =  number % 1000 / 100;
	int tens = (number % 100) / 10;
	int ones = (number % 10);
	System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones");

	}
}
