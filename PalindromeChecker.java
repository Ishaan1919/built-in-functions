import java.util.Scanner;

public class PalindromeChecker{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the String to check if it is a palindrome: ");
		String str = input.next();
		boolean res = checkPalindrome(str);
		
		if(res){
			System.out.printf("The string %s is a palindrome", str);
		}
		else{
			System.out.printf("The String %s is not a palindrome", str);
		}
		input.close();

        // Enter the String to check if it is a palindrome: helloolleh
        // The string helloolleh is a palindrome
	}
	
	public static boolean checkPalindrome(String str){
		int len = str.length();
		int i=0;
		int j=len-1;
		while(i<j){
			if(str.charAt(i++)!=str.charAt(j--)){
				return false;
			}
		}
		return true;
	}
}