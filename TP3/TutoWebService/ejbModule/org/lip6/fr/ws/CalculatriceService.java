package org.lip6.fr.ws;
import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@WebService(targetNamespace="http://org.lip6.fr/calculatrice",endpointInterface="org.lip6.fr.ws.CalculatriceServiceRemote")		
		
public class CalculatriceService implements CalculatriceServiceRemote {

	public double additionner(double operande1, double operande2) {
		
		return operande1 + operande2;
	}
	
	public double multiplier(double operande1, double operande2) {
		
		return operande1 * operande2;
	}
}
