package edunova;

public class Racun extends Dokument {
	
	private String kupac;
	private float iznos;
	
	

	public Racun() {
		super();
	}
	
	

	public Racun(int sifra, String kupac) {
		super(sifra);
		this.kupac = kupac;
	}



	@Override
	public void obradi() {
		System.out.println("Izdajem račun " + getSifra() + " za " + getKupac());	
	}

	public String getKupac() {
		return kupac;
	}

	public void setKupac(String kupac) {
		this.kupac = kupac;
	}


	public float getIznos() {
		return iznos;
	}



	public void setIznos(float iznos) {
		this.iznos = iznos;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(iznos);
		result = prime * result + ((kupac == null) ? 0 : kupac.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Racun other = (Racun) obj;
		if (Float.floatToIntBits(iznos) != Float.floatToIntBits(other.iznos))
			return false;
		if (kupac == null) {
			if (other.kupac != null)
				return false;
		} else if (!kupac.equals(other.kupac))
			return false;
		return true;
	}
	
	
	

}
