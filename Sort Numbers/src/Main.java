import java.util.Random;
import java.util.Scanner;

public class Main {
	
	
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		String[] readString = new String [5];
		int[] number = new int [5];
		int numberAmount = 0;
		
		
		System.out.println("Zum starten '1' eingeben! Wenn nicht dann '0'!");
		
		readString[1] = s.nextLine();
		
		number[1] = Integer.parseInt(readString[1]);
		
		
		if (number[1] == 1) {
			System.out.println("Wie viele Zahlen?");
			readString[2] = s.nextLine();
			number[2] = Integer.parseInt(readString[2]);
			
			if (number[2] == 0) {
				System.out.println("Dann eben nicht!");
				
			} else {
				startMain(number[2]);
				
 				/*readString[3] = s.nextLine();
 				number[3] = Integer.parseInt(readString[3]);
 				if (number[3] == 1) {
 					
 					
 				}*/
 				
 				
			}
		} else {
			for (int i = 0; i <= readString.length; i++) {
				readString[i] = "";
			}
			System.out.println("Nothing");
		}
		
	}
	
	
	public static void startMain(int numberAmount) {
		System.out.println("Main Methode wurde ausgefuehrt mit " + numberAmount);
		int[] rdmNumber = new int[numberAmount + 1];
		int[] finalOrder = new int[numberAmount + 1];
		

		
		for (int i = 0; i <= numberAmount; i++) {
			Random random = new Random();
			rdmNumber[i] = random.nextInt(numberAmount);
			
			System.out.println("Nummer " + i + " " + rdmNumber);
		}
		
		System.out.println(numberAmount + " Zahlen wurden generriert!");
		
		
		int j = 0;
		int firstNumber = 0;
		
		
		while (j != numberAmount) {
			for (int i = 0; i < numberAmount; i++) {
				if (rdmNumber[firstNumber] < rdmNumber[i + 1]) {
					finalOrder[j] = rdmNumber[firstNumber];
					
					
					
					
				} else {
					finalOrder[j] = rdmNumber[i + 1];
				}
			}
			
			
			
			System.out.println("Final Number: (" + j +") " + finalOrder[j]);
			finalOrder[j] = rdmNumber[j];
			j++;
			firstNumber++;
		}
		
		

		
		
		
	}
	
}
