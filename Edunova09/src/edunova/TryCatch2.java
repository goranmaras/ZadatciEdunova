package edunova;

import javax.swing.JOptionPane;

public class TryCatch2 {
	
	public TryCatch2() {
		
		int[] niz = new int[2];
		
		try {
			
			niz[2]=Integer.parseInt(JOptionPane.showInputDialog("broj"));
			
		} catch (NumberFormatException e) {
			System.out.println("Nije broj");
		}catch (Exception e) {
			System.out.println("Nemam pojma što je uzrokovalo grešku. "
					+ "Možda pomogne: " + e.getClass().toString() + " - " +  e.getMessage());
		}
		
		
	}
	
	public static void main(String[] args) {
		new TryCatch2();
	}

}
