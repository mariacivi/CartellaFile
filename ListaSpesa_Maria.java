import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class ListaSpesa_Maria {

	private static Scanner in;
	private static Scanner scanner;

	public static void main(String[] args) {

		GregorianCalendar d1 = new GregorianCalendar(2020, 9, 3);
		GregorianCalendar d2 = new GregorianCalendar(2020, 12, 26);

		Alimentari pa1 = new Alimentari(1, "Pasta", 15, d1);
		Alimentari pa2 = new Alimentari(2, "Cioccolata", 22, d2);
		NonAlimentari pn1 = new NonAlimentari(3, "BlockNotes", 20, "carta");
		NonAlimentari pn2 = new NonAlimentari(4, "Barattolo", 25, "vetro");
		NonAlimentari pn3 = new NonAlimentari(5, "Penne", 11, "plastica");

		System.out.println("Cosa hai acquistato ? max 5 (Pasta, Cioccolato, BlockNotes, Barattolo, Penne)");
		try (Scanner n = new Scanner(System.in)) {
			int num = n.nextInt();

			ArrayList<String> prod = new ArrayList<String>();
			for (int i = 0; i < num; i++) {
				System.out.println("Prodotto comperato");
				in = new Scanner(System.in);
				String prodotto = in.nextLine();
				prod.add(prodotto);
			}

			System.out.println("Possedente carta fedeltà ? SI / NO");
			Scanner in1;
			setScanner(in1 = new Scanner(System.in));
			String ok = in1.nextLine();
			if (ok.equalsIgnoreCase("SI")) {
				int totale = 0;
				for (int i = 0; i < prod.size(); i++) {
					if (prod.get(i).equalsIgnoreCase(pa1.getDescrizione())) {
						totale = totale + pa1.applicaSconto();
						;
					} else if (prod.get(i).equalsIgnoreCase(pa2.getDescrizione())) {
						totale = totale + pa2.applicaSconto();
						;
					} else if (prod.get(i).equalsIgnoreCase(pn1.getDescrizione())) {
						totale = totale + pn1.applicaSconto();
						;
					} else if (prod.get(i).equalsIgnoreCase(pn2.getDescrizione())) {
						totale = totale + pn2.applicaSconto();
						;
					} else if (prod.get(i).equalsIgnoreCase(pn3.getDescrizione())) {
						totale = totale + pn3.applicaSconto();
						;
					} else {
						System.out.println("Seguente articolo " + i + "non rilevato");
					}
				}
				System.out.println("Applicato lo sconto il totale è di : " + totale);
			} else {
				int totale = 0;
				for (int i = 0; i < prod.size(); i++) {
					if (prod.get(i).equalsIgnoreCase(pa1.getDescrizione())) {
						totale = totale + pa1.getPrezzo();
					} else if (prod.get(i).equalsIgnoreCase(pa2.getDescrizione())) {
						totale = totale + pa2.getPrezzo();
					} else if (prod.get(i).equalsIgnoreCase(pn1.getDescrizione())) {
						totale = totale + pn1.getPrezzo();
					} else if (prod.get(i).equalsIgnoreCase(pn2.getDescrizione())) {
						totale = totale + pn2.getPrezzo();
					} else {
						System.out.println("Articolo " + i + "non rilevato");
					}
				}
				System.out.println("Prezzo da pagare non avendo lo sconto = " + totale);
			}
		}
	}

	public static Scanner getScanner() {
		return scanner;
	}

	public static void setScanner(Scanner scanner) {
		ListaSpesa_Maria.scanner = scanner;
	}
}