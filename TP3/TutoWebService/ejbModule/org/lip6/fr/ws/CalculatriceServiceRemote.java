package org.lip6.fr.ws;

import javax.ejb.Remote;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@Remote
@WebService(name="Calculatrice",targetNamespace="http://org.lip6.fr/calculatrice")
public interface CalculatriceServiceRemote {
	
	@WebMethod(action="urn:additionner",operationName="add")
	public @WebResult(name="Resultat")
			double additionner(@WebParam(name="Operande1")
										double operande1,
							   @WebParam(name="Operande2")
										double operande2);
	@WebMethod(action="urn:multiplier",operationName="multiplier")
	public @WebResult(name="Resultat") 
	double multiplier(@WebParam(name="Operande1") double operande1, @WebParam(name="Operande2") double operande2);
}