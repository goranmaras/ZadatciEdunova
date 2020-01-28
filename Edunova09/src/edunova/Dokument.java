package edunova;

public abstract class Dokument {

	private int sifra;
	
	public abstract void obradi();
	
	

	public Dokument() {
	}
	
	

	public Dokument(int sifra) {
		this.sifra = sifra;
	}



	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		this.sifra = sifra;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + sifra;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dokument other = (Dokument) obj;
		if (sifra != other.sifra)
			return false;
		return true;
	}
	
	
	
	
	
}
