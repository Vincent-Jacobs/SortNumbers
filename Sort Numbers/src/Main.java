import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		
		System.out.println("Zum starten 'Start' eingeben!");
		
		Scanner s = new Scanner(System.in);
		
		String[] readString = new String [2];
		
		
		readString[0] = s.nextLine();
		if (readString[0] == "Start" || readString[0] == "start" ) {
			System.out.println("Wie viele Stellen?");
			readString[1] = s.nextLine();	
			
			
			
		} else {
			for (int i = 0; i <= readString.length; i++) {
				readString[i] = "";
			}
		}
		
	}
	
	
}
