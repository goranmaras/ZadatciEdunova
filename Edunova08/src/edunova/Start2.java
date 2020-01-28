package edunova;

import javax.swing.JButton;

public class Start2 {
	
	public static void main(String[] args) {
		Osoba osoba = new Osoba();
		
		
		Predavac predavac = new Predavac();
		
		predavac.setIme("Pero");
		predavac.setIban("123423423");
		System.out.println(predavac);
		
		predavac.pozdravi();
		
		
		
	}

}
