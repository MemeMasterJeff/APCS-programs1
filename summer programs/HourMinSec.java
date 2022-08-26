import java.util.Scanner;

public class HourMinSec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hour, min, sec;
        int in;

        System.out.println("enter num of seconds: ");
        in = input.nextInt();

        hour = in / 3600;
        min = (in % 3600) / 60;
        sec = in % 60;

        System.out.println(in + " seconds converts to\nhours: " + hour + "\nmin: " + min + "\nsec: " + sec);
    }
}
