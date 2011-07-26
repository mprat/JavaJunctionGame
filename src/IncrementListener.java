import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class IncrementListener implements ActionListener {
	private JButton myButton = new JButton();
	private int counter = 0;
	
	public IncrementListener(JButton button){
		myButton = button;
	}
	
	public void actionPerformed(ActionEvent e) {
		counter++;
		this.myButton.setText("This button was clicked " + counter + " times");
	}
}
