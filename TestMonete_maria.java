public class TestMonete {
	public static void main(String args[]) {
		Moneta monetaDaVentiCentesimi = new Moneta(20);
		Moneta monetaDaUnCentesimo = new Moneta(1);
		Moneta monetaDaUnEuro = new Moneta(100);
// Creaiamo un portamonete con 11 monete
		PortaMonete portaMoneteInsufficiente = new PortaMonete(2, 5, 100, 10, 50, 10, 100, 200, 10, 5, 2);
// Creaiamo un portamonete con 8 monete
		PortaMonete portaMonete = new PortaMonete(2, 5, 100, 10, 50, 10, 100, 200);
		portaMonete.stato();
// Aggiungiamo una moneta da 20 centesimi
		portaMonete.aggiungi(monetaDaVentiCentesimi);
// Aggiungiamo la decima moneta da 1 centesimo.
		portaMonete.aggiungi(monetaDaUnCentesimo);
// Aggiungiamo l'undicesima moneta (dovremmo ottenere un
// errore e la moneta non sarà aggiunta)
		portaMonete.aggiungi(monetaDaUnEuro);
// Valutiamo lo stato del portamonete.
		portaMonete.stato();
// preleviamo 20 centesimi
		portaMonete.preleva(monetaDaVentiCentesimi);
// Aggiungiamo l'undicesima moneta (dovremmo ottenere un
// errore e la moneta non sarà aggiunta)
		portaMonete.aggiungi(monetaDaUnEuro);
		portaMonete.stato();
//Cerchiamo una moneta non esistente (dovremmo ottenere una
// stampa di errore)
		portaMonete.preleva(new Moneta(7));
	}
}

