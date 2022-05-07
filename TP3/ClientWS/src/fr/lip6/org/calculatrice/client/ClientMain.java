package fr.lip6.org.calculatrice.client;

import fr.lip6.org.calculatrice.Calculatrice;
import fr.lip6.org.calculatrice.CalculatriceServiceService;

public class ClientMain {

	public static void main(String[] args) {

		CalculatriceServiceService service = new CalculatriceServiceService();
		Calculatrice calculatrice = service.getCalculatriceServicePort();
		            
		System.out.println(calculatrice.add(2,33));
    }
}    