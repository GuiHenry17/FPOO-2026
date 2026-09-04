package aula01;

import java.util.Scanner;

public class AppCounter {
	
	private Scanner scanner = new Scanner(System.in);

	private boolean goAgain() {
		System.out.println("Count Again (Y/N)?");
		
		String answer = scanner.nextLine();
		return "Y".equalsIgnoreCase(answer);
	}
	
	private int readInt(String message) {
		System.out.print(message);
		int value = scanner.nextInt();
		scanner.nextLine();
		return value;
	}
	
	private void run() {
		
		System.out.println("Counter Application");
		do {
			int start = readInt("Start: ");
			int end   = readInt("End: ");
			int step  = readInt("Step: ");
			
			Counter counter = new Counter(start, end, step);
			counter.count();
			counter.countDown();
		} while(goAgain());
	}
	
	public static void main(String[] args) {
		
		AppCounter app = new AppCounter();
		app.run();
	}
}
