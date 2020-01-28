package edunova;

public class Start {
	
	public Start() {
		Dokument[] dokumenti = new Dokument[2];
		
		Racun racun = new Racun(1,"Edunova");
		dokumenti[0]=racun;
		
		Izdatnica izdatnica = new Izdatnica(2,"Marija Zimska");
		
		dokumenti[1]=izdatnica;
		
		obradiDokumente(dokumenti);
		
		//ovdje kreira novi i doda ga
		
	}
	
	
	
	
	
	private void obradiDokumente(Dokument[] dokumenti) {
		
		for(Dokument d : dokumenti) {
			//polimorfizam (višeobličje)
			d.obradi();
		}
		
	}

	public static void main(String[] args) {
		new Start();
	}

}
