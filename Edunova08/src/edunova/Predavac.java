package edunova;

public class Predavac extends Osoba {
	
	private String ime;

	private String iban;

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}
	
	@Override
	public String toString() {
		//return super.ime + " " + this.iban; //ovo se ne preporuča
		return getIme() + " " + getIban();
	}
	
	@Override
	public void pozdravi() {
		System.out.println("Dobar dan");
	}
}
