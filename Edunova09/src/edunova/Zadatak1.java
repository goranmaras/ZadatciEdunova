package edunova;

import javax.swing.JOptionPane;

public class Zadatak1 {
	
	//program unosi 2 broja i sipisuje njihov zbroj
	
	public Zadatak1() {
		System.out.println(ucitajBroj("1. broj") + ucitajBroj("2. broj"));
	}
	
	private int ucitajBroj(String uputa) {
		for(;;) {
			try {
				return Integer.parseInt(JOptionPane.showInputDialog(uputa));
			} catch (Exception e) {
				JOptionPane.showConfirmDialog(null, "nije cjeli broj");
			}
		}
	}

	public static void main(String[] args) {
		new Zadatak1();
	}

}
