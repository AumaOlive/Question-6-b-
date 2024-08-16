/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package auma.multiplicationgui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class MultiplicationGUI extends JFrame {

    // Declare components
    private JTextField number1Field;
    private JTextField number2Field;
    private JButton multiplyButton;
    private JLabel resultLabel;

    // Constructor to set up the GUI
    public MultiplicationGUI() {
        // Set up the frame
        setTitle("Multiplication Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Initialize components
        number1Field = new JTextField();
        number2Field = new JTextField();
        multiplyButton = new JButton("Multiply");
        resultLabel = new JLabel("Result: ");

        // Set bounds for components
        number1Field.setBounds(50, 30, 80, 25);
        number2Field.setBounds(150, 30, 80, 25);
        multiplyButton.setBounds(50, 70, 180, 25);
        resultLabel.setBounds(50, 110, 200, 25);

        // Add components to frame
        add(number1Field);
        add(number2Field);
        add(multiplyButton);
        add(resultLabel);

        // ActionListener for the multiply button
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Parse numbers from text fields
                    double num1 = Double.parseDouble(number1Field.getText());
                    double num2 = Double.parseDouble(number2Field.getText());

                    // Calculate the product
                    double product = num1 * num2;

                    // Display the result
                    resultLabel.setText("Result: " + product);
                } catch (NumberFormatException ex) {
                    // Handle invalid number format
                    resultLabel.setText("Please enter valid numbers.");
                }
            }
        });
    }

    // Main method to launch the GUI
    public static void main(String[] args) {
        // Create and display the GUI
        MultiplicationGUI gui = new MultiplicationGUI();
        gui.setVisible(true);
    }
}

