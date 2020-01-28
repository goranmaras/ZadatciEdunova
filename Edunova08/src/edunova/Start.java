package edunova;

import javax.swing.JOptionPane;

public class Start {

	public static void main(String[] args) {
		Osoba osoba = new Osoba();
		osoba.setIme("Pero");
		
		Osoba[] osobe = new Osoba[2];
		osobe[0] = osoba;
		
		osoba = new Osoba();
		osoba.setIme("Marko");
		osobe[1]=osoba;
		
		for(Osoba o: osobe) {
			System.out.println(o.getIme());
		}
		
		System.out.println(Osoba.class);
		
		// statična metoda se koristi bez kreiranje nove instance
		System.out.println(Osoba.isValjanOIB("67135201394"));
		
		//osoba.isValjanOIB(""); // ne možemo zvati statičnu metodu na instanci klase
		
		System.out.println(Osoba.SPOL);
		Osoba.SPOL=2;
		System.out.println(Osoba.SPOL);
		
		System.out.println(Osoba.STATUS_OK);
		//Osoba.STATUS=3; // ne može se mijenjati final svojstvo
		JOptionPane.showConfirmDialog(null,"poruka","naslov",JOptionPane.YES_NO_OPTION);
		
		
		osoba.metoda();
	}
}
