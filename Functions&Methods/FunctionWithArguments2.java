package Function;

import java.util.Scanner;

public class FunctionWithArguments2 {
    public static int calculator(int num1, int num2){
         int sum=num1+num2;
         return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number");
        int b=sc.nextInt();
        int sum1=calculator(a,b);
        System.out.println("sum is "+sum1);
        sc.close();
    }
}
