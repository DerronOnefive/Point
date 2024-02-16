/**
 * Author Derron
 * ClassName NamedMultipointTester
 * 2/15/2024
 * Version 1.0
 */

import java.util.Scanner;

public class NamedMultipointTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NamedPoint[] points = new NamedPoint[6];

        System.out.println("Enter 6 points with names and x, y coordinates: ");
        for (int i = 0; i < 6; i++) {
            System.out.print("Point " + (char) ('a' + i) + " (name x y): ");
            String name = scanner.next();
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            points[i] = new NamedPoint(x, y, name);
        }

        double minDistance = Double.MAX_VALUE;
        NamedPoint point1 = null, point2 = null;

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = Point.distance(points[i], points[j]);
                if (distance < minDistance) {
                    minDistance = distance;
                    point1 = points[i];
                    point2 = points[j];
                }
            }
        }

        System.out.println("The shortest distance between two points is: ");
        System.out.println(point1 + " and " + point2 + " with a distance of " + minDistance);
    }
}
