package no.hvl.dat109.oblig2;

class Terning {

	private Integer id;
	private Integer verdi;

	public Terning(int id) {
		this.id = id;
	}

	public void trill() {
		this.verdi = (int) Math.floor(Math.random() * 5 + 1);
	}

	public int getVerdi() {
		return this.verdi;
	}

	public int getId() {
		return this.id;
	}
}
