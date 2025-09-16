
import javax.swing.*;
public class SwingExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Form");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel nameLabel = new JLabel("Full Name:");
        nameLabel.setBounds(30, 30, 80, 25);
        frame.add(nameLabel);
        JTextField nameField = new JTextField();
        nameField.setBounds(30, 60, 130, 25);
        frame.add(nameField);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(250, 30, 50, 25);
        frame.add(emailLabel);
        JTextField emailField = new JTextField();
        emailField.setBounds(250, 60, 130, 25);
        frame.add(emailField);

        JLabel phoneLabel = new JLabel("Phone:");
        phoneLabel.setBounds(30, 100, 80, 25);
        frame.add(phoneLabel);
        JTextField phoneField = new JTextField();
        phoneField.setBounds(30, 130, 130, 25);
        frame.add(phoneField);

        JLabel courseLabel = new JLabel("Course:");
        courseLabel.setBounds(250, 100, 80, 25);
        frame.add(courseLabel);
        String[] courses = {"","Java", "Python", "Web Development", "Data Science"};
        JComboBox<String> courseBox = new JComboBox<>(courses);
        courseBox.setBounds(250, 130, 130, 25);
        frame.add(courseBox);

        JLabel messageLabel = new JLabel("Message:");
        messageLabel.setBounds(30, 190, 80, 25);
        frame.add(messageLabel);
        JTextArea messageArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(messageArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setBounds(120, 190, 200, 80);
       frame.add(scrollPane);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(150, 280, 100, 30);
        frame.add(submitButton);

     
        frame.setVisible(true);
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