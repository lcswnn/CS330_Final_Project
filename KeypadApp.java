import java.util.Random;

public class KeypadApp {
	
	public int lockingCode;
	public int unlockingCode;
	
	public KeypadApp() {
		lockingCode = 810831;
		unlockingCode = 810834;
	}
	
	public static void main(String[] args) {
		long startTime = System.nanoTime(); //Millisecond timer for program run time
		Random rand = new Random();
		KeypadApp keypad = new KeypadApp();
		int count = 0; //counter for hacker time-to-hack
		
		while(true) {
			int randomNumber = rand.nextInt(2099999999);
			//if (Integer.toString(randomNumber).contains(Integer.toString(keypad.lockingCode))) {
			//	System.out.println("Locked.");
			//	break;
			//}
			if(Integer.toString(randomNumber).contains(Integer.toString(keypad.unlockingCode))) {
				System.out.println("Unlocked.");
				break;
			}
			count = count + 1;
			
		}
		//Testing Time it takes to run/for someone to find codes to unlock
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println("It took: " + totalTime/1000000 + " milliseconds to run the program and crack the code.");
		System.out.println("It would take a hacker: " + count + " seconds to unlock the code.");
		int minutes = count/60;
		System.out.println("or around " + minutes + " minutes.");
		int hours = count/3600;
		System.out.println("or around " + hours + " hours.");
		
	}

}
