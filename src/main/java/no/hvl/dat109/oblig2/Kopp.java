package no.hvl.dat109.oblig2;

import java.util.ArrayList;

class Kopp {

	private Integer id;
	private Integer sum;

	private ArrayList<Terning> terninger;

	public Kopp(int id) {
		this.id = id;
		this.terninger = new ArrayList<Terning>();

		for (int i = 0; i < 2; i++) {
			Terning terning = new Terning(i);
			this.terninger.add(terning);
		}
	}

	public void trill() {
		for (Terning terning : terninger) {
			terning.trill();
		}
	}

	public int getSum() {
		int sum = 0;

		for (Terning terning : terninger) {
			sum += terning.getVerdi();
		}

		return sum;
	}
}
