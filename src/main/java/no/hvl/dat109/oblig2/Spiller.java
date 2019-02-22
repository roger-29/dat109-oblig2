package no.hvl.dat109.oblig2;

class Spiller {

	private String navn;
	private Integer verdi;

	public Spiller(String navn) {
		this.navn = navn;
	}

	public void spill(Kopp kopp) {
		kopp.trill();
		this.verdi = kopp.getSum();
	}

	public int getVerdi() {
		return this.verdi;
	}

	public String getName() {
		return this.navn;
	}
}
