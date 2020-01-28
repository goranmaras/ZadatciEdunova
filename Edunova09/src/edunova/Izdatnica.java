package edunova;

public class Izdatnica extends Dokument {
	
	private String djelatnik;
	
	

	public Izdatnica() {
		super();
	}
	
	



	public Izdatnica(int sifra, String djelatnik) {
		super(sifra);
		this.djelatnik = djelatnik;
	}





	@Override
	public void obradi() {
		System.out.println("Izdajem opremu pod rednim brojem " + getSifra() + 
				" za djelatnika " + getDjelatnik());

	}



	public String getDjelatnik() {
		return djelatnik;
	}



	public void setDjelatnik(String djelatnik) {
		this.djelatnik = djelatnik;
	}

}
