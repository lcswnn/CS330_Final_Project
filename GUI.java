import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends Keypad implements ActionListener{
	
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	private JTextField jt;
	
	
	public GUI() {
		
		frame = new JFrame();
		
		label = new JLabel("No project started.");
		jt = new JTextField("Enter the last 5 digits of your A-Number", 5);
		jt.addActionListener(new ActionListener()
				{
				@Override
				public void actionPerformed(ActionEvent e) {
					Random rand = new Random();
					Keypad keypad = new Keypad();
					
					
					String input = jt.getText();
					keypad.unlockingCode = Integer.parseInt(input + "1");
					keypad.lockingCode = Integer.parseInt(input + "4");
					
					int count = 0;
					while(true) {
						int randomNumber = rand.nextInt(2099999999);
						if (Integer.toString(randomNumber).contains(Integer.toString(keypad.lockingCode))) {
							status = "lock";
							break;
						}
						if(Integer.toString(randomNumber).contains(Integer.toString(keypad.unlockingCode))) {
							status = "unlock";
							break;
						}
						count = count + 1;
					}
					int minutes = count/60;
					int hours = count/3600;
					label.setText("<html>Status: " + status + "ed.<br> The computer guessed a number combination that " + status + "ed the program."
							+ "<br>It took the computer: " + count + " tries to guess the " + status + " code and therefore would take a hacker " + count + 
							" seconds to " + status + " the program." + "<br>or around " + minutes + " minutes.<br>or around " + hours + " hours.</html>");
					
					
				}
				});
		
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBorder(BorderFactory.createEmptyBorder(200, 200, 100, 200));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(label);
		panel.add(jt);
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("CS330 Final Project");
		frame.setSize(1000, 600);
		frame.setVisible(true);
		
	}

	public static void main(String[] args) {
		new GUI();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	

}
