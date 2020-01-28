package edunova.primjer;

//apstrakna klasa je ona klasa koja nema implementaciju
//aplstrakne klase se sastoje od zajedničkih djelova svih podklasa koje ju nasljeđuju
//ali samostalno mena smisla
public abstract class Zivotinja {
	
	private int tezina;
	


	public Zivotinja() {
		System.out.println("Prazan konstruktor Životinja");
	}

	public Zivotinja(int tezina) {
		System.out.println("Puni konstruktor Životinja");
		this.tezina = tezina;
	}

	public int getTezina() {
		return tezina;
	}

	public void setTezina(int tezina) {
		this.tezina = tezina;
	}
	

}
