package org.lessons.java;
import java.util.Scanner;

public class CheckGuest {
	public static void main(String[] args) {
		String[] guestList = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual è il tuo nome?");
		String userName = scanner.nextLine();
		
		boolean isInvited = false;
		
		for (int i = 0; i < guestList.length; i++) {
			if(guestList[i].equals(userName)) {
				isInvited = true;
				break;
			}
		}
		
		if(isInvited) {
			System.out.println("sei invitato");
		} else {
			System.out.println("non puoi entrare");
		}
		
		scanner.close();
	}
}
