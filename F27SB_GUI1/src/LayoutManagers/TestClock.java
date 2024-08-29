package LayoutManagers;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class TestClock {

	public static void main(String[] args) {
		
		Clock clock = new Clock();
		clock.addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		clock.setSize(400,400);
		clock.setVisible(true);
		clock.setTitle("CLock");
		clock.tick();
		
	}

}
