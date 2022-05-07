
package fr.lip6.org.calculatrice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.lip6.org.calculatrice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MultiplierResponse_QNAME = new QName("http://org.lip6.fr/calculatrice", "multiplierResponse");
    private final static QName _Add_QNAME = new QName("http://org.lip6.fr/calculatrice", "add");
    private final static QName _AddResponse_QNAME = new QName("http://org.lip6.fr/calculatrice", "addResponse");
    private final static QName _Multiplier_QNAME = new QName("http://org.lip6.fr/calculatrice", "multiplier");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.lip6.org.calculatrice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link MultiplierResponse }
     * 
     */
    public MultiplierResponse createMultiplierResponse() {
        return new MultiplierResponse();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link Multiplier }
     * 
     */
    public Multiplier createMultiplier() {
        return new Multiplier();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplierResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.lip6.fr/calculatrice", name = "multiplierResponse")
    public JAXBElement<MultiplierResponse> createMultiplierResponse(MultiplierResponse value) {
        return new JAXBElement<MultiplierResponse>(_MultiplierResponse_QNAME, MultiplierResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.lip6.fr/calculatrice", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.lip6.fr/calculatrice", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiplier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://org.lip6.fr/calculatrice", name = "multiplier")
    public JAXBElement<Multiplier> createMultiplier(Multiplier value) {
        return new JAXBElement<Multiplier>(_Multiplier_QNAME, Multiplier.class, null, value);
    }

}
