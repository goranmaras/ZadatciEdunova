package edunova;

public class StartJednako {
	
	public StartJednako() {
		
		Racun r1=new Racun(1,"Edunova");
		r1.setIznos(100);
		Racun r2=new Racun(2,"Edunova");
		r2.setIznos(100);
	
		System.out.println(r1.hashCode());
		System.out.println(r2.hashCode());
		System.out.println(r1.equals(r2));
		
		
		System.out.println(r1.getSifra()==r2.getSifra());
		
	}
	
	
	public static void main(String[] args) {
		new StartJednako();
	}

}
