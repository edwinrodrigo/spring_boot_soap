
package com.ifis.ws_ifis.wsdl.generated;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ifis.ws_ifis.wsdl.generated package. 
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

    private final static QName _ConsultaOrden_QNAME = new QName("http://trafficcontrol.com.ec", "consultaOrden");
    private final static QName _ConsultaOrdenResponse_QNAME = new QName("http://trafficcontrol.com.ec", "consultaOrdenResponse");
    private final static QName _PagoOrden_QNAME = new QName("http://trafficcontrol.com.ec", "pagoOrden");
    private final static QName _PagoOrdenResponse_QNAME = new QName("http://trafficcontrol.com.ec", "pagoOrdenResponse");
    private final static QName _ReversoPago_QNAME = new QName("http://trafficcontrol.com.ec", "reversoPago");
    private final static QName _ReversoPagoResponse_QNAME = new QName("http://trafficcontrol.com.ec", "reversoPagoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ifis.ws_ifis.wsdl.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultaOrden }
     * 
     */
    public ConsultaOrden createConsultaOrden() {
        return new ConsultaOrden();
    }

    /**
     * Create an instance of {@link ConsultaOrdenResponse }
     * 
     */
    public ConsultaOrdenResponse createConsultaOrdenResponse() {
        return new ConsultaOrdenResponse();
    }

    /**
     * Create an instance of {@link PagoOrden }
     * 
     */
    public PagoOrden createPagoOrden() {
        return new PagoOrden();
    }

    /**
     * Create an instance of {@link PagoOrdenResponse }
     * 
     */
    public PagoOrdenResponse createPagoOrdenResponse() {
        return new PagoOrdenResponse();
    }

    /**
     * Create an instance of {@link ReversoPago }
     * 
     */
    public ReversoPago createReversoPago() {
        return new ReversoPago();
    }

    /**
     * Create an instance of {@link ReversoPagoResponse }
     * 
     */
    public ReversoPagoResponse createReversoPagoResponse() {
        return new ReversoPagoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaOrden }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaOrden }{@code >}
     */
    @XmlElementDecl(namespace = "http://trafficcontrol.com.ec", name = "consultaOrden")
    public JAXBElement<ConsultaOrden> createConsultaOrden(ConsultaOrden value) {
        return new JAXBElement<ConsultaOrden>(_ConsultaOrden_QNAME, ConsultaOrden.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaOrdenResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaOrdenResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://trafficcontrol.com.ec", name = "consultaOrdenResponse")
    public JAXBElement<ConsultaOrdenResponse> createConsultaOrdenResponse(ConsultaOrdenResponse value) {
        return new JAXBElement<ConsultaOrdenResponse>(_ConsultaOrdenResponse_QNAME, ConsultaOrdenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PagoOrden }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PagoOrden }{@code >}
     */
    @XmlElementDecl(namespace = "http://trafficcontrol.com.ec", name = "pagoOrden")
    public JAXBElement<PagoOrden> createPagoOrden(PagoOrden value) {
        return new JAXBElement<PagoOrden>(_PagoOrden_QNAME, PagoOrden.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PagoOrdenResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PagoOrdenResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://trafficcontrol.com.ec", name = "pagoOrdenResponse")
    public JAXBElement<PagoOrdenResponse> createPagoOrdenResponse(PagoOrdenResponse value) {
        return new JAXBElement<PagoOrdenResponse>(_PagoOrdenResponse_QNAME, PagoOrdenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReversoPago }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReversoPago }{@code >}
     */
    @XmlElementDecl(namespace = "http://trafficcontrol.com.ec", name = "reversoPago")
    public JAXBElement<ReversoPago> createReversoPago(ReversoPago value) {
        return new JAXBElement<ReversoPago>(_ReversoPago_QNAME, ReversoPago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReversoPagoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReversoPagoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://trafficcontrol.com.ec", name = "reversoPagoResponse")
    public JAXBElement<ReversoPagoResponse> createReversoPagoResponse(ReversoPagoResponse value) {
        return new JAXBElement<ReversoPagoResponse>(_ReversoPagoResponse_QNAME, ReversoPagoResponse.class, null, value);
    }

}
