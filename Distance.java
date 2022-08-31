//William Wang
//8-14-22
//2.8 program

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x, y, a, b;
        double distance;

        System.out.println("Enter coordinates: (x, y, a, b)");
        x = input.nextDouble();
        y = input.nextDouble();
        a = input.nextDouble();
        b = input.nextDouble();

        distance = Math.sqrt(Math.abs(Math.pow(x - a, 2) + Math.pow(y - b, 2)));
        System.out.println(distance);
    }
}
