import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to generate Fibonacci Sequence: ");
		int number = input.nextInt();
		int[] arr = generateFibonacciSequence(number);
		print(arr);
		input.close();
    }
	
	public static void print(int[] arr){
		for(int i:arr){
			System.out.print(i + " ");
		}
	}
	
	public static int[] generateFibonacciSequence(int num){
		if(num==0){
			return new int[]{};
		}
		else if(num==1){
			return new int[]{0};
		}
		else if(num==2){
			return new int[]{0,1};
		}
		int[] res = new int[num];
		res[1] = 1;
		for(int i=2;i<num;i++){
			res[i] = res[i-1]+res[i-2];
		}
		return res;
	}
}