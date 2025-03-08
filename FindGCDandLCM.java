import java.util.Scanner;

public class FindGCDandLCM{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter the second number: ");
		int num2 = input.nextInt();
		
		int gcd = getGCD(num1,num2);
		int lcm = getLCM(num1,num2,gcd);
		
		System.out.printf("GCD of %d and %d is %d",num1,num2,gcd);
		System.out.printf("\nLCM of %d and %d is %d",num1,num2,lcm);
        input.close();

        // Enter the first number: 34
        // Enter the second number: 45
        // GCD of 34 and 45 is 1
        // LCM of 34 and 45 is 1530
	}
	
	public static int getLCM(int num1, int num2, int gcd){
		return (num1*num2)/gcd;
	}
	
	public static int getGCD(int num1, int num2){
		if(num1<num2){
			int temp = num1;
			num1=num2;
			num2=temp;
		}
		while(num2!=0){
			int temp = num2;
			num2 = num1%num2;
			num1 = temp;
		}
		return num1;
	}
}