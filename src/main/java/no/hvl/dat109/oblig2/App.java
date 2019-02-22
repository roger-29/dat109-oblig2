package no.hvl.dat109.oblig2;

import static no.hvl.dat109.oblig2.CommandInterface.*;
 
public class App {

    public static void main(String[] args) {
		printInfo("\nVelkommen til Terningspillet! 🎲\n");
		
		Terningspill terningspill = new Terningspill();

		printInfo("Legg til spillere ved å skrive navnet og trykke enter.");
		printInfo("Når du er ferdig; trykk enter uten å skrive inn noe.\n");

		terningspill.spill();

		boolean ferdig = false;

		while (!ferdig) {
			String navn = doPromptString("Skriv inn navn på spiller:");

			if (navn.length() < 1 && terningspill.antallSpillere() < 2) {
				printInfo("Legg til minst 2 spillere");
			} else if (navn.length() < 1) {
				ferdig = true;
			} else {
				terningspill.leggTilSpiller(navn);
			}	
		}

		int antallSpillere = terningspill.antallSpillere();
		printInfo("La til " + antallSpillere + (antallSpillere > 1 ? " spillere 🚀" : " spiller 🚀"));


		Spiller vinner = terningspill.spill();

		printInfo("Her er resultatene:");

		printSpillerList(terningspill.getSpillere());

		printInfo("Vinner er " + vinner.getName() + "! 🎉");
    }
}
