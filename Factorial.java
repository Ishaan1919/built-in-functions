import java.util.Scanner;

public class Factorial{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number to get the factorial: ");
		int number = input.nextInt();
		
		int res = getFactorial(number);
		System.out.printf("Factorial for the number %d is %d", number, res);
		input.close();
        // Enter the number to get the factorial: 6
        // Factorial for the number 6 is 720
	}
	
	public static int getFactorial(int number){
		if(number == 1) return 1;
		return number * getFactorial(number-1);
	}
}