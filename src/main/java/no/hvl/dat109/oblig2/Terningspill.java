package no.hvl.dat109.oblig2;

import java.util.ArrayList;

class Terningspill {

	private int id;
	private ArrayList<Spiller> spillere;
	private Kopp kopp;

	public Terningspill() {
		spillere = new ArrayList<Spiller>();
		this.kopp = new Kopp(0);
	}

	public void leggTilSpiller(String navn) {
		Spiller spiller = new Spiller(navn);

		spillere.add(spiller);
	}

	public Spiller spill() {
		// Gjennomfør spill
		for (Spiller spiller : spillere) {
			spiller.spill(kopp);
		}
		
		// Finn resultat
		Spiller vinner = null;
		for (Spiller spiller : spillere) {
			if (vinner == null || spiller.getVerdi() > vinner.getVerdi()) {
				vinner = spiller;
			}
		}

		return vinner;
	}

	public int antallSpillere() {
		return this.spillere.size();
	}

	public ArrayList<Spiller> getSpillere() {
		return this.spillere;
	}
}
