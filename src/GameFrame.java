import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class GameFrame extends JFrame{
	
	//do not touch
	private static final long serialVersionUID = 1L;
	
	
	//create components in the frame
	private JLabel label = new JLabel("This is a test label.");
	private JButton oneButton = new JButton("This is a button.");
		
	
	public GameFrame(){
		//make your own title
		super("This is a frame");
		
		//modify the components
		label.setForeground(Color.BLUE);
		oneButton.addActionListener(new IncrementListener(oneButton));
		
		
		//add the components to the frame
		this.getContentPane().add(label, BorderLayout.CENTER);
		this.getContentPane().add(oneButton, BorderLayout.SOUTH);
		
		//do not touch this
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
	
	//MAIN METHODSimpleFrame
	public static void main(String[] args) {
		GameFrame test = new GameFrame();
	}
}