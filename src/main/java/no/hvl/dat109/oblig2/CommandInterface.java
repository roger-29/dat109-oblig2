package no.hvl.dat109.oblig2;

import java.util.Scanner;
import java.util.ArrayList;

class CommandInterface {

	public static void printInfo(String info) {
		System.out.println("\n" + info);
		return;
	}

	public static void printSpillerList(ArrayList<Spiller> list) {
		for (Spiller s : list) {
			try { Thread.sleep(1500L); } catch (Exception e) { }
			
			System.out.format(" - %-15s | Poengsum %3d", s.getName(), s.getVerdi());
			System.out.print("\n");
		}
		try { Thread.sleep(1500L); } catch (Exception e) { }
	}

	public static String doPromptString(String question) {

		// Lukker aldri Scanner for å unngå å lukke System.in
		Scanner scanner = new Scanner(System.in);

		System.out.println("\n" + question);

		String navn = scanner.nextLine();

		return navn;
	}
}
