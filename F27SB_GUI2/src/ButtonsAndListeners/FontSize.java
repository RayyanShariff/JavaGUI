package ButtonsAndListeners;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * @author  Rayyan Shariff
 * 
 */
public class FontSize extends JFrame implements ActionListener {
	// Declaration
	private JLabel XLabel, displayNumber;
	private JButton increase, decrease;
	private JPanel upperPanel, lowerPanel;
	private Font initialFont, increasedFont, decreasedFont;
	private int XLabelSize;

	// constructor
	public FontSize() {
		XLabelSize = 18;

		initialFont = new Font("Calibri", Font.PLAIN, XLabelSize); 

		setLayout(new GridLayout(2, 1)); // JFrame

		upperPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

		XLabel = new JLabel("X", JLabel.CENTER);
		XLabel.setFont(initialFont);
		upperPanel.add(XLabel);

		displayNumber = new JLabel("" + XLabelSize, JLabel.CENTER);
		displayNumber.setFont(initialFont);
		upperPanel.add(displayNumber);

		add(upperPanel); // adds panel to the frame
		
		lowerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

		increase = setButton("Increase");
		lowerPanel.add(increase);

		decrease = setButton("Decrease");
		lowerPanel.add(decrease);

		add(lowerPanel); // adds panel to the frame

	}

	public JButton setButton(String s) {
		JButton button = new JButton(s);
		button.setFont(initialFont);
		button.setBackground(Color.white);
		button.addActionListener(this);
		return button;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == increase) { // captures the user input
			XLabelSize++;

			displayNumber.setText("" + XLabelSize);

			increasedFont = new Font("Calibri", Font.PLAIN, XLabelSize);
			XLabel.setFont(increasedFont);
		} 
		else if (e.getSource() == decrease) {
			if (XLabelSize > 0) {
				XLabelSize--;

				displayNumber.setText("" + XLabelSize);

				decreasedFont = new Font("Calibri", Font.PLAIN, XLabelSize);
				XLabel.setFont(decreasedFont);

			}
		}

	}

}
