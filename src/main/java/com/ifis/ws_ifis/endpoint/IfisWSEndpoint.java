package com.ifis.ws_ifis.endpoint;

import com.ifis.ws_ifis.wsdl.generated.*;
import jakarta.xml.bind.JAXBElement;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;

import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class IfisWSEndpoint {

    private static final String NAMESPACE_URI = "http://trafficcontrol.com.ec";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "consultaOrden")
    @ResponsePayload
    public JAXBElement<ConsultaOrdenResponse> consultaOrden(@RequestPayload JAXBElement<ConsultaOrden>  request) {
        ObjectFactory factory = new ObjectFactory();
        JAXBElement<ConsultaOrdenResponse>  response = factory.createConsultaOrdenResponse(new ConsultaOrdenResponse());
        response.getValue().setResultado("Consulta procesada para: " + request.getValue().getNumeroidentificacion());
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "pagoOrden")
    @ResponsePayload
    public JAXBElement<PagoOrdenResponse> pagoOrden(@RequestPayload JAXBElement<PagoOrden> request) {
        ObjectFactory factory = new ObjectFactory();
        JAXBElement<PagoOrdenResponse> response = factory.createPagoOrdenResponse (new PagoOrdenResponse());
        response.getValue().setResultado("Pago procesado: $" + request.getValue().getValor());
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "reversoPago")
    @ResponsePayload
    public JAXBElement<ReversoPagoResponse> reversoPago(@RequestPayload JAXBElement<ReversoPago> request) {
        ObjectFactory factory = new ObjectFactory();
        JAXBElement<ReversoPagoResponse> response = factory.createReversoPagoResponse(new ReversoPagoResponse());
        response.getValue().setResultado("Reverso realizado para: " + request.getValue().getCodigotransaccion());
        return response;
    }

}
