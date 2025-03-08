import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        boolean res = primeNumberChecker(num);
        if(res){
            System.out.println("The number is a prime number");
        }
        else{
            System.out.println("The number is not a prime number");
        }
        input.close();

        // Enter a number: 17
        // The number is a prime number
    }

    public static boolean primeNumberChecker(int num){
        for(int i=2;i<num;i++){
            if(num%i==0) return false;
        }
        return true;
    }
}