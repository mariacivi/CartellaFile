public class NonAlimentari extends Prodotti {

	private String materiale;
	private static final String carta = "carta";
	private static final String vetro = "vetro";
	private static final String plastica = "plastica";

	public NonAlimentari(int codiceBarre, String descrizione, int prezzo, String materiale) {
		super(codiceBarre, descrizione, prezzo);
		this.materiale = materiale;

	}

	@Override
	public int applicaSconto() {
		int sconto;
		if (materiale.equalsIgnoreCase("carta") || materiale.equalsIgnoreCase("vetro")
				|| materiale.equalsIgnoreCase("plastica")) {
			sconto = (getPrezzo() * 10) / 100;
			return (getPrezzo() - sconto);
		} else
			return getPrezzo();
	}

	public static String getCarta() {
		return carta;
	}

	public static String getVetro() {
		return vetro;
	}

	public static String getPlastica() {
		return plastica;
	}
}