package edunova;

import javax.swing.JOptionPane;

public class TryCatch {

	public TryCatch() {
		try {
			//uvijek se izvodi try dio
			System.out.println("----------");
		int i = Integer.parseInt(JOptionPane.showInputDialog("broj"));
		System.out.println("++++++++++++++");
		}catch(NumberFormatException e) {
			//ako se dogodi deklarirana iznimka obrađuje se u njegovom tijelu
			System.out.println("Nisi dao broj");
		}finally {
			//on se zvodi bez obzira dogodila se iznimka ili ne
			System.out.println("****************");
		}
	}
	
	public static void main(String[] args) {
		new TryCatch();
	}
}
