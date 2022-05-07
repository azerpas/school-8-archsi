package service;
import javax.jws.WebService;

@WebService(targetNamespace="http://org.lip6.fr/calculatrice",endpointInterface="service.CalculateInterface")        
public class CalculateService implements CalculateInterface{
    @Override
    public double additionner(double operande1, double operande2) {
        
        return operande1 + operande2;
    }
    @Override
    public double multiplier(double operande1, double operande2) {
        
        return operande1 * operande2;
    }
}
