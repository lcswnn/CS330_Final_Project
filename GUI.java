import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI extends KeypadApp implements ActionListener{
	
	private int count = 0;
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	
	
	public GUI() {
		
		frame = new JFrame();
		
		JButton button = new JButton("Click to Run");
		label = new JLabel("No project started.");
		
		
		
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBorder(BorderFactory.createEmptyBorder(200, 200, 100, 200));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(label);
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("CS330 Final Project");
		frame.setSize(1000, 1000);
		frame.setVisible(true);
		
		
		
	}

	public static void main(String[] args) {
		new GUI();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		long startTime = System.nanoTime();
		Random rand = new Random();
		KeypadApp keypad = new KeypadApp();
		
		while(true) {
			int randomNumber = rand.nextInt(2099999999);
			//if (Integer.toString(randomNumber).contains(Integer.toString(keypad.lockingCode))) {
			//	status = "Locked";
			//	break;
			//}
			if(Integer.toString(randomNumber).contains(Integer.toString(keypad.unlockingCode))) {
				status = "Unlocked";
				break;
			}
			count = count + 1;
		}
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		int minutes = count/60;
		int hours = count/3600;
		frame.pack();
		label.setText("<html>Status: " + status + ".<br>It took: " + totalTime/1000000 + " milliseconds to run the program.<br>It would take a hacker: " 
				+ count + " tries and therefore " + count + " seconds to unlock the code."
					+ "<br>or around " + minutes + " minutes.<br>or around " + hours + " hours.</html>");
		
		
	}
	
	

}
