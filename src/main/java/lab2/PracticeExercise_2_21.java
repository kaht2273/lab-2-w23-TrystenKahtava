package lab2;

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;


public class PracticeExercise_2_21
{
    public static void main(String[] args)
    {
//"Write a graphics program that draws your name in red, contained inside a blue rectangle.
// Provide a class NameViewer and a class NameComponent."
        // TODO: Create and configure a JFrame object here
        JFrame frame = new JFrame();
        frame.setSize(300, 400);
        frame.setTitle("Exercise_2_21");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // TODO: Add a NameComponent object to the JFrame (see the nested class definition below)
        RectangleComponent component = new RectangleComponent();
        frame.add(component);

        frame.setVisible(true);
    }
    private static class RectangleComponent extends JComponent
    {
        public void paintComponent(Graphics g)
        {
            // TODO: Add code that that draws the name and rectangle as per the exercise instructions
            // Recover Graphics2D

            Graphics2D g2 = (Graphics2D) g;

            // Construct a rectangle and draw it
            Rectangle box = new Rectangle(25, 75, 100, 50);
            g2.setColor(Color.BLUE);
            g2.draw(box);
            g2.setColor(Color.RED);

            g2.drawString("Trysten", 50, 100);
        }
    }
}
