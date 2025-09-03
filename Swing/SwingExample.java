
import javax.swing.JFrame;
import javax.swing.JLabel;
public class SwingExample {
    public static void main(String[]args){
        JFrame jFrame=new JFrame("Frame Example");
        jFrame.setSize(500,500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        JLabel jLabel=new JLabel("Java is a programming Language");
      
        jLabel.setBounds(100,70,300,50);
        jFrame.add(jLabel);
        //jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       // jFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
//TextField
//PasswordField
//Radio button
//Button
//Checkbox
//Dialog box
//Textarea
//Select option