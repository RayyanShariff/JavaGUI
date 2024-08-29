package LayoutManagers;


import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.util.Calendar;

public class Clock extends JFrame{
	//Declaration
	private Font F = new Font("Serif", Font.ITALIC, 36);
	private JLabel HH, MM, SS, AM_PM;
	private JPanel display;
	private int hours, minutes, seconds, ampm;
	
	public Clock(){

		setLayout(new GridLayout(2,1)); //makes a JFrame layout of 2 rows and 1 columns
		display = new JPanel(new GridLayout(1,3)); //Panel with 1 row and 3 columns
		
		HH = new JLabel("HH", JLabel.CENTER); //Its a layout for JLabel and and aligns it to the center
		HH.setFont(F);
		display.add(HH); //adding JLabel to panel 
		
		MM = new JLabel("MM", JLabel.CENTER);
		MM.setFont(F);
		display.add(MM);
		
		SS = new JLabel("SS", JLabel.CENTER);
		SS.setFont(F);
		display.add(SS);
		
		add(display); //adds the panel to the JFrame 
		
		AM_PM = new JLabel("AM_PM", JLabel.CENTER); 
		AM_PM.setFont(F);
		add(AM_PM); //adds label to the JFrame directly
	}
	
	// this method updates the current time
	public void tick() {
		
		while(true) { 
			
			Calendar c = Calendar.getInstance(); //create Calendar object for current date/time
			hours = c.get(Calendar.HOUR); //gets the current time in hours
			minutes = c.get(Calendar.MINUTE); //gets the current time in minutes
			seconds = c.get(Calendar.SECOND); //gets the current time in second
			ampm = c.get(Calendar.AM_PM); //Its an integer value that returns 0 if its am and 1 if its pm
			
			
			HH.setText(Integer.toString(hours) + ":"); //updates the hour JLabel value 
			MM.setText(Integer.toString(minutes) + ":");  //updates the min JLabel value 
			SS.setText(Integer.toString(seconds)); //updates the sec JLabel value 
			
			if (ampm == Calendar.AM) //if ampm = 0 then AMPM label is updated to AM
				AM_PM.setText("AM");
			
			else
				AM_PM.setText("PM");
			pause(500); // pauses every 500ms to make the program more efficient and to avoid it from crashing
		}
	}
	
	public void pause(long ms) {
		long time = Calendar.getInstance().getTimeInMillis(); //gets the current time in ms
		while((Calendar.getInstance().getTimeInMillis() - time) < ms); //ms = 500
		
	}
}
