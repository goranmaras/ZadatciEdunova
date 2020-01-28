package edunova.primjer;

public class Pas extends Sisavac{
	
	private int duzinaDlake;
	
	

	public Pas() {
		super();
		System.out.println("Prazan konstruktor Pas");
	}

	public Pas(int tezina, int vrijemeTrudnoce, int duzinaDlake) {
		super(tezina, vrijemeTrudnoce);
		System.out.println("Puni konstruktor Pas");
		this.duzinaDlake = duzinaDlake;
	}

	public int getDuzinaDlake() {
		return duzinaDlake;
	}

	public void setDuzinaDlake(int duzinaDlake) {
		this.duzinaDlake = duzinaDlake;
	}

}
