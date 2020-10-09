import java.util.Scanner;

import service.PersonaService;
import service.impl.PersonaServiceImpl;

public class TestPersona {

	public static void main(String[] args) {
		PersonaService personaService = new PersonaServiceImpl();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("SCRIVI IL NOME:");
		String name = scanner.nextLine();
		
		System.out.println("SCRIVI IL COGNOME:");
		String cognome = scanner.nextLine();
		
		personaService.createPersona(name, cognome);
	}
	
}
