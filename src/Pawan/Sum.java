package Pawan;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum2();
        sum3(12, 18);
    }

    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter the number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    static int sum3(int num1, int num2) {
        return num1 + num2;
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter the number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }
}
