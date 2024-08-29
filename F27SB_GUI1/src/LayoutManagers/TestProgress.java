package LayoutManagers;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestProgress {

	public static void main(String[] args) {
		ProgressBar progressBar = new ProgressBar();
		
		progressBar.addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		progressBar.setSize(150,750);
		progressBar.setVisible(true);
		progressBar.setTitle("Progress Bar");
		progressBar.update();
		

	}

}
