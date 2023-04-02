package lab2;

import java.awt.*;
import java.awt.geom.Point2D;

import static java.awt.geom.Point2D.distance;

public class PracticeExercise_2_15 {

    public static void main(String[] args) {
        //"Look at the API of the Point class and find out how to construct a Point object.
        // In a PointTester program, construct two points with coordinates (3, 4) and (–3, –4).
        // Find the distance between them, using the distance method.
        // Print the distance, as well as the expected value.
        // (Draw a sketch on graph paper to find the value you will expect.)"

        Point P1 = new Point(3,4);
        Point P2 = new Point(-3,-4);

        System.out.println("Distance is " + P1.distance(P2));


    }
}
