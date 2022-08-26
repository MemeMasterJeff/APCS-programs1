//William Wang
//8-14-22
//2.3 program

import java.util.Scanner;

public class FloatNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a, b;

        System.out.println("enter 2 floats: ");
        a = input.nextFloat();
        b = input.nextFloat();

        System.out.println("sum: " + (a + b));
        System.out.println("different: " + (a - b));
        System.out.println("product: " + (a * b));
        System.out.println("quotient: " + (a / b));
        System.out.println("remainder: " + (a % b));
        System.out.println("power: " + Math.pow(a, b));
    }
}
