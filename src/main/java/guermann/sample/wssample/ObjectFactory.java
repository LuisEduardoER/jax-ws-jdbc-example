
package guermann.sample.wssample;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the guermann.sample.wssample package. 
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

    private final static QName _GetAvailableMemorySizeResponse_QNAME = new QName("http://wssample.sample.guermann/", "getAvailableMemorySizeResponse");
    private final static QName _GetAvailableMemorySize_QNAME = new QName("http://wssample.sample.guermann/", "getAvailableMemorySize");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: guermann.sample.wssample
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAvailableMemorySizeResponse }
     * 
     */
    public GetAvailableMemorySizeResponse createGetAvailableMemorySizeResponse() {
        return new GetAvailableMemorySizeResponse();
    }

    /**
     * Create an instance of {@link GetAvailableMemorySize }
     * 
     */
    public GetAvailableMemorySize createGetAvailableMemorySize() {
        return new GetAvailableMemorySize();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAvailableMemorySizeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wssample.sample.guermann/", name = "getAvailableMemorySizeResponse")
    public JAXBElement<GetAvailableMemorySizeResponse> createGetAvailableMemorySizeResponse(GetAvailableMemorySizeResponse value) {
        return new JAXBElement<GetAvailableMemorySizeResponse>(_GetAvailableMemorySizeResponse_QNAME, GetAvailableMemorySizeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAvailableMemorySize }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wssample.sample.guermann/", name = "getAvailableMemorySize")
    public JAXBElement<GetAvailableMemorySize> createGetAvailableMemorySize(GetAvailableMemorySize value) {
        return new JAXBElement<GetAvailableMemorySize>(_GetAvailableMemorySize_QNAME, GetAvailableMemorySize.class, null, value);
    }

}
