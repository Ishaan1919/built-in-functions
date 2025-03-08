import java.lang.Math;

public class MaximumNumber {
    public static void main(String[] args) {
        int num1 = getRandom();
        int num2 = getRandom();
        int num3 = getRandom();

        int max = getMax(num1,num2,num3);
        System.out.printf("The maximum number of the three numbers %d, %d, %d is %d", num1,num2,num3,max);
    }

    public static int getRandom(){
        return (int)(Math.random() * 100);
    }
    public static int getMax(int num1, int num2, int num3){
        return Math.max(num1,Math.max(num2,num3));
    }
}