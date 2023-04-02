package lab2;

import javax.swing.*;
import java.awt.*;

public class ProgrammingProject_2_4 {
//"The intersection method computes the intersection of two rectangles—that is,
// the rectangle that would be formed by two overlapping rectangles if they were drawn, as shown at right.
//You call this method as follows:
//Rectangle r3 = r1.intersection(r2);
//Write a program IntersectionPrinter that constructs two rectangle objects,
//prints them as described in Exercise •• P2.1, and then prints the rectangle object that describes the intersection.
//Then the program should print the result of the intersection method when the rectangles do not overlap.
// Add a comment to your program that explains how you can tell whether the resulting rectangle is empty."
    public static void main(String[] args)
    {

        // TODO: Create and configure a JFrame object here
        JFrame frame = new JFrame();
        frame.setSize(300, 400);
        frame.setTitle("Exercise_2_21");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // TODO: Add a IntersectionDrawer object to the JFrame (see the nested class definition below)
        IntersectionDrawer component = new IntersectionDrawer();
        frame.add(component);

        frame.setVisible(true);
    }

    private static class IntersectionDrawer extends JComponent
    {
        public void paintComponent(Graphics g)
        {
            Graphics2D g2 = (Graphics2D) g; // Cast the Graphics parameter into a Graphics2D object

            // TODO: Add code here that draws 2 rectangles AND highlights their intersection


            // Construct a rectangle and draw it
            Rectangle box1 = new Rectangle(5, 10, 200, 120);
            g2.draw(box1);

            Rectangle box2 = new Rectangle(50, 50, 100, 200);
            g2.draw(box2);
            Rectangle box3 = new Rectangle((Rectangle) box1.createIntersection(box2));
            g2.setColor(Color.magenta);
            g2.draw(box3);
            g2.fill(box3);
            // Draw moved rectangle


        }
    }
}
