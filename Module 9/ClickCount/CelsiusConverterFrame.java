/*
  Nestor J Alvarez
  CS 111B, Prof. Jason Schatz
  20150405
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CelsiusConverterFrame extends JFrame {

   private final double CELSIUS_TO_F_MULTIPLIER = 1.8;
   private final double CELSIUS_TO_F_CONSTANT = 32;
	private double fahrenheit;
	private JLabel label;

	public CelsiusConverterFrame() {
		super("Celsius Converter");
		this.setSize(250, 100);
		this.setLocation(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());

		// Initialize the instance variables
		fahrenheit = 0;
		label = new JLabel();
		this.updateLabelText();

		// Create a button
		JTextField celsiusTextField = new JTextField(10);
		JButton convert = new JButton("Convert");

		//Add the needed fields and set them using the default FlowLayout
		this.getContentPane().add(celsiusTextField);
		this.getContentPane().add(convert);
		this.getContentPane().add(label);

		//Listener provided by Jason Schatz via Download
      //Modified to convert values

		convert.addActionListener(new ActionListener() {
      //I am to assume the tester is friendly and just puts numeric values.
      //I wanted to do the usual, low-level attempt to restrict values, but...
      //restricting values in a textField seems to take quite a bit of coding
      //As seen from a few searches from the Internet. 

						public void actionPerformed(ActionEvent e) {
							String input = celsiusTextField.getText();
                     fahrenheit = Double.parseDouble(input) * CELSIUS_TO_F_MULTIPLIER + CELSIUS_TO_F_CONSTANT;
							updateLabelText();
						}
      });

							

	}

	private void updateLabelText() {
		String labelText = "Degrees Fahrenheit: " + String.format("%.2f", fahrenheit);
		this.label.setText(labelText);
	}

}





