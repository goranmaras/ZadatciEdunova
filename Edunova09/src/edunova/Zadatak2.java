package edunova;

import javax.swing.JOptionPane;

public class Zadatak2 {
	
	//Kreirajte klasu Osoba s svojstvima sifra int, ime String i placa float
	//Program unosi 10 osoba
	//Program osigurava da se svi podaci moraju unijeti
	//program ispisuje sumu plaća svih osoba
	
	public Zadatak2() {
		Osoba[] osobe = new Osoba[10];
		for(int i=0;i<10;i++){
			osobe[i]=ucitajOsobu(i+1);
		}
		
		JOptionPane.showMessageDialog(null, "Suma placa je "+suma(osobe)+" kn.");
	}
	
	private float suma(Osoba[] osobe) {
		float ukupno=0;
		for (Osoba osoba : osobe) {
			ukupno+=osoba.getPlaca();
		}
		return ukupno;
	}

	private Osoba ucitajOsobu(int i) {
		return new Osoba(ucitajInt("Unesi sifru za osobu " + i),
				ucitajString("Unesi ime za osobu " + i),
				ucitajFloat("Unesi placu za osobu " + i));
	}

	private float ucitajFloat(String string) {
		while(true) {
			try {
				return Float.parseFloat(JOptionPane.showInputDialog(string));
			} catch (Exception e) {
				JOptionPane.showConfirmDialog(null, "Obavezno placu");
			}
		}
	}

	private String ucitajString(String string) {
		String s;
		do {
			s=JOptionPane.showInputDialog(string);
			if(s.length()>0) {
				return s;
			}
			JOptionPane.showConfirmDialog(null, "Obavezno ime");
		}while(true);
	}

	private int ucitajInt(String string) {
		while(true) {
			try {
				return Integer.parseInt(JOptionPane.showInputDialog(string));
			} catch (Exception e) {
				JOptionPane.showConfirmDialog(null, "Obavezno sifru");
			}
		}
	}

	public static void main(String[] args) {
		new Zadatak2();
	}

}
