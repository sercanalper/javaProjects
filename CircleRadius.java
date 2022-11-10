/* [Patika.dev](https://www.patika.dev/tr)
https://app.patika.dev/sercanalper */

import java.util.Scanner;

public class CircleRadius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double radius, angle, circlePermeter, circleArea, circleSegmentArea;

        System.out.println("Please enter the radius: ");
        radius = input.nextDouble();

        System.out.println("Please enter the angle: ");
        angle = input.nextDouble();

        circlePermeter = 2 * Math.PI * radius;
        circleArea = Math.PI * radius * radius;
        circleSegmentArea = (Math.PI * (radius * radius) * angle) / 360;

        System.out.println("Permeter of Circle is " + circlePermeter);
        System.out.println("Area of Circle is " + circleArea);
        System.out.println("Area of the Circle Segment is " +circleSegmentArea);
    }
}