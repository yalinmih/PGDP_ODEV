package odevler.chapter02.Chapter03;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        if (inCircle(x, y)) {
            System.out.println("Point " + "(" + x + ", " + y + ") is in the circle");
        } else {
            System.out.println("Point " + "(" + x + ", " + y + ") is not in the circle");
        }
    }
    public static boolean inCircle(double x, double y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) <= 10;
    }
}
