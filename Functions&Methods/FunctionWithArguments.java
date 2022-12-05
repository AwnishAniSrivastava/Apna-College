package Function;

import java.util.Scanner;

public class FunctionWithArguments {
    public static void calculator(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number ");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Sum is "+sum);
        sc.close();
    }
    public static void main(String[] args) {
        calculator();
    }
}
