package ButtonsAndListeners;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Rayyan Shariff
 * 
 */
public class Calculator extends JFrame implements ActionListener {
	// Declaration
	private JLabel display;
	private JPanel panel;
	private JTextField input;
	private JButton clr, add, sub, mult, div;
	private JButton[] buttons = { clr, add, sub, mult, div };
	private String[] stringButton = { "CLR", "+", "-", "*", "/" };
	private double acc = 0, num2 = 0;

	// Constructor
	public Calculator() {

		setLayout(new GridLayout(3, 1)); // JFrame
		panel = new JPanel(new FlowLayout(FlowLayout.LEFT)); // JPanel

		display = new JLabel("" + acc, JLabel.RIGHT);
		add(display); // adds panel to the frame

		input = new JTextField();
		input.setHorizontalAlignment(JTextField.RIGHT); // sets the alignment of text to the right
		input.addActionListener(this);
		add(input); // adds panel to the frame

		arrangeButtons();
		add(panel); // adds panel to the frame

	}

	public JButton setUpButton(String s) {
		JButton setButtons = new JButton(s);
		setButtons.setBackground(Color.white);
		setButtons.addActionListener(this);
		return setButtons;
	}

	public void arrangeButtons() {
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = setUpButton(stringButton[i]);
			panel.add(buttons[i]);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (input.getText().length() == 0) // checks if the TextField is empty or not and sets the num2 = 0 if empty
			num2 = 0; //num2 is the textfield value and if its empty, then a null value be stored in the double 
		else
			num2 = Double.valueOf(input.getText());

		if (e.getSource() == buttons[0]) { //Clicking the “clear” button, set the accumulator value to 0
			// clr
			acc = 0;
		}
		if (e.getSource() == buttons[1]) { //Clicking the “+” button, add the text field value to the accumulator value
			// add
			acc = acc + num2;
		} 
		else if (e.getSource() == buttons[2]) { //Clicking the “-” button, subtract the text field value from the accumulator value
			// subtract
			acc = acc - num2;
		} 
		else if (e.getSource() == buttons[3]) { //Clicking the “*” button, multiply the accumulator value by the text fieldvalue
			// multiply
			acc = acc * num2;
		} 
		else if (e.getSource() == buttons[4]) {//Clicking the “/” button, divide the accumulator value by the text fieldvalue
			// divide
			acc = acc / num2;
		}

		display.setText("" + acc); //After a button has been pressed, updates the display label with the new accumulator value 
		input.setText(""); //and empty's the text field.
	}

}
