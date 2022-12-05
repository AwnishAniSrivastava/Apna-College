package Function;

import java.util.Scanner;

public class FunctionWithArguments1 {
    public static void calculator(int num1, int num2){
        int sum=num1+num2;
        System.out.println("Sum is "+sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number");
        int b=sc.nextInt();
        calculator(a,b);
        sc.close();
    }
}
