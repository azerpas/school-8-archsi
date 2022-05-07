package service.publish;

import javax.xml.ws.Endpoint;
import service.CalculateInterface;
import service.CalculateService;



public class CalculatricePublish {

    /**
     * @param args
     */
    public static void main(String[] args) {
        CalculateService calImpl=new CalculateService();
        //cette intruction a pour but de publier/deployer votre WS
        Endpoint.publish("http://localhost:8088/calculatricebIS4", calImpl);
        
        //après avoir lancé ce main, aller sur eclipse/Run/Launch the web service explorer
        //en haut à droite , cliquer sur l'icône wsdl page
        //dans la fenetre open wsdl, tapez dans le champs de texte wsdl url: http://localhost:8088/calculatricebIS4?wsdl
        //tester votre web service!
    }
}
