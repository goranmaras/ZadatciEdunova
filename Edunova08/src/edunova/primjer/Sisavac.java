package edunova.primjer;

public class Sisavac extends Zivotinja {
	
	private int vrijemeTrudnoce;
	
	
	

	public Sisavac() {
		super();
		System.out.println("Prazan konstruktor Sisavac");
	}

	public Sisavac(int tezina, int vrijemeTrudnoce) {
		super(tezina); // ovo mora biti prva linija - ako će se koristiti
		System.out.println("Puni konstruktor Sisavac");
		//setTezina(tezina); OVO NE RADITI već pozvati konstruktor od nadklase
		this.vrijemeTrudnoce = vrijemeTrudnoce;
	}

	public int getVrijemeTrudnoce() {
		return vrijemeTrudnoce;
	}

	public void setVrijemeTrudnoce(int vrijemeTrudnoce) {
		this.vrijemeTrudnoce = vrijemeTrudnoce;
	}

}
