import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.*;
public class TextDecoration extends JPanel {
  @Override
  protected void paintComponent(Graphics g){
    Graphics2D g2d=(Graphics2D)g;
    g2d.setFont((new Font("poppins",Font.ITALIC,22)));
    g2d.setColor(Color.BLACK);
    g2d.drawString("Java is a programming Language",20,20);
    g2d.drawString("Helloo Everyone!!", 20, 45);
  }
    public static void main(String[]args){
        JFrame frame=new JFrame("Text Decoration");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(new TextDecoration());

    }
}
//Make circle and eclipse.