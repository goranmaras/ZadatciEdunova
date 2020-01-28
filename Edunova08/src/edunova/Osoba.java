package edunova;

// Za svaku klasu koju kreiramo, htjeli to ili ne nasljeđujemo java.lang.Object
//kod nasljeđivanja vidimo javne i zaštićene metode i svojstva
public class Osoba extends Object {
	
	public static int SPOL=1; //mogu mjenjati vrijednost
	
	//konstanta
	public static final int STATUS_OK=2;
	
	protected String ime;

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public static boolean isValjanOIB(String oib) {
	
		 if (oib.length() != 11) {
			 return false;
		 }
	           

	        try {
	            Long.parseLong(oib);
	        } catch (NumberFormatException e) {
	            return false;
	        }

	        int a = 10;
	        for (int i = 0; i < 10; i++) {
	            a = a + Integer.parseInt(oib.substring(i, i+1));
	            a = a % 10;
	            if (a == 0)
	                a = 10;
	            a *= 2;
	            a = a % 11;
	        }
	        int kontrolni = 11 - a;
	        if (kontrolni == 10) {
	        	kontrolni = 0;
	        }
	            

	        return kontrolni == Integer.parseInt(oib.substring(10));
	}
	
	@Override
	public String toString() {
		return getIme();
	}
	
	public void pozdravi() {
		System.out.println("Hello");
	}
	
	//način pristupa package
	void metoda() {
		System.out.println("U metodi sam");
	}

}
