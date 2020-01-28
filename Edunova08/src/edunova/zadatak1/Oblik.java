package edunova.zadatak1;

import edunova.Osoba;

public class Oblik {
	
	private int opseg;

	public int getOpseg() {
		
		Osoba osoba = new Osoba();
		//osoba.metoda(); //metoda je package način pristupa (ništa ne piše)
		
		return opseg;
	}

	public void setOpseg(int opseg) {
		this.opseg = opseg;
	}

}
