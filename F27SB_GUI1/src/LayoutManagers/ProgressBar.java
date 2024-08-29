package LayoutManagers;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.Scanner;
import java.awt.GridLayout;
import java.awt.Color;

public class ProgressBar extends JFrame {

	//Declaration
	private JLabel L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, percentageBar;
	private Font f = new Font("Serif", Font.ITALIC, 36);
	private Scanner scan = new Scanner(System.in);
	private JLabel[] labels = { L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, };
	private int percentage = 0;

	public ProgressBar() {
		setLayout(new GridLayout(11, 1)); //creating a JFrame of 11 rows and 1 column
		settingLabels();

		percentageBar = new JLabel("0%", JLabel.CENTER);
		percentageBar.setFont(f);
		percentageBar.setOpaque(true);
		add(percentageBar);

	}

	public JLabel labelCreator() {
		JLabel label = new JLabel(); //Initializing the labels
		label.setBackground(Color.RED);
		label.setOpaque(true);

		return (label);
	}

	public void settingLabels() {
		for (int i = 0; i < labels.length; i++) {
			labels[i] = labelCreator();
			add(labels[i]); //each index of the label is added into the rows of the JFrame
		}

	}

	public void update() { // updates the values of progressbar

		// for loop created to implement users input action
		for (int i = 0; i < labels.length; i++) {
			scan.nextLine();// waits for the user to press enter
			percentage += 10; //p=p+10
			labels[i].setBackground(Color.GREEN); // color of each label starting from index[0] is changed to green
			labels[i].setOpaque(true);
			percentageBar.setText(percentage + "%"); //Updates the percentage bar
		}
	}
}
