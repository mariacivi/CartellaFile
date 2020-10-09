public class Moneta {
// Valuta come costante impostata al valore EURO.
	public final static String VALUTA = "EURO";
// Valore della moneta in centesimi.
	private int valore;

//Costruttore che prende in input il valore della moneta.
	public Moneta(int valore) {
		this.valore = valore;
		System.out.println("Questa nuova moneta vale  " + formattaUnitaDiMisura(valore) + VALUTA);
	}

	private static String formattaUnitaDiMisura(int valore) {
		String stringaFormattata = " centesimi di ";
		if (valore == 1) {
			stringaFormattata = " centesimo di ";
		} else if (valore > 99) {
			stringaFormattata = " ";
			valore /= 100;
		}
		return valore + stringaFormattata;
	}

//Variabile d'istanza valore.
	public void setValore(int valore) {
		this.valore = valore;
	}

//Restituisce il valore della variabile d'istanza valore.
	public int getValore() {
		return valore;
	}

	public String getDescrizione() {
		String descrizione = "Moneta da  " + (valore) + VALUTA;
		return descrizione;
	}
}