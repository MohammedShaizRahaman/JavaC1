import javax.swing.*;
import java.awt.*;
public class Button1{
    public static void main (String[] args){
        Button1 gui = new Button1();
        gui.go();
    }
    public void go(){
        JFrame frame = new JFrame();
        JButton East = new JButton("East");
        JButton West = new JButton("West");
        JButton North = new JButton("North");
        JButton South = new JButton("South");
        JButton center = new JButton("Center");
        frame.getContentPane().add(BorderLayout.EAST, East);
        frame.getContentPane().add(BorderLayout.WEST, West);
        frame.getContentPane().add(BorderLayout.NORTH, North);
        frame.getContentPane().add(BorderLayout.SOUTH, South);
        frame.getContentPane().add(BorderLayout.CENTER, center);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}