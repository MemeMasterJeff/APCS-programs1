//William Wang
//8-14-22
//2.4 program

import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double temp;

        System.out.println("enter premature in F: ");
        temp = input.nextDouble();
        System.out.println(temp + " in C is: " + ((temp - 32) * (5.0 / 9)));
    }
}
