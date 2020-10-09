public class PortaMonete {
	private final Moneta[] monete = new Moneta[10];

	public PortaMonete(int... valori) {
		int numeroMonete = valori.length;
		for (int i = 0; i < numeroMonete; i++) {
			if (i >= 10) {
				System.out.println("Al momento abbiamo solo le prime 10 monete!");
				break;
			}
			monete[i] = new Moneta(valori[i]);
		}
	}

	public void aggiungi(Moneta moneta) {
		System.out.println("Ammettendo che abbia una moneta da aggiungere " + moneta.getDescrizione());
		int indiceVuoto = primoIndiceVuoto();
		if (indiceVuoto == -1) {
			System.out.println("Siamo al limite. Non posso aggiungere la  " + moneta.getDescrizione());
		} else {
			monete[indiceVuoto] = moneta;
			System.out.println("Ho aggiunto una  " + moneta.getDescrizione());
		}
	}

	private int primoIndiceVuoto() {
		int indice = -1;
		for (int i = 0; i < 10; i++) {
			if (monete[i] == null) {
				indice = i;
				break;
			}
		}
		return indice;
	}

	public void stato() {
		System.out.println("Al momento abbiamo: ");
		for (Moneta moneta : monete) {
			if (moneta == null) {
				break;
			}
			System.out.println("Una " + moneta.getDescrizione());
		}
	}

	public Moneta preleva(Moneta moneta) {
		System.out.println("voglio prendere una  " + moneta.getDescrizione());
		Moneta monetaTrovata = null;
		int indiceMonetaTrovata = indiceMonetaTrovata(moneta);
		if (indiceMonetaTrovata == -1) {
			System.out.println("Moneta inesistente!");
		} else {
			monetaTrovata = moneta;
			monete[indiceMonetaTrovata] = null;
			System.out.println("Una " + moneta.getDescrizione() + " è stata tolta");
		}
		return monetaTrovata;
	}

	private int indiceMonetaTrovata(Moneta moneta) {
		int indiceMonetaTrovata = -1;
		for (int i = 0; i < 10; i++) {
			if (monete[i] == null) {
				break;
			}
			int valoreMonetaNelPortaMoneta = monete[i].getValore();
			int valore = moneta.getValore();
			if (valore == valoreMonetaNelPortaMoneta) {
				indiceMonetaTrovata = i;
				break;
			}
		}
		return indiceMonetaTrovata;
	}
}
