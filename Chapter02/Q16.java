package odevler.chapter02.Chapter02;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        double area = ((3 * Math.sqrt(3) * Math.pow(side, 2)) / 2);
        System.out.println("The area of the hexagon is " + area);
    }
}
