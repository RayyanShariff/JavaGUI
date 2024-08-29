package ButtonsAndListeners;
import javax.swing.*;
/**
 * @author  Rayyan Shariff
 * 
 */
public class TestCalculator {
	public static void main(String[] args) {
		Calculator c =  new Calculator();
		c.setTitle("Calculator");
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setVisible(true);
		c.pack();
		c.setResizable(true);
	}
}