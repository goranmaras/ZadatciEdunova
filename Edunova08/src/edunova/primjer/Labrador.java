package edunova.primjer;

public class Labrador extends Pas {

	private String boja;
	
	
	

	public Labrador() {
		super();
		System.out.println("Prazan konstruktor labrador");
	}

	public Labrador(int tezina, int vrijemeTrudnoce, int duzinaDlake, String boja) {
		super(tezina, vrijemeTrudnoce, duzinaDlake);
		System.out.println("Puni konstruktor Labrador");
		this.boja = boja;
	}

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}
}
