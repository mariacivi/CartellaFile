public class Prodotti {
	private int codiceBarre;// codice a barre
	private String descrizione;// descrizione
	private int prezzo;// prezzo

	public Prodotti(int codiceBarre, String descrizione, int prezzo) {
		super();
		this.codiceBarre = codiceBarre;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
	}

	public int getCode() {
		return codiceBarre;
	}

	public void setCode(int code, int codiceBarre) {
		this.codiceBarre = codiceBarre;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}

	public int applicaSconto() {
		int sconto = (this.prezzo * 5) / 100;
		return (this.prezzo - sconto);
	}

	public String toString() {
		return getDescrizione() + getCode();
	}

	public boolean equals(Prodotti a, Prodotti b) {
		if (a.getCode() == b.getCode()) {
			return true;
		} else
			return false;
	}

}
