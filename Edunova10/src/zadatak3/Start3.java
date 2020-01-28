package zadatak3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Start3 {

	List<Opcina> opcine;
	Scanner scanner = new Scanner(System.in);

	public Start3() {

		opcine = new ArrayList<>();
		unos();
		ispis();
	}

	private void ispis() {
		for(int i = 0;i<opcine.size();i++) {
		System.out.println(opcine.get(i).getZupanija().getNaziv()+" zupanija, opcine "+
		opcine.get(i).getNaziv()+", za vladara ima "+opcine.get(i).getZupanija().getZupan()+"a.");
		}
	}

	private void unos() {
		String unos;
		Opcina opcina;
		Zupanija zupanija;
		while (true) {
			zupanija = new Zupanija();
			zupanija.setNaziv(unesiNazivZupanije());
			zupanija.setZupan(UnesiZupana());

			opcina = new Opcina();
			opcina.setZupanija(zupanija);
			opcina.setNaziv(unesinazivOpcine());
			opcine.add(opcina);

			System.out.println("Za kraj unesite X >");
			unos = scanner.next();
			if (unos.trim().toLowerCase().equals("x")) {
				System.out.println("Svi unosi su odradjeni");
				System.out.println();
				return;
			}

		}

	}

	private String unesinazivOpcine() {
		String unos ;
		do {
		System.out.println("Unesite naziv opcine (unos mora biti slovima) > ");
		unos = scanner.nextLine();
		}while(!unos.matches("^[A-Za-z ]+$"));
		
		
		return unos;
	}

	private String UnesiZupana() {
		String unos ;
		do {
		System.out.println("Unesite naziv zupana (unos mora biti slovima) > ");
		unos = scanner.nextLine();
		}while(!unos.matches("^[A-Za-z ]+$"));
		
		
		return unos;
	}

	private String unesiNazivZupanije() {
		String unos ;
		do {
			
		System.out.println("Unesite naziv zupanije (unos mora biti slovima) > ");
		unos = scanner.nextLine();
		}while(!unos.matches("^[A-Za-z -]+$"));
		
		
		return unos;
	}

	public static void main(String[] args) {
		new Start3();
	}

}
