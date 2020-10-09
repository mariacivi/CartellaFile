import java.util.GregorianCalendar;

/**
 * @author acerMaria
 *
 */
public class Alimentari extends Prodotti {
	private GregorianCalendar data;

	public Alimentari(int codiceBarre, String descrizione, int prezzo, GregorianCalendar data) {
		super(codiceBarre, descrizione, prezzo);
		this.data = data;
	}

	@Override
	public int applicaSconto() {
		GregorianCalendar date = new GregorianCalendar();
		long milliseconds1 = date.getTimeInMillis();
		long milliseconds2 = data.getTimeInMillis();
		long diff = milliseconds2 - milliseconds1;
		long diffDays = diff / (24 * 60 * 60 * 1000);
		int sconto;
		if (diffDays <= 30) {
			sconto = (getPrezzo() * 20) / 100;
			return (getPrezzo() - sconto);
		} else
			return getPrezzo();
	}
}
