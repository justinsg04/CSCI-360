import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginFrame extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public loginFrame() {
        // Set up the JFrame
        setTitle("Login Form");
        setBackground(Color.ORANGE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 235);
        setLayout(null);

        // Create components
        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");
        usernameField = new JTextField();
        passwordField = new JPasswordField();
        JButton loginButton = new JButton("Login");
        JButton createAccountButton = new JButton("Create Account");

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Action when login button is clicked
                String username = usernameField.getText();
                char[] password = passwordField.getPassword();
            }
        });

        createAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Action when create account button is clicked
              
            }
        });

        // Set bounds
        usernameLabel.setBounds(20, 20, 80, 25);
        passwordLabel.setBounds(20, 50, 80, 25);
        usernameField.setBounds(120, 20, 200, 25);
        passwordField.setBounds(120, 50, 200, 25);
        loginButton.setBounds(145, 90, 100, 25);
        createAccountButton.setBounds(120, 130, 150, 25);

        // Add components to the JFrame
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);
        add(createAccountButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new loginFrame();
            }
        });
    }
}
