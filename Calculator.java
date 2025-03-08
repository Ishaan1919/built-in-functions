import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter the operator (+,-,*,/): ");
        char operator = input.next().charAt(0);

        if(operator=='+'){
            System.out.printf("The addition of %d and %d is %d",num1,num2,num1+num2);
        }
        else if(operator=='-'){
            System.out.printf("The substraction of %d and %d is %d",num1,num2,num1-num2);
        }
        else if(operator=='*'){
            System.out.printf("The multiplication of %d and %d is %d",num1,num2,num1*num2);
        }
        else if(operator=='/'){
            System.out.printf("The division of %d and %d is %.2f",num1,num2,(float)(num1/num2));
        }
        else{
            System.out.println("Please enter the correct operator");
        }
        input.close();
    }
}