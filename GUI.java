import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class GUI extends Keypad{
	
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	private JTextField jt;
	
	
	public GUI() {
		
		frame = new JFrame();
		
		label = new JLabel("No project started.");
		jt = new JTextField("Type Here", 5);
		
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
		
		jt.getDocument().addDocumentListener(new DocumentListener() {
			Keypad keypad = new Keypad();

			@Override
			public void insertUpdate(DocumentEvent e) {
				update();
				
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				update();
				
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				// text wont change this
				
			}
			
			public void update() {
				String code = "";
				String temp = jt.getText();
				int tempLength = temp.length();
				if (temp.length() < 6) {
					code = "000000";
				}
				else {
					code = temp.substring(tempLength - 6, tempLength);
				}
				
				if (code.contains(keypad.lockingCode)) {
					label.setText("Locked.");
					status = "locked";
				}
					
				if (code.contains(keypad.unlockingCode)) {
					label.setText("Unlocked");
					status = "unlocked";
				}
				
			}
			
		});
		
	}

	public static void main(String[] args) {
		new GUI();
	}

}
