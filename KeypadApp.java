import java.util.Random;

public class KeypadApp {
	
	public int lockingCode;
	public int unlockingCode;
	
	public KeypadApp() {
		lockingCode = 810831;
		unlockingCode = 810834;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		KeypadApp keypad = new KeypadApp();
		int count = 0;
		
		while(true) {
			int randomNumber = rand.nextInt(2099999999);
			System.out.println(randomNumber);
			//if (Integer.toString(randomNumber).contains(Integer.toString(keypad.lockingCode))) {
			//	System.out.println("Locked.");
			//	break;
			//}
			if(Integer.toString(randomNumber).contains(Integer.toString(keypad.unlockingCode))) {
				System.out.println("Unlocked.");
				break;
			}
			
			
		}
		
		
		
	
	}

}
