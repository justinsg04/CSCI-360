import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlightSelectionUI extends JFrame {
    private JComboBox<String> startAirportComboBox;
    private JComboBox<String> destAirportComboBox;
    private JComboBox<String> planeTypeComboBox;

    public FlightSelectionUI() {
        // Set up the JFrame
        setTitle("Flight Selection");
        setBackground(Color.ORANGE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new GridLayout(4, 2, 10, 10));

        // Create components
        JLabel startAirportLabel = new JLabel("Starting Airport:");
        JLabel destAirportLabel = new JLabel("Destination Airport:");
        JLabel planeTypeLabel = new JLabel("Plane Type:");

        startAirportComboBox = new JComboBox<>(new String[]{"Airport A", "Airport B", "Airport C"});
        destAirportComboBox = new JComboBox<>(new String[]{"Airport X", "Airport Y", "Airport Z"});
        planeTypeComboBox = new JComboBox<>(new String[]{"Type 1", "Type 2", "Type 3"});

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                submitButtonClicked();
            }
        });

        // Add components to the JFrame
        add(startAirportLabel);
        add(startAirportComboBox);
        add(destAirportLabel);
        add(destAirportComboBox);
        add(planeTypeLabel);
        add(planeTypeComboBox);
        add(new JLabel()); // Empty label for spacing
        add(submitButton);

        // Set JFrame visibility
        setVisible(true);
    }

    private void submitButtonClicked() {
        String startAirport = (String) startAirportComboBox.getSelectedItem();
        String destAirport = (String) destAirportComboBox.getSelectedItem();
        String planeType = (String) planeTypeComboBox.getSelectedItem();

        // Perform action with the selected values (e.g., print them)
        System.out.println("Start Airport: " + startAirport);
        System.out.println("Destination Airport: " + destAirport);
        System.out.println("Plane Type: " + planeType);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FlightSelectionUI();
            }
        });
    }
}
