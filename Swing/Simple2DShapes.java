import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Simple2DShapes extends JPanel{
    @Override
     protected void paintComponent(Graphics g){
        //Graphics 2d us a subClass of Graphics class that provide additional
        //  functionality and advanced control over shapes,geometry, layout.
        Graphics2D g2d=(Graphics2D)g;
        g2d.drawRect(50,50,200,100);
     //sets the bg to RED.
        g2d.setColor(Color.BLACK);
        g2d.fillRect(50,50,200,100);
        g2d.drawRect(200,200,150,150);
        g2d.setColor(Color.blue);
        g2d.fillRect(200,200,150,150);

     }
     public static void main(String []args){
      JFrame jFrame=new JFrame("2D shapes");
            jFrame.setVisible(true);
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.add(new Simple2DShapes());
            jFrame.setSize(500,500);
     }

}